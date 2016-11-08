﻿# gradle   springBoot  项目例子

## 使用环境
- java `jdk1.8.0_101`
- gradle `gradle-3.0`
- IntelliJ IDEA 2016

## 说明
- 使用了redis
- SHA1和MD5字符串进行加密

# 使用方法
进入项目目录:
```bash
gradle build
```
找到对应的jar包
```bash
java -jar springBoot_gradle-0.1.0.jar
```

## redis使用
成功运行以后，测试redis

- 本地服务测试

	- 测试 [http://localhost:8080/set?key=lv&&value=xiaobao](http://localhost:8080/set?key=lv&&value=xiaobao)

	- 测试 [http://localhost:8080/get?key=lv](http://localhost:8080/get?key=lv)

## SHA1和MD5字符串进行加密
成功运行以后，测试加密

- 本地服务测试

	- SHA1加密测试 [http://localhost:8080/sha1/lvbaolin](http://localhost:8080/sha1/lvbaolin)

	- MD5加密测试 [http://localhost:8080/md5/lvbaolin](http://localhost:8080/md5/lvbaolin)
