package com.aa.android.cleanarchikotlin.featureGallery.interactors

interface IGalleryInteractor {
    fun retrievePhotos()
}

interface IInteractorPhotoModel {
    val url: String
}