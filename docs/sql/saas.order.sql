drop table if exists ota_order_master;
create table ota_order_master (
 si_orderno varchar(30) not null comment '订单号',
 si_orderno_ota varchar(50) not null comment 'ota订单号',
 nl_merchant_id bigint unsigned not null comment '商户Id',
 nl_channel_id bigint unsigned not null comment '渠道Id',
 ts_play datetime not null comment '游玩日期',
 ni_status tinyint not null comment '支付状态：0-未支付,1-已支付',
 ni_amt_settle decimal(11,2) not null comment '订单金额(结算价)',
 ni_amt_sell decimal(11,2) not null comment '订单金额(售卖价)',
 ts_create_time datetime not null comment '创建时间',
primary key (si_orderno),
index idx_connect(nl_merchant_id,nl_channel_id),
index idx_order(si_orderno_ota,ts_create_time)
)Engine=INNODB charset=utf8 comment 'ota订单主表';


drop table if exists ota_order_product;
create table ota_order_product (
 nl_detail_id bigint unsigned not null comment '清单Id',
 si_orderno varchar(30) not null comment '订单号',
 nl_product_id bigint unsigned not null comment '产品Id',
 ni_product_count int not null comment '购买数量',
 ni_price_settle decimal(11,2) not null comment '单价(结算价)',
 ni_price_sell decimal(11,2) not null comment '单价((结算价)',
 ts_create_time datetime not null comment '创建时间',
primary key (nl_detail_id),
index idx_connect(si_orderno,nl_product_id)
)Engine=INNODB charset=utf8 comment 'ota产品清单';

drop table if exists ota_order_customer;
create table ota_order_customer (
 nl_customer_id bigint unsigned not null comment '订单游客Id',
 si_orderno varchar(30) not null comment '订单号',
 si_name varchar(50) not null comment '姓名',
 si_phone varchar(30) default null comment '手机号',
 si_idcard varchar(50) default null comment '证件号',
 ts_create_time datetime not null comment '创建时间',
primary key (nl_customer_id),
index idx_connect(si_orderno,si_idcard,ts_create_time)
)Engine=INNODB charset=utf8 comment 'ota订单游客信息';


drop table if exists ota_log_master;
create table ota_log_master (
 nl_log_id bigint unsigned not null comment '请求Id',
 nl_merchant_id bigint unsigned not null comment '商户Id',
 si_ota_account varchar(30) not null comment 'ota账号',
 si_req_time varchar(50) not null comment '请求时间戳',
 si_req_nonce varchar(50) not null comment '请求随机数',
 si_req_method varchar(50) not null comment '请求接口',
 ni_rsp_status tinyint not null comment '响应结果：1-成功,2-验证失败,3-接口异常',
 ts_create_time datetime not null comment '创建时间',
primary key (nl_log_id),
index idx_connect(nl_merchant_id,si_ota_account,ni_rsp_status),
index idx_req(si_req_time,si_req_nonce),
index idx_query(ts_create_time)
)Engine=INNODB charset=utf8 comment 'ota请求记录';

drop table if exists ota_log_content;
create table ota_log_content (
 nl_log_id bigint unsigned not null comment '请求Id', 
 sl_req_content text not null comment '请求内容',
 sl_rsp_content text not null comment '响应内容',
 sl_log text not null comment '接口内部日志内容',
primary key (nl_log_id)
)Engine=INNODB charset=utf8 comment 'ota请求记录内容';

drop table if exists ota_log_order;
create table ota_log_order (
 nl_log_id bigint unsigned not null comment '请求Id',
 si_orderno_ota varchar(50) not null comment 'ota订单号', 
 si_orderno varchar(30) default null comment '系统订单号', 
primary key (nl_log_id),
index idx_query(si_orderno_ota)
)Engine=INNODB charset=utf8 comment 'ota请求记录订单关联';


drop table if exists order_recode_master;
create table order_recode_master (
 nl_recode_id bigint unsigned not null comment '记录Id',
 si_orderno varchar(30) not null comment '订单号',
 nl_merchant_id bigint unsigned not null comment '商户Id',
 nl_channel_id bigint unsigned not null comment '渠道Id',
 ni_recode_type tinyint unsigned not null comment '操作类型：1-创建,20-支付,30-反审,40-修改,60-核销,70-退票',
 ts_create_time datetime not null comment '创建时间',
 ni_create_user varchar(20) not null comment '操作人',
 ni_remark varchar(200) default null comment '操作备注',
primary key (nl_recode_id),
index idx_connect(si_orderno),
index idx_order(nl_merchant_id,nl_channel_id,ni_recode_type,ts_create_time)
)Engine=INNODB charset=utf8 comment '订单记录表';

drop table if exists order_recode_ecode;
create table order_recode_ecode (
 nl_detail_id bigint unsigned not null comment '记录明细Id',
 nl_recode_id bigint unsigned not null comment '记录Id',
 si_orderno varchar(30) not null comment '订单号',
 si_ecode varchar(30) not null comment '凭证码',
 nl_product_id bigint unsigned not null comment '产品Id',
 ni_recode_type tinyint unsigned not null comment '操作类型：1-创建,20-支付,30-反审,40-修改,60-核销,70-退票',
 ts_create_time datetime not null comment '创建时间',
 ni_create_user varchar(20) not null comment '操作人',
 ni_remark varchar(200) default null comment '操作备注',
primary key (nl_recode_id),
index idx_connect(nl_recode_id,si_orderno),
index idx_order(si_ecode,ni_recode_type,ts_create_time)
)Engine=INNODB charset=utf8 comment '订单凭证码记录表';


