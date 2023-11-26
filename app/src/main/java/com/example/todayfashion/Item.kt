package com.example.todayfashion

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "items")
data class Item(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    @ColumnInfo(name="login")
    var login: String,
    @ColumnInfo(name="email")
    var email:String,
    @ColumnInfo(name="password")
    var password:String
)
