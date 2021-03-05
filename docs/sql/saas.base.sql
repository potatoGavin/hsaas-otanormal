-- 系统鉴权相关表

drop table if exists bs_base_company;
create table bs_base_company (
  nl_company_id bigint unsigned not null comment '公司Id',
  si_company_name varchar(20) not null comment '公司名称',
  si_contacts_name varchar(10) default '' comment '联系人',
  si_contacts_phone varchar(20) default '' comment '联系电话',
  si_remark varchar(100) default '' comment '备注',
  si_create_user varchar(20) not null comment '创建人',
  ts_create_time datetime not null comment '创建时间',
  si_update_user varchar(20) not null comment '更新人',
  ts_update_time datetime not null comment '更新时间',
  is_deleted tinyint unsigned default '0' comment '是否删除',
  primary key (nl_company_id)
) ENGINE=InnoDB default CHARSET=utf8 comment='公司管理';

drop table if exists bs_base_role;
create table bs_base_role (
  nl_role_id bigint unsigned not null comment '模板Id',
  nl_company_id bigint unsigned default '0' comment '所属公司',
  si_role_name varchar(20) not null comment '名称',
  si_role_remark varchar(100) default null comment '备注',
  si_create_user varchar(20) not null comment '创建人',
  ts_create_time datetime not null comment '创建时间',
  si_update_user varchar(20) not null comment '更新人',
  si_update_time datetime not null comment '更新时间',
  is_enabled tinyint unsigned default '0' comment '是否启用',
  primary key (nl_role_id),
  index idx_query(nl_company_id,si_role_name,si_update_time)
) ENGINE=InnoDB default CHARSET=utf8 comment='权限模板表';

drop table if exists bs_base_roledict;
create table bs_base_roledict (
  nl_dict_id bigint unsigned not null comment '字典Id',
  ni_dict_type tinyint unsigned not null comment '类型：10-role_menu,11-role_button,12-role_company,13-role_merchant,20-user_menu,21-user_button,22-user_company,23-user_merchant',
  nl_master_id bigint unsigned not null comment '主表Id',
  nl_item_id bigint unsigned not null comment '从表Id',
  primary key (nl_dict_id),
  unique key uk_all (ni_dict_type,nl_master_id,nl_item_id)
) ENGINE=InnoDB default CHARSET=utf8 comment='权限字典表';

drop table if exists bs_base_userinfo;
create table bs_base_userinfo (
  nl_user_id bigint unsigned not null comment '用户Id',
  nl_company_id bigint unsigned default '0' comment '所属公司',
  si_user_account varchar(25) not null comment '登录账号',
  si_user_password varchar(50) not null comment '登录密码',
  si_user_name varchar(20) not null comment '用户姓名',
  si_user_mobile varchar(20) default null comment '手机号',
  nl_role_id bigint unsigned not null comment '当前权限模板',
  si_create_user varchar(20) not null comment '创建人',
  ts_create_time datetime not null comment '创建时间',
  si_update_user varchar(20) not null comment '更新人',
  ts_update_time datetime not null comment '更新时间',
  is_enabled tinyint unsigned default '0' comment '是否启用',
  is_deleted tinyint unsigned default '0' comment '是否删除',
  primary key (nl_user_id),
  unique key account (si_user_account)
) ENGINE=InnoDB default CHARSET=utf8 comment='用户信息表';