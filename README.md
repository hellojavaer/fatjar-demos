# fatjar-examples


### 使用说明

```
1. clone到本地,在根目录下执行 mvn clean install (这样做是为了把fatjar build进本地仓库)
2. 注释掉根pom的 <module>demo1-fatjar</module> 和 <module>demo2-fatjar</module> (这样做是为了避免编译器报类找不到异常,
    这只会出现你build fatjar的工程和使用fatjar的工程在同一工程时会出现这种情况,详细的说明我会单独列个item说明为什么需要这样处理)
3. 测试独立运行jar, 进入 'demo3-fatjar/target/' 目录下, 执行 'java -jar demo3-fatjar-1.0-SNAPSHOT.jar'

```
