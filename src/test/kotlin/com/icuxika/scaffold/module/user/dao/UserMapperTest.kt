package com.icuxika.scaffold.module.user.dao

import com.icuxika.scaffold.module.user.entity.UserRecord
import org.junit.jupiter.api.Test
import org.mybatis.dynamic.sql.SqlBuilder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class UserMapperTest {

    @Autowired
    private lateinit var userMapper: UserMapper

    @Test
    fun insertOne() {
        userMapper.insert(UserRecord(null, "user1", "pass1"))
    }

    @Test
    fun selectOne() {
        userMapper.selectOne {
            where(UserDynamicSqlSupport.User.username, SqlBuilder.isEqualTo("user1"))
        }?.let { userRecord ->
            println(userRecord)
        }
    }
}