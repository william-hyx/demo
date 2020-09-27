## 项目简介
后台项目

## 技术选型
Java 1.8

Undertow：Web服务器

Apache Maven 3

SpringBoot 2.3.X

Apache MyBatis 3.5

Alibaba Druid：数据库连接池

Lomok

Zxing: 生成二维码

EasyExcel：读写Excel

Mockito：Mock框架

MapStruct：实体映射工具

UserAgentUtils：获取浏览器/操作系统/设备类型等信息

Lettuce: Redis客户端

## 内置功能
用户管理

角色管理

权限管理

字典管理

操作日志

登陆日志

雪花算法(Snowflake)自增ID

## 编码实践

#### 对象命名约定
DTO(Data Transfer Object): 数据传输对象，本项目用于封装前端传入的数据。

PO(Persistent Object): 持久化对象，它与数据库中的数据表中的每个字段形成一一对应的映射关系。

VO(View Object): 视图对象，本项目中用于封装返回到前端的数据。