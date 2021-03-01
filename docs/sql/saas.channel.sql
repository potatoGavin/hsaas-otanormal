
-- 运营相关表


drop table if exists ops_channel_protocol;
create table ops_channel_protocol (
 nl_protocol_id bigint unsigned not null comment '协议Id',
 nl_merchant_id bigint unsigned not null comment '商户Id',
 nl_channel_id bigint unsigned not null comment '渠道Id',
 si_merchant_contact_name varchar(20) not null comment '景区联系人',
 si_merchant_contact_phone varchar(20) not null comment '景区联系电话',
 si_channel_contact_name varchar(20) not null comment '渠道联系人',
 si_channel_contact_phone varchar(20) not null comment '渠道联系电话',
 ts_effective_st datetime not null comment '生效时间',
 ts_effective_et datetime not null comment '失效时间',
 is_enabled tinyint unsigned not null comment '是否启用',
 is_deleted tinyint unsigned default '0' comment '是否删除',
 si_remark varchar(100) default null comment '备注',
 si_create_user varchar(20)not null comment '创建人',
 ts_create_time datetime not null comment '创建时间',
 si_update_user varchar(20) not null comment '更新人',
 si_update_time datetime not null comment '更新时间',
primary key (nl_protocol_id),
index idx_connect(nl_merchant_id,nl_channel_id)
)Engine=INNODB charset=utf8 comment '渠道合作协议表';

drop table if exists ops_channel_finance;
create table ops_channel_finance (
 nl_protocol_id bigint unsigned not null comment '协议Id',
 nl_merchant_id bigint unsigned not null comment '商户Id',
 nl_channel_id bigint unsigned not null comment '渠道Id',
 ni_amount_balance decimal(11,2) unsigned not null comment'账户余额',
 ni_amount_creditline decimal(11,2) unsigned not null comment'信用额度',
 ni_amount_occupation decimal(11,2) unsigned not null comment'占用金额',
 ni_status tinyint unsigned not null comment'账户状态：0-禁用，1-正常',
 is_enabled tinyint unsigned not null comment '是否启用',
 is_deleted tinyint unsigned default '0' comment '是否删除',
 si_remark varchar(100) default null comment '备注',
 si_create_user varchar(20) not null comment '创建人',
 ts_create_time datetime not null comment '创建时间',
 si_update_user varchar(20) not null comment '更新人',
 si_update_time datetime not null comment '更新时间',
primary key (nl_protocol_id),
index idx_connect(nl_merchant_id,nl_channel_id)
)Engine=INNODB charset=utf8 comment '渠道财务协议表';


drop table if exists ops_channel_finance_deal;
create table ops_channel_finance_deal (
 nl_occupation_id bigint unsigned not null comment '消费Id',
 nl_merchant_id bigint unsigned not null comment '商户Id',
 nl_channel_id bigint unsigned not null comment '渠道Id',
 ni_occupation_type tinyint unsigned not null comment '订单类型：21-ota,22-旅行社',
 ni_amount decimal(11,2) not null comment'消费金额',
 si_orderno varchar(30) not null comment '订单号',
 ni_deal_type tinyint unsigned not null comment'消费类型：1-占用，2-支付,3-释放,4-退款',
 ts_create_time datetime not null comment '消费时间',
 si_remark varchar(100) default null comment '备注', 
primary key (nl_occupation_id),
index idx_connect(nl_merchant_id,nl_channel_id)
)Engine=INNODB charset=utf8 comment '渠道订单消费统计';

drop table if exists ops_channel_finance_detail;
create table ops_channel_finance_detail (
 nl_occupation_detail bigint unsigned not null comment '明细Id',
 nl_merchant_id bigint unsigned not null comment '商户Id',
 nl_channel_id bigint unsigned not null comment '渠道Id',
 nl_occupation_id bigint unsigned not null comment '消费Id',
 si_orderno varchar(30) not null comment '订单号',
 si_ecode varchar(30) not null comment '电子票号',
 nl_product bigint unsigned not null comment'产品Id',
 ni_price decimal(11,2) unsigned not null comment'产品单价',
 ni_count int unsigned not null comment'产品数量', 
 ni_amount decimal(11,2) not null comment'消费金额', 
 ts_create_time datetime not null comment '消费时间',
 si_remark varchar(100) default null comment '备注', 
primary key (nl_occupation_detail),
index idx_connect(nl_merchant_id,nl_channel_id),
index idx_order(nl_occupation_id,si_orderno)
)Engine=INNODB charset=utf8 comment '渠道订单消费明细';
