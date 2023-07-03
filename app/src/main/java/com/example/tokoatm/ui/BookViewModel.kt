package com.example.tokoatm.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.tokoatm.model.Book
import com.example.tokoatm.repository.BookRepository
import kotlinx.coroutines.launch
import java.lang.IllegalArgumentException

class BookViewModel(private val repository: BookRepository): ViewModel() {
    val allTires: LiveData<List<Book>> = repository.allBooks.asLiveData()

    fun insert(Book: Book) = viewModelScope.launch {
        repository.insertBook(Book)
    }

    fun delete(Book: Book) = viewModelScope.launch {
        repository.deleteBook(Book)
    }

    fun update(Book: Book) = viewModelScope.launch {
        repository.updateBook(Book)
    }
}
class BookViewModelFactory(private val repository: BookRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(BookViewModel::class.java))) run {
            return BookViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel")
    }
}