package com.aa.android.cleanarchikotlin.featureGallery.presenters

import com.aa.android.cleanarchikotlin.featureGallery.entities.IPhoto

interface IGalleryPresenter {
    fun retrievedPhotos(photos: List<IPhoto>)
}