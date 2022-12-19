# 第一次执行
create database if not exists openapi_db;

use openapi_db;

# 用户表
drop table if exists user;
create table if not exists user
(
    id           bigint auto_increment comment 'id' primary key,
    username     varchar(256)       null comment '用户昵称',
    userAccount  varchar(256)       null comment '账号',
    userAvatar    varchar(1024)      null comment '用户头像',
    gender       tinyint            null comment '性别',
    userRole     varchar(256) default 'user'   not null comment '用户角色：user / admin',
    userPassword varchar(512)       not null comment '密码',
    accessKey    varchar(512) not null comment 'accessKey',
    secretKey varchar(512) not null comment 'secretKey',
    phone        varchar(128)       null comment '电话',
    email        varchar(512)       null comment '邮箱',
    createTime   datetime default CURRENT_TIMESTAMP comment '创建时间',
    updateTime   datetime default CURRENT_TIMESTAMP on update CURRENT_TIMESTAMP,
    isDelete     tinyint  default 0 not null comment '是否删除'
) comment '用户';


