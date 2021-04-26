package com.icuxika.scaffold

import org.junit.jupiter.api.Test
import org.mybatis.generator.api.MyBatisGenerator
import org.mybatis.generator.config.Configuration
import org.mybatis.generator.config.xml.ConfigurationParser
import org.mybatis.generator.internal.DefaultShellCallback
import org.springframework.boot.test.context.SpringBootTest
import java.io.File


@SpringBootTest
class SpringBootKtScaffoldApplicationTests {

    @Test
    fun contextLoads() {
    }

    /**
     * 使用 MyBatis Generator 生成相关类
     */
    @Test
    fun mybatisDynamicGenerate() {
        val warnings: List<String> = ArrayList()
        val overwrite = true
        val configFile = File("src/main/resources/generatorConfig.xml")
        val cp = ConfigurationParser(warnings)
        val config: Configuration = cp.parseConfiguration(configFile)
        val callback = DefaultShellCallback(overwrite)
        val myBatisGenerator = MyBatisGenerator(config, callback, warnings)
        myBatisGenerator.generate(null)
    }

}
