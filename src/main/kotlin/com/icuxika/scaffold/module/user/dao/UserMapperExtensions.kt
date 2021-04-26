/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2021-04-26T15:38:14.9452851+08:00
 */
package com.icuxika.scaffold.module.user.dao

import com.icuxika.scaffold.module.user.dao.UserDynamicSqlSupport.User
import com.icuxika.scaffold.module.user.dao.UserDynamicSqlSupport.User.id
import com.icuxika.scaffold.module.user.dao.UserDynamicSqlSupport.User.password
import com.icuxika.scaffold.module.user.dao.UserDynamicSqlSupport.User.username
import com.icuxika.scaffold.module.user.entity.UserRecord
import org.mybatis.dynamic.sql.SqlBuilder.isEqualTo
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*

fun UserMapper.count(completer: CountCompleter) =
    countFrom(this::count, User, completer)

fun UserMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, User, completer)

fun UserMapper.deleteByPrimaryKey(id_: Long) =
    delete {
        where(id, isEqualTo(id_))
    }

fun UserMapper.insert(record: UserRecord) =
    insert(this::insert, record, User) {
        map(id).toProperty("id")
        map(username).toProperty("username")
        map(password).toProperty("password")
    }

fun UserMapper.insertMultiple(records: Collection<UserRecord>) =
    insertMultiple(this::insertMultiple, records, User) {
        map(id).toProperty("id")
        map(username).toProperty("username")
        map(password).toProperty("password")
    }

fun UserMapper.insertMultiple(vararg records: UserRecord) =
    insertMultiple(records.toList())

fun UserMapper.insertSelective(record: UserRecord) =
    insert(this::insert, record, User) {
        map(id).toPropertyWhenPresent("id", record::id)
        map(username).toPropertyWhenPresent("username", record::username)
        map(password).toPropertyWhenPresent("password", record::password)
    }

private val columnList = listOf(id, username, password)

fun UserMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, User, completer)

fun UserMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, User, completer)

fun UserMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, User, completer)

fun UserMapper.selectByPrimaryKey(id_: Long) =
    selectOne {
        where(id, isEqualTo(id_))
    }

fun UserMapper.update(completer: UpdateCompleter) =
    update(this::update, User, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: UserRecord) =
    apply {
        set(id).equalTo(record::id)
        set(username).equalTo(record::username)
        set(password).equalTo(record::password)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: UserRecord) =
    apply {
        set(id).equalToWhenPresent(record::id)
        set(username).equalToWhenPresent(record::username)
        set(password).equalToWhenPresent(record::password)
    }

fun UserMapper.updateByPrimaryKey(record: UserRecord) =
    update {
        set(username).equalTo(record::username)
        set(password).equalTo(record::password)
        where(id, isEqualTo(record::id))
    }

fun UserMapper.updateByPrimaryKeySelective(record: UserRecord) =
    update {
        set(username).equalToWhenPresent(record::username)
        set(password).equalToWhenPresent(record::password)
        where(id, isEqualTo(record::id))
    }