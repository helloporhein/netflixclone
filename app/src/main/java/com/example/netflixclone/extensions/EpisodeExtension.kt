package com.example.netflixclone.extensions

import com.example.netflixclone.constants.IMAGE_BASE_URL
import com.example.netflixclone.constants.ImageSize
import com.example.netflixclone.data_models.Episode

fun Episode.getStillUrl(size: ImageSize = ImageSize.ORIGINAL): String {
    return "$IMAGE_BASE_URL${size.value}${this.stillPath}"
}
