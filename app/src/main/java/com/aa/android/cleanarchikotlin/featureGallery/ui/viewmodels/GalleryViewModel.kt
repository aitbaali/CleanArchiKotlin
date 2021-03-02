package com.aa.android.cleanarchikotlin.featureGallery.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aa.android.cleanarchikotlin.featureGallery.Configuration
import com.aa.android.cleanarchikotlin.featureGallery.controlers.IGalleryController
import com.aa.android.cleanarchikotlin.featureGallery.presenters.IPresenterPhotoModel

// need to now the controller
// get data from presenter
class GalleryViewModel : ViewModel(), IGalleryViewModel {
    private val controller: IGalleryController by lazy { Configuration.config(this) }
    private var _photos = MutableLiveData<List<IGalleryPhotoModel>>()
    val photos: LiveData<List<IGalleryPhotoModel>> = _photos

    fun retrievePhotos() {
        controller.retrievePhotos()
    }

    override fun retrievedPhotos(photos: List<IPresenterPhotoModel>) {
        _photos.value = photos.map { GalleryPhotoModel(it.url) }
    }
}

private data class GalleryPhotoModel(override val url: String) : IGalleryPhotoModel