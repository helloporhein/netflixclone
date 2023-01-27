package com.example.netflixclone.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import com.example.netflixclone.adapters.MovieDiffCallback
import com.example.netflixclone.adapters.MovieViewHolder
import com.example.netflixclone.data_models.Movie
import com.example.netflixclone.databinding.ItemMediaBinding

class PagedMoviesAdapter(private val onItemClick: ((Movie) -> Unit)) :
        PagingDataAdapter<Movie, MovieViewHolder>(MovieDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = ItemMediaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(binding, onItemClick)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val media = getItem(position)
        holder.bind(media)
    }
}