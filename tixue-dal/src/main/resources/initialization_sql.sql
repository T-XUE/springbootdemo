CREATE TABLE `user_info` (
  `user_id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_name` VARCHAR (200) DEFAULT NULL COMMENT '用户名',
  `nick_name` VARCHAR (576) DEFAULT NULL,
  `real_name` VARCHAR (200) DEFAULT NULL COMMENT '真实或企业名称',
  `log_password` VARCHAR (200) NOT NULL COMMENT '登录密码',
  `pay_password` VARCHAR (200) DEFAULT NULL COMMENT '支付密码',
  `account_id` VARCHAR (200) DEFAULT NULL COMMENT '帐户ID',
  `account_name` VARCHAR (200) DEFAULT NULL COMMENT '帐户名',
  `mobile` VARCHAR (200) DEFAULT NULL COMMENT '联系电话',
  `mobile_binding` ENUM ('IS', 'NO') DEFAULT 'NO' COMMENT '是否绑定手机',
  `mail` VARCHAR (200) DEFAULT NULL COMMENT '联系邮箱',
  `mail_binding` ENUM ('IS', 'NO') DEFAULT 'NO' COMMENT '是否绑定邮箱',
  `type` ENUM ('GR', 'JG', '') DEFAULT NULL COMMENT '用户类型',
  `state` ENUM (
    'normal',
    'freeze',
    'disable',
    'inactive',
    'locked',
    'overdue'
  ) DEFAULT 'normal' COMMENT '用户状态',
  `real_name_authentication` VARCHAR (32) DEFAULT NULL COMMENT '实名认证状态：IS-通过，IN-申请中,NO-未通过,N-未认证',
  `pwd_error_count` INT (11) DEFAULT 0 COMMENT '登录密码错误次数',
  `change_lock_time` TIMESTAMP NULL DEFAULT NULL COMMENT '锁定或解锁时间',
  `birthday` VARCHAR (30) DEFAULT NULL COMMENT '出生年月',
  `user_custom_type` VARCHAR (32) DEFAULT NULL COMMENT '用户类型',
  `row_add_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `row_update_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最近修改时间',
  PRIMARY KEY (`user_id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8 COMMENT = '用户信息';

CREATE TABLE `role` (
  `role_id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_code` VARCHAR(32) NOT NULL COMMENT '角色代码',
  `role_name` VARCHAR(32) NOT NULL COMMENT '角色名称',
  `role_parent_id` INT(11) DEFAULT NULL COMMENT '父角色ID',
  `role_note` VARCHAR(256) DEFAULT NULL COMMENT '备注',
  `user_biz_type` VARCHAR(32) DEFAULT NULL COMMENT '角色类型',
  `row_add_time` TIMESTAMP NULL DEFAULT NULL COMMENT '新增时间',
  `row_update_time` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`role_id`),
  UNIQUE KEY `role_code` (`role_code`) USING BTREE
) ENGINE=INNODB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COMMENT='角色';

CREATE TABLE `user_role` (
  `user_role_id` BIGINT (20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` BIGINT (20) NOT NULL COMMENT '人员ID',
  `role_id` INT (11) NOT NULL COMMENT '角色ID',
  `row_add_time` TIMESTAMP NULL DEFAULT NULL COMMENT '新增时间',
  `row_update_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`user_role_id`),
  UNIQUE KEY `AK_Key_2` (`user_id`, `role_id`) USING BTREE,
  KEY `FK_Reference_2` (`role_id`) USING BTREE
) ENGINE = INNODB AUTO_INCREMENT = 506 DEFAULT CHARSET = utf8 COMMENT = '用户角色';

