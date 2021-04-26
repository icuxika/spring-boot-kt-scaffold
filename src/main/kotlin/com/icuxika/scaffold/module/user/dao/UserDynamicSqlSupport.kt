/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2021-04-26T15:38:14.9342853+08:00
 */
package com.icuxika.scaffold.module.user.dao

import java.sql.JDBCType
import org.mybatis.dynamic.sql.SqlTable

object UserDynamicSqlSupport {
    object User : SqlTable("t_user") {
        val id = column<Long>("id", JDBCType.BIGINT)

        val username = column<String>("username", JDBCType.VARCHAR)

        val password = column<String>("password", JDBCType.VARCHAR)
    }
}