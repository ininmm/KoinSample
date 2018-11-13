package com.example.ininmm.koinsample.data.source

import android.util.Log
import com.example.ininmm.koinsample.data.entity.Book

class BookRemoteDataSource : BookDataSource {
    override fun loadBook(books: ((List<Book>) -> Unit)?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addBook(book: Book, success: ((Boolean) -> Unit)?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateBook(book: Book, success: ((Boolean) -> Unit)?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clearData(book: Book, success: ((Boolean) -> Unit)?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun example() {
        Log.e(this::class.java.simpleName, "Log RemoteData!")
    }
}