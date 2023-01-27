package com.example.netflixclone.network.models

import com.example.netflixclone.data_models.Video

data class VideosResponse(
    val results: List<Video>,
)