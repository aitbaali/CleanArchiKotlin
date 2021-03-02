package com.aa.android.cleanarchikotlin.featureGallery.ui.viewmodels

import com.aa.android.cleanarchikotlin.featureGallery.presenters.IPresenterPhotoModel

interface IGalleryViewModel {
    fun retrievedPhotos(photos: List<IPresenterPhotoModel>)
}

interface IGalleryPhotoModel {
    val url: String
}