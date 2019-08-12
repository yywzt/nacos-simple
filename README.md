# nacos-simple
nacos simple
nacos实例

注：版本依赖问题

springboot2.1.X 对应Spring Cloud Greenwich

<https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E>



| Sentinel Version                                             | Nacos Version | RocketMQ Version | Dubbo Version | Seata Version |       |
| ------------------------------------------------------------ | ------------- | ---------------- | ------------- | ------------- | ----- |
| (毕业版本) 2.1.0.RELEASE or 2.0.0.RELEASE or 1.5.0.RELEASE   | 1.6.3         | 1.1.1            | 4.4.0         | 2.7.3         | 0.7.1 |
| (孵化器版本) 0.9.0.RELEASE or 0.2.2.RELEASE or 0.1.2.RELEASE | 1.5.2         | 1.0.0            | 4.4.0         | 2.7.1         | 0.4.2 |
| (孵化器版本) 0.2.1.RELEASE or 0.1.1.RELEASE                  | 1.4.0         | 0.6.2            | 4.3.1         | ❌             | ❌     |
| (孵化器版本) 0.2.0.RELEASE or 0.1.0.RELEASE                  | 1.3.0-GA      | 0.3.0            | ❌             | ❌             | ❌     |

## 毕业版本依赖关系(推荐使用)

| Spring Cloud Version   | Spring Cloud Alibaba Version | Spring Boot Version |
| ---------------------- | ---------------------------- | ------------------- |
| Spring Cloud Greenwich | 2.1.0.RELEASE                | 2.1.X.RELEASE       |
| Spring Cloud Finchley  | 2.0.0.RELEASE                | 2.0.X.RELEASE       |
| Spring Cloud Edgware   | 1.5.0.RELEASE                | 1.5.X.RELEASE       |

## 依赖管理

Spring Cloud Alibaba BOM 包含了它所使用的所有依赖的版本。

### RELEASE 版本

#### Spring Cloud Greenwich

如果需要使用 Spring Cloud Greenwich 版本，请在 dependencyManagement 中添加如下内容

```
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-alibaba-dependencies</artifactId>
    <version>2.1.0.RELEASE</version>
    <type>pom</type>
    <scope>import</scope>
</dependency>
```

#### Spring Cloud Finchley

如果需要使用 Spring Cloud Finchley 版本，请在 dependencyManagement 中添加如下内容

```
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-alibaba-dependencies</artifactId>
    <version>2.0.0.RELEASE</version>
    <type>pom</type>
    <scope>import</scope>
</dependency>
```

#### Spring Cloud Edgware

如果需要使用 Spring Cloud Edgware 版本，请在 dependencyManagement 中添加如下内容

```java
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-alibaba-dependencies</artifactId>
    <version>1.5.0.RELEASE</version>
    <type>pom</type>
    <scope>import</scope>
</dependency>
```