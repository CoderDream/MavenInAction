# MavenInAction



### 交互式
- mvn会列出一个列表供用户选择
```
mvn archetype:generate
```

- 执行结果
```
Admin@Admin-PC MINGW64 /d/Java/GitHub/MavenInAction/Chapter18/demo01 (master)
$ mvn archetype:generate
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] >>> maven-archetype-plugin:3.0.1:generate (default-cli) > generate-sources @ standalone-pom >>>
[INFO]
[INFO] <<< maven-archetype-plugin:3.0.1:generate (default-cli) < generate-sources @ standalone-pom <<<
[INFO]
[INFO]
[INFO] --- maven-archetype-plugin:3.0.1:generate (default-cli) @ standalone-pom ---
[INFO] Generating project in Interactive mode
[WARNING] No archetype found in remote catalog. Defaulting to internal catalog
[INFO] No archetype defined. Using maven-archetype-quickstart (org.apache.maven.archetypes:maven-archetype-quickstart:1.0)
Choose archetype:
1: internal -> org.apache.maven.archetypes:maven-archetype-archetype (An archetype which contains a sample archetype.)
2: internal -> org.apache.maven.archetypes:maven-archetype-j2ee-simple (An archetype which contains a simplifed sample J2EE application.)
3: internal -> org.apache.maven.archetypes:maven-archetype-plugin (An archetype which contains a sample Maven plugin.)
4: internal -> org.apache.maven.archetypes:maven-archetype-plugin-site (An archetype which contains a sample Maven plugin site.
      This archetype can be layered upon an existing Maven plugin project.)
5: internal -> org.apache.maven.archetypes:maven-archetype-portlet (An archetype which contains a sample JSR-268 Portlet.)
6: internal -> org.apache.maven.archetypes:maven-archetype-profiles ()
7: internal -> org.apache.maven.archetypes:maven-archetype-quickstart (An archetype which contains a sample Maven project.)
8: internal -> org.apache.maven.archetypes:maven-archetype-site (An archetype which contains a sample Maven site which demonstrates
      some of the supported document types like APT, XDoc, and FML and demonstrates how
      to i18n your site. This archetype can be layered upon an existing Maven project.)
9: internal -> org.apache.maven.archetypes:maven-archetype-site-simple (An archetype which contains a sample Maven site.)
10: internal -> org.apache.maven.archetypes:maven-archetype-webapp (An archetype which contains a sample Maven Webapp project.)
11: local -> com.coderdream:test6-archetype (test6-archetype)
12: local -> org.activiti:activiti-archetype-unittest2-archetype (Creates a new Activiti unit test.)
13: local -> org.activiti:activiti-archetype-unittest2 (Creates a new Activiti unit test.)
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): 7: 1
Define value for property 'groupId': rg.apache.maven.archetypes
Define value for property 'artifactId': maven-archetype-quickstart
Define value for property 'version' 1.0-SNAPSHOT: : 1.0
Define value for property 'package' rg.apache.maven.archetypes: : com.zheng.mavenstudy
Confirm properties configuration:
groupId: rg.apache.maven.archetypes
artifactId: maven-archetype-quickstart
version: 1.0
package: com.zheng.mavenstudy
 Y: : Y
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Old (1.x) Archetype: maven-archetype-archetype:1.0
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: basedir, Value: D:\Java\GitHub\MavenInAction\Chapter18\demo01
[INFO] Parameter: package, Value: com.zheng.mavenstudy
[INFO] Parameter: groupId, Value: rg.apache.maven.archetypes
[INFO] Parameter: artifactId, Value: maven-archetype-quickstart
[INFO] Parameter: packageName, Value: com.zheng.mavenstudy
[INFO] Parameter: version, Value: 1.0
[INFO] project created from Old (1.x) Archetype in dir: D:\Java\GitHub\MavenInAction\Chapter18\demo01\maven-archetype-quickstart
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 01:05 min
[INFO] Finished at: 2019-01-15T10:52:08+08:00
[INFO] Final Memory: 16M/168M
[INFO] ------------------------------------------------------------------------
```
- 输入信息
```
Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): 7: 1
Define value for property 'groupId': rg.apache.maven.archetypes
Define value for property 'artifactId': maven-archetype-quickstart
Define value for property 'version' 1.0-SNAPSHOT: : 1.0
Define value for property 'package' rg.apache.maven.archetypes: : com.zheng.mavenstudy
Confirm properties configuration:
groupId: rg.apache.maven.archetypes
artifactId: maven-archetype-quickstart
version: 1.0
package: com.zheng.mavenstudy
 Y: : Y
```

