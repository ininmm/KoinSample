package com.example.ininmm.koinsample.data.repository

import com.example.ininmm.koinsample.data.entity.Book
import com.example.ininmm.koinsample.data.source.BookDataSource
import com.example.ininmm.koinsample.utils.IAppExecutors

class BookRepository(private val bookLocalDataSource: BookDataSource,
                     private val bookRemoteDataSource: BookDataSource,
                     private val appExecutors: IAppExecutors) : BookDataSource {
    override fun loadBook(books: ((List<Book>) -> Unit)?) {

        val hasNetWork = false

        if (hasNetWork) {
            bookRemoteDataSource.loadBook(books)
        } else {
            bookLocalDataSource.loadBook(books)
        }
    }

    override fun addBook(book: Book, success: ((Boolean) -> Unit)?) {
        bookLocalDataSource.addBook(book, success)
    }

    override fun updateBook(book: Book, success: ((Boolean) -> Unit)?) {
        bookLocalDataSource.updateBook(book, success)
    }

    override fun clearData(book: Book, success: ((Boolean) -> Unit)?) {
        bookLocalDataSource.clearData(book, success)
    }

    override fun example() {
        bookLocalDataSource.example()
    }
}