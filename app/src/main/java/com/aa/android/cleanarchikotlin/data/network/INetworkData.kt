package com.aa.android.cleanarchikotlin.data.network

interface INetworkData {
    fun getPhotos(): List<INetworkPhotoModel>
}

interface INetworkPhotoModel {
    val url: String
}