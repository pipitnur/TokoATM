package com.example.tokoatm.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.tokoatm.model.Book
import com.example.tokoatm.model.Buku
import kotlinx.coroutines.flow.Flow

@Dao
interface BookDao {
    @Query("SELECT * FROM `book_table` ORDER BY name ASC")
    fun getAllBook(): Flow<List<Book>>

    @Insert
    suspend fun insertBook(Book: Book)

    @Delete
    suspend fun deleteBook(Book: Book)

    @Update fun updateBook(Book: Book)
}