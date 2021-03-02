
-- 系统产品相关表

drop table if exists ops_product;
create table ops_product (
 nl_product_id bigint unsigned not null comment '产品Id',
 ni_product_code int unsigned not null comment '产品编码',
 nl_merchant_id bigint unsigned not null comment '所属商户Id',
 si_product_name varchar(50) not null comment '产品名称',
 si_offline_code varchar(20) not null comment '线下编码',
 ni_price_ticket decimal(11,2) unsigned not null comment'票面价',
 is_enabled tinyint unsigned not null comment '是否启用',
 is_deleted tinyint unsigned default '0' comment '是否删除',
 si_remark varchar(100) default null comment '备注',
 si_create_user varchar(20) not null comment '创建人',
 ts_create_time datetime not null comment '创建时间',
 si_update_user varchar(20) not null comment '更新人',
 si_update_time datetime not null comment '更新时间',
primary key (nl_product_id),
index idx_connect(si_offline_code,si_product_name),
unique key udk_code(nl_merchant_id,ni_product_code)
)Engine=INNODB charset=utf8 comment '基础产品库';

drop table if exists ops_product_sell;
create table ops_product_sell (
 nl_product_id int unsigned not null comment '产品Id',
 ni_product_code int unsigned not null comment '产品编码',
 nl_merchant_id bigint unsigned not null comment '所属商户Id',
 si_product_name varchar(50) not null comment '产品名称',
 si_offline_code varchar(20) not null comment '线下编码',
 ni_price_ticket decimal(11,2) unsigned not null comment'票面价', 
 ni_price_sell decimal(11,2) unsigned not null comment'售卖价', 
 ts_effective_st datetime not null comment '生效时间',
 ts_effective_et datetime not null comment '失效时间',
 is_deleted tinyint unsigned default '0' comment '是否删除',
 si_remark varchar(100) default null comment '备注',
 si_create_user varchar(20) not null comment '创建人',
 ts_create_time datetime not null comment '创建时间',
 si_update_user varchar(20) not null comment '更新人',
 si_update_time datetime not null comment '更新时间',
primary key (nl_product_id),
index idx_connect(nl_merchant_id,si_product_name)
)Engine=INNODB charset=utf8 comment '产品上架表';

drop table if exists ops_product_sell_ota;
create table ops_product_sell_ota (
 nl_product_id int unsigned not null comment '产品Id',
 nl_merchant_id bigint unsigned not null comment '所属商户Id',
 si_product_display varchar(50) not null comment '显示名称',
 nl_product_type bigint unsigned not null comment '产品类型', 
 ni_price_settle decimal(11,2) unsigned not null comment'结算价', 
 ni_sell_pre_enabled tinyint not null comment '是否开启预售',
 ts_sell_pre_st datetime default null comment '预售生效时间',
 ts_sell_pre_et datetime default null comment '预售失效时间',
 ni_sell_today_enabled tinyint default null comment '当日是否可购',
 ts_sell_today_maxtime varchar(20) default '23:00' comment '当日最晚可购时间',
 ni_sell_order_min int default '0' comment '单笔购票最小数量',
 ni_sell_order_max int default '999' comment '单笔购票最大数量',
 ni_refund_enabled tinyint default '1' comment '是否可退',
 ni_refund_limit tinyint default '1' comment '退款需要审核',
 ni_refund_limit_today tinyint default '0' comment '当日是否可退',
 ni_refund_limit_deadline tinyint default '1' comment '过期多少天内可退',
 ni_refund_limit_offline tinyint default '1' comment '退款需要线下校验',
 si_refund_limit_url varchar(200) default null comment '退款线下校验地址',
 ni_ck_delay_hour tinyint default '0' comment '延迟入园时长',
 ni_ck_ticket_type tinyint default '1' comment '大小票:1-大票,2-小票',
 ni_ck_price_type tinyint default '0' comment '周期价：1-开启',
 ni_ck_dateticket tinyint default '1' comment '期票：1-固定天数,2-指定日期',
 ni_ck_dateticket_days int default '1' comment '期票固定天数',
 ts_ck_dateticket_st varchar(30) default '1' comment '期票指定生效日期',
 ts_ck_dateticket_et varchar(30) default '1' comment '期票指定失效日期',
 ni_service_sms tinyint default '0' comment '是否发送短信', 
 si_create_user varchar(20) not null comment '创建人',
 ts_create_time datetime not null comment '创建时间',
 si_update_user varchar(20) not null comment '更新人',
 si_update_time datetime not null comment '更新时间',
primary key (nl_product_id),
index idx_connect(nl_merchant_id)
)Engine=INNODB charset=utf8 comment 'ota产品上架表';

