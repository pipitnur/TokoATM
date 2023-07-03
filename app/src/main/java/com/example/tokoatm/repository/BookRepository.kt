package com.example.tokoatm.repository

import com.example.tokoatm.dao.BookDao
import com.example.tokoatm.dao.BukuDao
import com.example.tokoatm.model.Book
import com.example.tokoatm.model.Buku
import kotlinx.coroutines.flow.Flow

class BookRepository(private val BookDao: BookDao) {
    val allBooks: Flow<List<Book>> = BookDao.getAllBook()

    suspend fun insertBook(Book: Book) {
        BookDao.insertBook(Book)
    }

    suspend fun deleteBook(Book: Book) {
        BookDao.updateBook(Book)
    }

    fun updateBook(Book: Book) {

    }
}