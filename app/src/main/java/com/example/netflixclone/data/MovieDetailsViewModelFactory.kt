package com.example.netflixclone.data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.netflixclone.data.MovieDetailsViewModel

class MovieDetailsViewModelFactory(private val repository: MediaRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MovieDetailsViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return MovieDetailsViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}