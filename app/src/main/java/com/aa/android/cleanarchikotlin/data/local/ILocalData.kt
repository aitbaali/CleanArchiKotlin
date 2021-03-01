package com.aa.android.cleanarchikotlin.data.local

import com.aa.android.cleanarchikotlin.featureGallery.entities.IPhoto

interface ILocalData {
    fun getPhotos(): List<IPhoto>
}