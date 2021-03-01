package com.aa.android.cleanarchikotlin.featureGallery.ui.viewmodels

import com.aa.android.cleanarchikotlin.featureGallery.entities.IPhoto

interface IGalleryViewModel {
    fun retrievedPhotos(photos: List<IPhoto>)
}