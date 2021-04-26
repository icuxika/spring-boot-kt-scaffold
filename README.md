Spring Boot 脚手架项目（Kotlin）
==========

### 依赖项

* `MySQL（8）`
* `MyBatis`
* `MyBatis Dynamic SQL`
* `Flyway`

### 使用

- 创建数据库，修改`build.gradle.kts`中`flyway`配置，然后执行`gradle flywayMigrate`，`flyway`将会自动执行`src/main/resources/db/migration`
  下的`sql`文件创建相应数据表。
- 修改`generatorConfig.xml`中`classPathEntry`配置项，修改`generatorConfig.properties`
  配置项，执行测试任务`gradle test --tests "com.icuxika.scaffold.SpringBootKtScaffoldApplicationTests.mybatisDynamicGenerate"`
  ，将会按照[MyBatis Dynamic SQL](https://mybatis.org/mybatis-dynamic-sql/docs/introduction.html)来生成相应`Mapper`与`Entity`类。