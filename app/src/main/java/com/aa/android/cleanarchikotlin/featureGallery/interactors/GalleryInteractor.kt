package com.aa.android.cleanarchikotlin.featureGallery.interactors

import com.aa.android.cleanarchikotlin.data.repository.IRepository
import com.aa.android.cleanarchikotlin.featureGallery.presenters.IGalleryPresenter

class GalleryInteractor(
    private val repository: IRepository,
    private val presenter: IGalleryPresenter
) : IGalleryInteractor {
    override fun retrievePhotos() {
        val photos = repository.getPhotos()
        presenter.retrievedPhotos(photos)
    }
}