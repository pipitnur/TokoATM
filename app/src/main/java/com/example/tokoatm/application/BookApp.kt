package com.example.tokoatm.application

import android.app.Application
import com.example.tokoatm.model.Book
import com.example.tokoatm.repository.BookRepository

class BookApp: Application() {
    val database by lazy { BookDatabase.getDatabase(this)}
    val repository by lazy { BookRepository(database.BookDao()) }
}