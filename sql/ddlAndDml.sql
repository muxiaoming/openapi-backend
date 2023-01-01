-- 切换库
use openapi_db;

-- 接口信息表
create table if not exists `interface_info`
(
    `id` bigint not null auto_increment comment '主键' primary key,
    `name` varchar(256) not null comment '接口名称',
    `url` varchar(512) not null comment '接口地址',
    `method` varchar(256) not null comment '方法类型',
    `requestParams` text not null comment '请求参数',
    `status` int default 0 not null comment '接口状态:0:关闭,1开启',
    `description` varchar(256) null comment '接口描述',
    `requestHeader` text not null comment '请求头',
    `responseHeader` text not null comment '响应头',
    `createTime` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `createId` bigint not null comment '创建人id',
    `updateTime` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `idDelete` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
) comment '接口信息表';

-- 插入数据
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('龚晟睿', 'www.dodie-gibson.biz', 'y4kB', 0, 'x1OB', '曾嘉熙', '黄志泽', 3611430389);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('曹文昊', 'www.humberto-wiegand.biz', 'gKdV', 1, 'bnoZs', '陈绍辉', '廖浩', 41172065);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('万弘文', 'www.keneth-leffler.com', '7C', 1, 'JE', '朱伟泽', '宋潇然', 96505);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('萧弘文', 'www.mac-willms.net', 'NXR', 0, '7TnY6', '冯伟诚', '沈黎昕', 4519);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('周笑愚', 'www.gala-shields.io', '8K5', 1, 'nuzu8', '姜浩宇', '郝子轩', 738173499);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('邓天磊', 'www.russel-bernier.net', 'RUF', 1, 'L88Rx', '丁思', '彭思源', 709733);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('邱煜城', 'www.renata-wehner.org', 'YK3', 0, 'HXW', '蒋泽洋', '郭弘文', 381556459);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('于鹤轩', 'www.clifford-donnelly.com', 'Kc', 1, 'KL', '熊俊驰', '崔展鹏', 42906124);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('何君浩', 'www.tyron-vandervort.info', 'psVU', 0, 'Oy', '卢峻熙', '苏耀杰', 639710618);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('韦哲瀚', 'www.lawanna-carroll.info', 'QK', 0, 'N7', '谢睿渊', '孟子涵', 7397);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('傅致远', 'www.krystin-mann.info', 'h5E', 0, 'w2', '韩君浩', '吕博超', 320);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('张绍齐', 'www.harry-deckow.info', 'tI', 1, 'rtB', '徐博涛', '毛晓啸', 15490767);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('彭展鹏', 'www.georgiana-reichert.name', 'JzR', 0, 'QmUg', '韩思', '吴博涛', 359453931);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('魏展鹏', 'www.branden-oreilly.biz', 'cRPY', 1, 'IorLQ', '郑哲瀚', '段嘉懿', 295139123);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('田烨霖', 'www.fausto-romaguera.org', 'ToKV', 1, 'v82b', '钱哲瀚', '邱博文', 18298775);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('毛晟睿', 'www.charlie-murazik.io', '0a', 0, 'Bw8m', '邹楷瑞', '钱子默', 8232);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('洪伟泽', 'www.deandre-reinger.io', 'DV3zn', 0, '927w', '李天翊', '熊煜祺', 4509);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('杜鹤轩', 'www.waylon-abernathy.io', 'Wpa', 0, 'vvPc', '雷炫明', '陶志泽', 8111431);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('谢绍辉', 'www.faustino-powlowski.com', 'AAt', 0, 'cBAbq', '孙健雄', '李雨泽', 38508412);
insert into `interface_info` (`name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `createId`) values ('陆昊天', 'www.landon-donnelly.net', 'n3Iv', 1, '0C', '孔志泽', '周文', 5640);