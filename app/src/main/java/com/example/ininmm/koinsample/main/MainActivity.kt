package com.example.ininmm.koinsample.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.ininmm.koinsample.R
import com.example.ininmm.koinsample.data.source.BookDataSource
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity(), MainContract.View {

    private val presenter: MainContract.Presenter by inject { parametersOf(this) }

    private val localSource: BookDataSource by inject("LocalData")

    private val remoteSource: BookDataSource by inject("RemoteData")

    private val repository: BookDataSource by inject("repository")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        btnClickToLoadBook.setOnClickListener { presenter.loadBook() }
    }

    private fun init() {
        presenter.mockBooks()
    }

    override fun showBookName(bookName: String) {
        txtBookInfo.text = bookName
    }

    override fun showError(error: Error) {
        Log.e(this::class.java.simpleName, error.message)
    }

    override fun showSuccess(success: Boolean) {
        if (success) {
            Toast.makeText(this, "Successful!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Failure!", Toast.LENGTH_SHORT).show()
        }
    }

    override fun showMessage(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
