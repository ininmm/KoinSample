package com.example.ininmm.koinsample.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Book (var name: String,

                 var author: String?,

                 @ColumnInfo(name = "borrow")
                 var isBorrow: Boolean) {
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0
}