### 批处理方式
批处理方式不同在于使用上述命令时直接把参数给出来,同时使用-B参数要求archetype插件以批处理的方式运行，不过需要用户显示给出archetype的坐标信息，*一定都要注意空格问题，分行的斜线（\）之前要有空格*
```
mvn archetype:generate -B \
-DarchetypeGroupId=org.apache.maven.archetypes \
-DarchetypeArtifactId=maven-archetype-quickstart \
-DarchetypeVersion=1.0 \
-DgroupId=com.zheng.mavenstudy \
-DartifactId=archetype-test \
-Dversion=1.0-SNAPSHOT \
-Dpackage=com.zheng.mavenstudy
```

- 运行结果
```
Admin@Admin-PC MINGW64 /d/Java/GitHub/MavenInAction/Chapter18/demo02 (master)
$ mvn archetype:generate -B \
> -DarchetypeGroupId=org.apache.maven.archetypes \
> -DarchetypeArtifactId=maven-archetype-quickstart \
> -DarchetypeVersion=1.0 \
> -DgroupId=com.zheng.mavenstudy \
> -DartifactId=archetype-test \
> -Dversion=1.0-SNAPSHOT \
> -Dpackage=com.zheng.mavenstudy
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] >>> maven-archetype-plugin:3.0.1:generate (default-cli) > generate-sources @ standalone-pom >>>
[INFO]
[INFO] <<< maven-archetype-plugin:3.0.1:generate (default-cli) < generate-sources @ standalone-pom <<<
[INFO]
[INFO]
[INFO] --- maven-archetype-plugin:3.0.1:generate (default-cli) @ standalone-pom ---
[INFO] Generating project in Batch mode
[WARNING] No archetype found in remote catalog. Defaulting to internal catalog
[INFO] Archetype repository not defined. Using the one from [org.apache.maven.archetypes:maven-archetype-quickstart:1.1] found in catalog internal
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Old (1.x) Archetype: maven-archetype-quickstart:1.0
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: basedir, Value: D:\Java\GitHub\MavenInAction\Chapter18\demo02
[INFO] Parameter: package, Value: com.zheng.mavenstudy
[INFO] Parameter: groupId, Value: com.zheng.mavenstudy
[INFO] Parameter: artifactId, Value: archetype-test
[INFO] Parameter: packageName, Value: com.zheng.mavenstudy
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] project created from Old (1.x) Archetype in dir: D:\Java\GitHub\MavenInAction\Chapter18\demo02\archetype-test
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.991 s
[INFO] Finished at: 2019-01-15T11:04:09+08:00
[INFO] Final Memory: 16M/173M
[INFO] ------------------------------------------------------------------------
```

### 打包安装

- 运行结果
```
Admin@Admin-PC MINGW64 /d/Java/GitHub/MavenInAction/Chapter18/demo03/archetype-test (master)
$ mvn clean install
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building archetype-java-test 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ archetype-java-test ---
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ archetype-java-test ---
[WARNING] Using platform encoding (GBK actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] Copying 6 resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ archetype-java-test ---
[INFO] No sources to compile
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ archetype-java-test ---
[WARNING] Using platform encoding (GBK actually) to copy filtered resources, i.e. build is platform dependent!
[INFO] skip non existing resourceDirectory D:\Java\GitHub\MavenInAction\Chapter18\demo03\archetype-test\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ archetype-java-test ---
[INFO] No sources to compile
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ archetype-java-test ---
[INFO] No tests to run.
[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ archetype-java-test ---
[INFO] Building jar: D:\Java\GitHub\MavenInAction\Chapter18\demo03\archetype-test\target\archetype-java-test-1.0-SNAPSHOT.jar
[INFO]
[INFO] --- maven-install-plugin:2.4:install (default-install) @ archetype-java-test ---
[INFO] Installing D:\Java\GitHub\MavenInAction\Chapter18\demo03\archetype-test\target\archetype-java-test-1.0-SNAPSHOT.jar 
to D:\Java\repo\com\coderdream\archetype-java-test\1.0-SNAPSHOT\archetype-java-test-1.0-SNAPSHOT.jar
[INFO] Installing D:\Java\GitHub\MavenInAction\Chapter18\demo03\archetype-test\pom.xml 
to D:\Java\repo\com\coderdream\archetype-java-test\1.0-SNAPSHOT\archetype-java-test-1.0-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 4.514 s
[INFO] Finished at: 2019-01-15T11:19:06+08:00
[INFO] Final Memory: 10M/123M
[INFO] ------------------------------------------------------------------------
```

