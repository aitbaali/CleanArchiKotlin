package com.aa.android.cleanarchikotlin.featureGallery.presenters

import com.aa.android.cleanarchikotlin.featureGallery.interactors.IInteractorPhotoModel

interface IGalleryPresenter {
    fun retrievedPhotos(photos: List<IInteractorPhotoModel>)
}

interface IPresenterPhotoModel {
    val url: String
}