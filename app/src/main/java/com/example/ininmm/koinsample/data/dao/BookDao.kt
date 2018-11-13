package com.example.ininmm.koinsample.data.dao

import androidx.room.*
import com.example.ininmm.koinsample.data.entity.Book

@Dao
interface BookDao {

    @Query("SELECT * FROM book")
    fun getAll(): List<Book>

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateBook(book: Book): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(book: Book): Long

    @Delete
    fun delect(book: Book): Int
}