### 生成 

- 生成archetype自定义框架
```
mvn archetype:generate \
-DarchetypeGroupId=org.apache.maven.archetypes \
-DarchetypeArtifactId=maven-archetype-archetype \
-DarchetypeVersion=1.3
```

### 安装到本地
&nbsp;

- 安装
```
mvn install
```

### 在本地按脚手架生成工程

- 方式1：在demo08文件夹按提示输入参数信息
```
mvn archetype:generate \
-DarchetypeGroupId=com.coderdream \
-DarchetypeCatalog=local \
-DarchetypeArtifactId=archetype-demo \
-DarchetypeVersion=1.0
```

- 执行结果
```
Admin@Admin-PC MINGW64 /d/Java/GitHub/MavenInAction/Chapter18/demo08 (master)
$ mvn archetype:generate \
-DarchetypeGroupId=com.coderdream \
-DarchetypeCatalog=local \
-DarchetypeArtifactId=archetype-demo \
-DarchetypeVersion=1.0
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] >>> maven-archetype-plugin:3.0.1:generate (default-cli) > generate-sources @ standalone-pom >>>
[INFO]
[INFO] <<< maven-archetype-plugin:3.0.1:generate (default-cli) < generate-sources @ standalone-pom <<<
[INFO]
[INFO]
[INFO] --- maven-archetype-plugin:3.0.1:generate (default-cli) @ standalone-pom ---
[INFO] Generating project in Interactive mode
[INFO] Archetype repository not defined. Using the one from [com.coderdream:archetype-demo:1.0] found in catalog local
Define value for property 'groupId': com.coderdream
Define value for property 'artifactId': demo08
Define value for property 'version' 1.0-SNAPSHOT: : 1.0
Define value for property 'package' com.coderdream: :
Confirm properties configuration:
groupId: com.coderdream
artifactId: demo08
version: 1.0
package: com.coderdream
 Y: : Y
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Archetype: archetype-demo:1.0
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: groupId, Value: com.coderdream
[INFO] Parameter: artifactId, Value: demo08
[INFO] Parameter: version, Value: 1.0
[INFO] Parameter: package, Value: com.coderdream
[INFO] Parameter: packageInPathFormat, Value: com/coderdream
[INFO] Parameter: package, Value: com.coderdream
[INFO] Parameter: version, Value: 1.0
[INFO] Parameter: groupId, Value: com.coderdream
[INFO] Parameter: artifactId, Value: demo08
[INFO] Project created from Archetype in dir: D:\Java\GitHub\MavenInAction\Chapter18\demo08\demo08
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 24.652 s
[INFO] Finished at: 2019-01-15T12:59:58+08:00
[INFO] Final Memory: 14M/155M
[INFO] ------------------------------------------------------------------------
```

- 方式2：在Demo09中执行批处理命令
```
mvn archetype:generate -B \
-DarchetypeGroupId=com.coderdream \
-DarchetypeCatalog=local \
-DarchetypeArtifactId=archetype-demo \
-DarchetypeVersion=1.0 \
-DgroupId=com.com.coderdream \
-DartifactId=archetype-test \
-Dversion=1.0-SNAPSHOT
```

