package com.example.ininmm.koinsample.data.source

import com.example.ininmm.koinsample.data.entity.Book

interface BookDataSource {

    fun loadBook(books: ((List<Book>) -> Unit)? = null)

    fun addBook(book: Book, success: ((Boolean) -> Unit)? = null)

    fun updateBook(book: Book, success: ((Boolean) -> Unit)? = null)

    fun clearData(book: Book, success: ((Boolean) -> Unit)? = null)

    fun example()
}