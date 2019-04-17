package com.narims.newproj.repo.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.narims.newproj.model.Todo
import io.reactivex.Completable
import io.reactivex.Single

@Dao
interface TodoDao {
    @Insert
    fun insertOne(todo: Todo): Completable

    @Insert
    fun insertList(todoList: List<Todo>): Completable

    @Query("DELETE FROM todo WHERE id=:id")
    fun deleteOne(id: Int): Completable

    @Query("DELETE FROM todo")
    fun deleteAll(): Completable

    @Query("SELECT * FROM todo")
    fun getAllUsers(): Single<Todo>

    @Query("SELECT * FROM todo WHERE id=:id")
    fun getOneUser(id: Int): Single<Todo>
}