drop table if exists ops_product_release_ota;
create table ops_product_release_ota (
 nl_release_id bigint unsigned not null comment '发布Id',
 nl_product_id int unsigned not null comment '产品Id',
 nl_merchant_id bigint unsigned not null comment '所属商户Id',
 nl_channel_id bigint  unsigned not null comment '所属渠道Id',
 si_product_display varchar(50) not null comment '显示名称',
 nl_product_type bigint unsigned not null comment '产品类型', 
 si_offline_code varchar(20) not null comment '线下编码',
 ni_price_ticket decimal(11,2) unsigned not null comment'票面价', 
 ni_price_sell decimal(11,2) unsigned not null comment'售卖价', 
 ni_price_settle decimal(11,2) unsigned not null comment'结算价', 
 ts_effective_st datetime not null comment '生效时间',
 ts_effective_et datetime not null comment '失效时间',
 ni_sell_pre_enabled tinyint not null comment '是否开启预售',
 ts_sell_pre_st datetime default null comment '预售生效时间',
 ts_sell_pre_et datetime default null comment '预售失效时间',
 ni_sell_today_enabled tinyint default null comment '当日是否可购',
 ts_sell_today_maxtime varchar(20) default '23:00' comment '当日最晚可购时间',
 ni_sell_order_min int default '0' comment '单笔购票最小数量',
 ni_sell_order_max int default '999' comment '单笔购票最大数量',
 ni_refund_enabled tinyint default '1' comment '是否可退',
 ni_refund_limit tinyint default '1' comment '退款需要审核',
 ni_refund_limit_today tinyint default '0' comment '当日是否可退',
 ni_refund_limit_deadline tinyint default '1' comment '过期多少天内可退',
 ni_refund_limit_offline tinyint default '1' comment '退款需要线下校验',
 si_refund_limit_url varchar(200) default null comment '退款线下校验地址',
 ni_ck_delay_hour tinyint default '0' comment '延迟入园时长',
 ni_ck_ticket_type tinyint default '1' comment '大小票:1-大票,2-小票',
 ni_ck_price_type tinyint default '0' comment '周期价：1-开启',
 ni_ck_dateticket tinyint default '1' comment '期票：1-固定天数,2-指定日期',
 ni_ck_dateticket_days int default '1' comment '期票固定天数',
 ts_ck_dateticket_st varchar(30) default '1' comment '期票指定生效日期',
 ts_ck_dateticket_et varchar(30) default '1' comment '期票指定失效日期',
 ni_service_sms tinyint default '0' comment '是否发送短信', 
 si_create_user varchar(20) not null comment '创建人',
 ts_create_time datetime not null comment '创建时间',
 si_update_user varchar(20) not null comment '更新人',
 si_update_time datetime not null comment '更新时间',
primary key (nl_release_id),
index idx_product(nl_product_id),
index idx_connect(nl_merchant_id,nl_channel_id)
)Engine=INNODB charset=utf8 comment 'ota产品发布表';

drop table if exists ops_product_price_ota;
create table ops_product_price_ota (
 nl_price_id bigint unsigned not null comment '价格Id',
 nl_merchant_id bigint unsigned not null comment '所属景区Id',
 nl_channel_id bigint unsigned not null comment '所属渠道Id',
 nl_product_id int unsigned not null comment '产品Id',
 ni_price_sell decimal(11,2) unsigned not null comment'售卖价', 
 ni_price_settle decimal(11,2) unsigned not null comment'结算价', 
 ts_date datetime not null comment '有效日期', 
primary key (nl_price_id),
index idx_connect(nl_merchant_id,nl_channel_id,nl_product_id,ts_date)
)Engine=INNODB charset=utf8 comment '价格日历表';