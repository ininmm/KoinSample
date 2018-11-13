package com.example.ininmm.koinsample.main

import android.util.Log
import com.example.ininmm.koinsample.data.entity.Book
import com.example.ininmm.koinsample.data.source.BookDataSource

class MainPresenter(private val bookRepository: BookDataSource,
                    private val view: MainContract.View) : MainContract.Presenter {
    override fun mockBooks() {
        var isSuccess = true
        val books = mutableListOf(
            Book("The Witcher", "Andrew", false),
            Book("Harry Porter", "J.K.Rolling", true),
            Book("Odyssey", "Homer", false))
        books.forEach { it ->
            bookRepository.addBook(it) { success ->
                isSuccess = isSuccess and success
            }
        }
        Log.e(this::class.java.simpleName, "mock books : $isSuccess")
    }

    override fun loadBook() {
        bookRepository.loadBook {
            Log.e(this::class.java.simpleName, "amount to : ${it.size}")
            view.showBookName(it[(0 until it.size).random()].name)
        }
    }

    override fun example() {
        bookRepository.example()
    }
}