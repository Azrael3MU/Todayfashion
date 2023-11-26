package com.example.todayfashion
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface AccountInterface {
    @Insert
    fun insertItem(item:Item)
    @Query("SELECT * FROM items")
    fun getAllItems(): Flow<List<Item>>
    @Delete
    fun delete()
}