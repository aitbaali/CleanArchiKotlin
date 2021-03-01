package com.aa.android.cleanarchikotlin.featureGallery.presenters

import com.aa.android.cleanarchikotlin.featureGallery.entities.IPhoto
import com.aa.android.cleanarchikotlin.featureGallery.ui.viewmodels.IGalleryViewModel

class GalleryPresenter(private val viewModel: IGalleryViewModel) : IGalleryPresenter {
    override fun retrievedPhotos(photos: List<IPhoto>) {
        viewModel.retrievedPhotos(photos)
    }
}