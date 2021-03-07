
-- 系统商户相关表

DROP TABLE IF EXISTS `ops_merchant`;
CREATE TABLE `ops_merchant` (
                                `nl_merchant_id` bigint(20) unsigned NOT NULL COMMENT '商户Id',
                                `nl_company_id` bigint(20) unsigned NOT NULL COMMENT '所属公司Id',
                                `si_merchant_name` varchar(30) NOT NULL COMMENT '商户名称',
                                `si_merchant_code` varchar(30) NOT NULL COMMENT '商户编码',
                                `ni_merchant_type` tinyint(4) NOT NULL COMMENT '商户类型：10-景区，21-ota，22-旅行社',
                                `si_contact_name` varchar(20) NOT NULL COMMENT '联系人',
                                `si_contact_phone` varchar(20) NOT NULL COMMENT '联系电话',
                                `si_merchant_key` varchar(50) NOT NULL COMMENT '秘钥',
                                `is_enabled` tinyint(3) unsigned NOT NULL COMMENT '是否启用',
                                `is_deleted` tinyint(3) unsigned DEFAULT '0' COMMENT '是否删除',
                                `si_remark` varchar(100) DEFAULT NULL COMMENT '备注',
                                `si_create_user` varchar(20) NOT NULL COMMENT '创建人',
                                `ts_create_time` datetime NOT NULL COMMENT '创建时间',
                                `si_update_user` varchar(20) NOT NULL COMMENT '更新人',
                                `ts_update_time` datetime NOT NULL COMMENT '更新时间',
                                PRIMARY KEY (`nl_merchant_id`),
                                UNIQUE KEY `si_merchant_code` (`si_merchant_code`),
                                KEY `idx_query` (`nl_company_id`,`si_merchant_code`,`si_contact_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商户主表';
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