package com.aa.android.cleanarchikotlin.featureGallery.ui.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aa.android.cleanarchikotlin.featureGallery.Configuration
import com.aa.android.cleanarchikotlin.featureGallery.controlers.IGalleryController
import com.aa.android.cleanarchikotlin.featureGallery.entities.IPhoto

// need to now the controller
// get data from presenter
class GalleryViewModel : ViewModel(), IGalleryViewModel {
    private val controller: IGalleryController by lazy { Configuration.config(this) }
    private var _photos = MutableLiveData<List<IPhoto>>()
    val photos: LiveData<List<IPhoto>> = _photos

    fun retrievePhotos() {
        controller.retrievePhotos()
    }

    override fun retrievedPhotos(photos: List<IPhoto>) {
        _photos.value = photos
    }
}