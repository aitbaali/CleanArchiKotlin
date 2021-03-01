package com.aa.android.cleanarchikotlin.featureGallery.controlers

import com.aa.android.cleanarchikotlin.featureGallery.interactors.IGalleryInteractor

class GalleryController(private val interactor: IGalleryInteractor) : IGalleryController {
    override fun retrievePhotos() {
        interactor.retrievePhotos()
    }
}