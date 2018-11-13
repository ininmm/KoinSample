package com.example.ininmm.koinsample.data.source

import android.util.Log
import com.example.ininmm.koinsample.data.dao.BookDao
import com.example.ininmm.koinsample.data.entity.Book
import com.example.ininmm.koinsample.utils.IAppExecutors

class BookLocalDataSource(private val bookDao: BookDao,
                          private val appExecutors: IAppExecutors
) : BookDataSource {
    override fun loadBook(books: ((List<Book>) -> Unit)?) {
        appExecutors.diskIO().execute {
            val book = bookDao.getAll()
            appExecutors.mainThread().execute { books?.invoke(book) }
        }
    }

    override fun addBook(book: Book, success: ((Boolean) -> Unit)?) {
        appExecutors.diskIO().execute {
            val isSuccess = bookDao.insert(book) > 0
            appExecutors.mainThread().execute { success?.invoke(isSuccess) }
        }
    }

    override fun updateBook(book: Book, success: ((Boolean) -> Unit)?) {
        appExecutors.diskIO().execute {
            val isSuccess = bookDao.updateBook(book) > 0
            appExecutors.mainThread().execute { success?.invoke(isSuccess) }
        }
    }

    override fun clearData(book: Book, success: ((Boolean) -> Unit)?) {
        appExecutors.diskIO().execute {
            val isSuccess = bookDao.delect(book) > 0
            appExecutors.mainThread().execute { success?.invoke(isSuccess) }
        }
    }

    override fun example() {
        Log.e(this::class.java.simpleName, "Log LocalData!")
    }
}