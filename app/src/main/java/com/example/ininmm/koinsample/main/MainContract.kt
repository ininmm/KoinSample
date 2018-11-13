package com.example.ininmm.koinsample.main

interface MainContract {

    interface Presenter {

        fun mockBooks()

        fun loadBook()

        fun example()
    }

    interface View {

        fun showBookName(bookName: String)

        fun showError(error: Error)

        fun showSuccess(success: Boolean)

        fun showMessage(msg: String)
    }
}