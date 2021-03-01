package com.aa.android.cleanarchikotlin.data.network

import com.aa.android.cleanarchikotlin.featureGallery.entities.IPhoto

interface INetworkData {
    fun getPhotos(): List<IPhoto>
}