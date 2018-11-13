package com.example.ininmm.koinsample.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ininmm.koinsample.data.dao.BookDao
import com.example.ininmm.koinsample.data.entity.Book

@Database(entities = [Book::class], version = 1, exportSchema = true)
abstract class KoinDataBase : RoomDatabase() {

    abstract fun bookDao(): BookDao
}