drop table if exists order_recode_check;
create table order_recode_check (
 nl_check_id bigint unsigned not null comment '记录Id',
 nl_merchant_id bigint unsigned not null comment '商户Id', 
 si_orderno varchar(30) not null comment '订单号',
 si_ecode varchar(30) not null comment '凭证码',
 ni_qty_check int not null comment '核销数量',
 ts_check_time datetime not null comment '核销时间',
 ni_check_terminal varchar(50) default null comment '核销终端',
 ni_check_type tinyint default '1' comment '核销类型：1-取票核销,2-闸机核销',
 ni_remark varchar(200) default null comment '操作备注',
primary key (nl_check_id),
index idx_connect(nl_merchant_id,ni_check_type),
index idx_order(si_orderno,si_ecode,ts_check_time)
)Engine=INNODB charset=utf8 comment '核销记录表';


drop table if exists order_refund_master;
create table order_refund_master (
 nl_refund_id bigint unsigned not null comment '记录Id',
 si_orderno varchar(30) not null comment '退款订单号',
 si_orderno_origin varchar(30) not null comment '退款原单号',
 nl_merchant_id bigint unsigned not null comment '商户Id',
 nl_channel_id bigint unsigned not null comment '渠道Id',
 ni_amt decimal(11,2) not null comment '退款金额',
 ni_channel tinyint not null comment '订单来源',
 ni_type tinyint not null comment '退款类型：0-普通退款,1-强制退款',
 ni_status tinyint not null comment '审核状态：0-待审核,1-审核通过，2-审核不通过',
 ts_req_time datetime not null comment '申请时间',
 ts_rsp_time datetime not null comment '审核时间',
 ni_req_user varchar(20) not null comment '申请人',
 ni_req_remark varchar(200) default null comment '申请备注',
 ni_rsp_user varchar(20) not null comment '审核人',
 ni_rsp_remark varchar(200) default null comment '审核备注',
primary key (nl_refund_id),
index idx_connect(si_orderno,si_orderno_origin),
index idx_order(nl_merchant_id,ni_status,ts_req_time)
)Engine=INNODB charset=utf8 comment '退款记录主表';

drop table if exists order_refund_detail;
create table order_refund_detail (
 nl_detail_id bigint unsigned not null comment '记录明细Id',
 nl_refund_id bigint unsigned not null comment '记录Id',
 si_orderno varchar(30) not null comment '退款订单号', 
 si_ecode varchar(30) not null comment '凭证码',
 nl_product_id bigint unsigned not null comment '产品Id', 
 ni_product_price decimal(11,2) not null comment '退款单价',
 ni_product_qty int default '0' comment '退款数量',
 ni_product_amt decimal(11,2) default '0' comment '退款金额',
primary key (nl_detail_id),
index idx_connect(nl_refund_id,si_orderno)
)Engine=INNODB charset=utf8 comment '退款记录明细表';


drop table if exists order_ecode;
create table order_ecode (
 si_ecode varchar(30) not null comment '凭证码',
 si_orderno varchar(30) not null comment '订单号',
 nl_merchant_id bigint unsigned not null comment '商户Id',
 nl_customer_id bigint unsigned not null comment '订单游客Id',
 ni_qty_order int not null comment '购买数量',
 nl_product_id bigint not null comment '产品id',
 ni_channel tinyint not null comment '订单来源',
 si_offline_code varchar(20) not null comment '线下编码',
 ts_create_time datetime not null comment '创建时间',
 ts_effective_st datetime not null comment '生效时间',
 ts_effective_et datetime not null comment '失效时间', 
primary key (si_ecode),
index idx_connect(nl_merchant_id),
index idx_order(si_orderno,nl_customer_id,ni_channel,ts_create_time,nl_product_id)
)Engine=INNODB charset=utf8 comment '凭证码表';


drop table if exists order_ecode_sync;
create table order_ecode_sync (
 si_ecode varchar(30) not null comment '凭证码',
 nl_merchant_id bigint unsigned not null comment '商户Id',
 ni_sync_offline tinyint not null comment '同步线下状态：0-未同步,1-已同步',
 ni_sync_ota tinyint not null comment '同步ota状态：0-无需同步,1-未同步,2-已同步',  
index idx_connect(si_ecode),
index idx_order(nl_merchant_id)
)Engine=INNODB charset=utf8 comment '凭证码同步表';

drop table if exists order_ecode_properties;
create table order_ecode_properties (
 si_ecode varchar(30) not null comment '凭证码',
 nl_merchant_id bigint unsigned not null comment '商户Id', 
 nl_channel_id bigint unsigned default null comment '渠道Id', 
 ni_qty_use int default '0' comment '已核销数量',
 ni_qty_refund_normal int default '0' comment '普通退款数量',
 ni_qty_refund_force int default '0' comment '强制退款数量',
 ni_code_status tinyint default '0' comment '凭证码状态：0-未支付,10-已支付,20-已核销,30-已退款,40-已作废', 
 ni_status_ticket tinyint default '0' comment '是否取票',
 ni_status_check tinyint default '0' comment '是否核销',
 ts_time_ticket datetime default null comment '取票时间',
 ts_time_check datetime default null comment '最新核销时间',
index idx_connect(si_ecode),
index idx_order(nl_merchant_id,nl_channel_id,ni_code_status)
)Engine=INNODB charset=utf8 comment '凭证码同步表';
