### 工程模板自动生成

#### 变量

* groupId    | 组名
* artifactId | 工程名字
* package    | 包名
* appName    | appName


service工程模板执行
```shell
mvn archetype:generate  \
-DgroupId=com.luban \
-DartifactId=demosrv \
-Dversion=1.0.0-sp3-SNAPSHOT \
-Dpackage=com.luban.demo \
-DappName=demo-srv \
-DarchetypeArtifactId=common-service-archetype \
-DarchetypeGroupId=com.luban \
-DarchetypeVersion=1.0.0-sp3.2-SNAPSHOT
```


springboot-starter工程模版执行
```shell
mvn archetype:generate  \
-DgroupId=com.luban \
-DartifactId=demosrv \
-Dversion=1.0.0-sp3-SNAPSHOT \
-Dpackage=com.luban.demo \
-DappName=demo-srv \
-DarchetypeArtifactId=common-spring-boot-starter-archetype \
-DarchetypeGroupId=com.luban \
-DarchetypeVersion=1.0.0-sp3.2-SNAPSHOT
```
