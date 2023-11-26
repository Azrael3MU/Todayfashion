package com.example.todayfashion

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Item::class], version = 1)
abstract class AccountDB: RoomDatabase() {
    abstract fun getDao():AccountInterface

    companion object{
        fun getDb(context:Context):AccountDB{
            return Room.databaseBuilder(
                context.applicationContext,
                AccountDB::class.java,
                "TF.db"
            ).build()
        }
    }
}