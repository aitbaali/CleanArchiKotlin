package com.aa.android.cleanarchikotlin.data.repository

import com.aa.android.cleanarchikotlin.featureGallery.entities.IPhoto

interface IRepository {
    fun getPhotos(): List<IPhoto>
}