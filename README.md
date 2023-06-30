
# 开发逻辑
1. 开发者(backend项目)使用SDK调用调用接口, 由interface项目提供接口
2. SDK中的地址是gateway项目的
3. 即由gateway进行路由转发和流量控制,并集中处理签名校验、请求参数校验、接口调用统计、记录日志等业务逻辑，提高安全性的同时、便于系统开发维护。
4. 然后再由interface项目提供真实接口服务, 并响应给调用者, 隐藏了真实接口服务的地址, 提高安全性


# SpringBoot 项目初始模板

Java SpringBoot 项目初始模板，整合了常用框架和示例代码，大家可以在此基础上快速开发自己的项目。

## 模板功能

- Spring Boot
- Spring MVC
- MySQL 驱动
- MyBatis
- MyBatis Plus
- Spring AOP
- Apache Commons Lang3 工具类
- Lombok 注解
- Swagger + Knife4j 接口文档
- Spring Boot 调试工具和项目处理器
- 全局请求响应拦截器（记录日志）
- 示例用户注册、登录、搜索功能
- 示例单元测试类
- 示例 SQL（用户表）
