package com.aa.android.cleanarchikotlin.featureGallery

import com.aa.android.cleanarchikotlin.data.local.LocalData
import com.aa.android.cleanarchikotlin.data.network.NetworkData
import com.aa.android.cleanarchikotlin.data.repository.Repository
import com.aa.android.cleanarchikotlin.featureGallery.controlers.GalleryController
import com.aa.android.cleanarchikotlin.featureGallery.interactors.GalleryInteractor
import com.aa.android.cleanarchikotlin.featureGallery.presenters.GalleryPresenter
import com.aa.android.cleanarchikotlin.featureGallery.ui.viewmodels.IGalleryViewModel

object Configuration {
    fun config(viewModel: IGalleryViewModel): GalleryController = GalleryController(
        GalleryInteractor(
            Repository(
                LocalData(),
                NetworkData()
            ),
            GalleryPresenter(viewModel)
        )
    )
}