- 执行结果
```
$ mvn archetype:generate -B \
-DarchetypeGroupId=com.coderdream \
-DarchetypeCatalog=local \
-DarchetypeArtifactId=archetype-demo \
-DarchetypeVersion=1.0 \
-DgroupId=com.com.coderdream \
-DartifactId=archetype-test \
-Dversion=1.0-SNAPSHO
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building Maven Stub Project (No POM) 1
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] >>> maven-archetype-plugin:3.0.1:generate (default-cli) > generate-sources @ standalone-pom >>>
[INFO]
[INFO] <<< maven-archetype-plugin:3.0.1:generate (default-cli) < generate-sources @ standalone-pom <<<
[INFO]
[INFO]
[INFO] --- maven-archetype-plugin:3.0.1:generate (default-cli) @ standalone-pom ---
[INFO] Generating project in Batch mode
[INFO] Archetype repository not defined. Using the one from [com.coderdream:archetype-demo:1.0] found in catalog local
[INFO] ----------------------------------------------------------------------------
[INFO] Using following parameters for creating project from Archetype: archetype-demo:1.0
[INFO] ----------------------------------------------------------------------------
[INFO] Parameter: groupId, Value: com.com.coderdream
[INFO] Parameter: artifactId, Value: archetype-test
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: package, Value: com.com.coderdream
[INFO] Parameter: packageInPathFormat, Value: com/com/coderdream
[INFO] Parameter: package, Value: com.com.coderdream
[INFO] Parameter: version, Value: 1.0-SNAPSHOT
[INFO] Parameter: groupId, Value: com.com.coderdream
[INFO] Parameter: artifactId, Value: archetype-test
[INFO] Project created from Archetype in dir: D:\Java\GitHub\MavenInAction\Chapter18\archetype-test
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.937 s
[INFO] Finished at: 2019-01-15T14:07:25+08:00
[INFO] Final Memory: 15M/220M
[INFO] ------------------------------------------------------------------------
```

### 重构

- 1、修改pom.xml 中的 groupId、artifactId 和 version：
```xml
<groupId>org.activiti</groupId>
<artifactId>activiti-archetype-unittest2</artifactId>
<version>6.0.0</version>
```

- 2、修改其他文件



- 3、成功执行批处理命令
```
mvn archetype:generate -B \
-DarchetypeCatalog=local \
-DarchetypeGroupId=org.activiti \
-DarchetypeArtifactId=activiti-archetype-unittest2 \
-DarchetypeVersion=6.0.0 \
-DgroupId=com.coderdream \
-DartifactId=archetype-test2 \
-Dversion=1.0-SNAPSHOT \
-Dpackage=com.coderdream
```
## [《maven实战》十四、archetype](https://www.jianshu.com/p/3c9e29e6eacf)

###  编写自己的archetype项目

- demo0301 交互式
```
mvn archetype:generate \
-DarchetypeGroupId=com.zheng.archetypestudy \
-DarchetypeArtifactId=archetype-test \
-DarchetypeVersion=1.0-SNAPSHOT
```
- demo0302 批处理
```
mvn archetype:generate -B \
-DarchetypeGroupId=com.zheng.archetypestudy \
-DarchetypeArtifactId=archetype-test \
-DarchetypeVersion=1.0-SNAPSHOT \
-DartifactId=demo0302 \
-Dversion=1.0
```



### 参考文档

1.  [Maven - 自定义archetype](https://www.jianshu.com/p/ac9b7d0556d1)
2.  [Selenium2-Java-QuickStart-Archetype](https://github.com/sebarmeli/Selenium2-Java-QuickStart-Archetype)
3.  [编写自己的SpringBoot-starter](https://www.cnblogs.com/yuansc/p/9088212.html)
4.  [Maven 自定义archeType](https://www.jianshu.com/p/724a9fa7b37a)
5.  [《maven实战》十四、archetype](https://www.jianshu.com/p/3c9e29e6eacf)
6.  [IDEA中maven项目创建并使用自己的archetype](https://blog.csdn.net/qq_21251983/article/details/52252970)
7.  [自定义Maven模板(Archetype)](https://blog.csdn.net/TKDK_bot/article/details/85296918)
8.  [Maven自定义archetype生成项目骨架](https://blog.csdn.net/jeikerxiao/article/details/60324029)
9.  [Maven自定义ArcheType踩过的坑](https://blog.csdn.net/wanxu12345678910/article/details/55099461)
10.  [maven自定义catalog创建archetype](https://blog.csdn.net/lff1991/article/details/76550363)
11.  [手写Maven的archetype项目脚手架](https://www.cnblogs.com/hafiz/p/5515388.html)