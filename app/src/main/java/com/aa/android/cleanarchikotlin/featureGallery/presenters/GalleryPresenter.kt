package com.aa.android.cleanarchikotlin.featureGallery.presenters

import com.aa.android.cleanarchikotlin.featureGallery.interactors.IInteractorPhotoModel
import com.aa.android.cleanarchikotlin.featureGallery.ui.viewmodels.IGalleryViewModel

class GalleryPresenter(private val viewModel: IGalleryViewModel) : IGalleryPresenter {
    override fun retrievedPhotos(photos: List<IInteractorPhotoModel>) {
        viewModel.retrievedPhotos(photos.map { PresenterPhotoModel(it.url) })
    }
}

private data class PresenterPhotoModel(override val url: String) : IPresenterPhotoModel