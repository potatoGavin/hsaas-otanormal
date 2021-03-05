
-- 系统商户相关表

drop table if exists ops_merchant;
create table ops_mer_merchant (
 nl_merchant_id bigint unsigned not null comment '商户Id',
 nl_company_id bigint unsigned not null comment '所属公司Id',
 si_merchant_code varchar(30) not null comment '商户编码',
 ni_merchant_type tinyint not null comment '商户类型：10-景区，21-ota，22-旅行社',
 si_contact_name varchar(20) not null comment '联系人',
 si_contact_phone varchar(20) not null comment '联系电话',
 si_merchant_key varchar(50) not null comment '秘钥',
 is_enabled tinyint unsigned not null comment '是否启用',
 is_deleted tinyint unsigned default '0' comment '是否删除',
 si_remark varchar(100) default null comment '备注',
 si_create_user varchar(20) not null comment '创建人',
 ts_create_time datetime not null comment '创建时间',
 si_update_user varchar(20) not null comment '更新人',
 si_update_time datetime not null comment '更新时间',
primary key (nl_merchant_id),
unique key(si_merchant_code),
key idx_query(nl_company_id,si_merchant_code,si_contact_name)
)Engine=INNODB charset=utf8 comment '商户主表';

drop table if exists ops_merchant_ota;
create table ops_merchant_ota (
 nl_merchant_id bigint unsigned not null comment '商户Id',
 si_ota_account varchar(30) not null comment 'ota账号',
 si_ota_url varchar(200) not null comment 'ota回调地址',
primary key (nl_merchant_id),
key idx(si_ota_account)
)Engine=INNODB charset=utf8 comment '商户OTA表';

drop table if exists ops_merchant_ota_meituan;
create table ops_merchant_ota_meituan (
 nl_merchant_id bigint unsigned not null comment '景区Id', 
 nl_ota_id bigint unsigned not null comment 'otaId',
 nl_meituan_id bigint not null comment '美团Id',
 si_meituan_account varchar(30) not null comment '美团账号', 
 si_meituan_key varchar(200) not null comment '美团秘钥',
primary key (nl_merchant_id),
key idx(nl_meituan_id,nl_ota_id)
)Engine=INNODB charset=utf8 comment '商户非标OTA,美团';

drop table if exists ops_merchant_ota_quna;
create table ops_merchant_ota_quna (
 nl_merchant_id bigint unsigned not null comment '景区Id', 
 nl_ota_id bigint unsigned not null comment 'otaId', 
 si_quna_account varchar(30) not null comment '去哪儿账户', 
 si_quna_key varchar(200) not null comment '去哪儿秘钥',
primary key (nl_merchant_id),
key idx(si_quna_account,nl_ota_id)
)Engine=INNODB charset=utf8 comment '商户非标OTA,去哪儿';