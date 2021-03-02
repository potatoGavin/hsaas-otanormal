 
 -- 系统底层可移植表

drop table if exists bs_sys_menu;
create table bs_sys_menu (
  nl_menu_id bigint unsigned not null comment '菜单Id',
  nl_parent_id bigint unsigned not null default '0' comment '所属模块:0-本身是模块',
  si_menu_name varchar(10) not null comment '菜单名称',
  si_menu_path varchar(30) not null comment '地址名称',
  si_menu_url varchar(100) not null comment '地址路径',
  si_menu_icon varchar(50) default null comment '图标',
  ni_sort int unsigned not null comment '排序号',
  is_enabled tinyint unsigned default '0' comment '是否启用',
  primary key (nl_menu_id)
) ENGINE=InnoDB default CHARSET=utf8 comment='系统菜单表';

drop table if exists bs_sys_button;
create table bs_sys_button (
  nl_button_id bigint unsigned not null comment '按钮Id',
  nl_menu_id bigint unsigned not null comment '所属菜单',
  si_button_name varchar(10) not null comment '按钮名称',
  si_button_event varchar(30) not null comment '绑定事件',
  si_button_icon varchar(50) not null comment '图标',
  ni_sort int unsigned not null comment '排序号',
  is_enabled tinyint unsigned default '0' comment '是否启用',
  primary key (nl_button_id)
) ENGINE=InnoDB default CHARSET=utf8 comment='系统操作按钮表';

drop table if exists bs_sys_dicttype;
create table bs_sys_dicttype(
 nl_dict_type bigint unsigned not null comment '类型Id',
 nl_dict_name varchar(20) not null comment '类型名称',
 primary key (nl_dict_type)
)Engine=INNODB charset=utf8 comment='数据字典类型';

drop table if exists bs_sys_dict;
create table bs_sys_dict(
 nl_dict_key bigint unsigned not null comment '字典Key',
 nl_dict_type bigint unsigned not null comment '类型Id',
 si_dict_code varchar(20) default null comment '字典编码',
 si_dict_value varchar(30) default null comment '字典值',
 nl_parent_key bigint unsigned default '0' comment '上级字典Key',
 nl_parent_code bigint unsigned default '0' comment '上级字典编码',
 si_dict_icon varchar(50) default null comment '字典图标',
 ni_limit_sys tinyint default '0' comment '系统限定',
 ni_dict_sort int unsigned not null comment '排序号',
 sl_remark varchar(100) not null comment '备注',
 is_deleted tinyint unsigned default '0' comment '是否删除',
 si_create_user varchar(20) not null comment '创建人',
 ts_create_time datetime not null comment '创建时间',
 si_update_user varchar(20) not null comment '更新人',
 si_update_time datetime not null comment '更新时间', 
primary key (nl_dict_key),
key idx_key(nl_dict_type,nl_parent_key)
)Engine=INNODB charset=utf8 comment '数据字典';