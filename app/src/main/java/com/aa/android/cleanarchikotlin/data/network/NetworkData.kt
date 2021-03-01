package com.aa.android.cleanarchikotlin.data.network

import com.aa.android.cleanarchikotlin.featureGallery.entities.IPhoto
import com.aa.android.cleanarchikotlin.featureGallery.entities.Photo

class NetworkData : INetworkData {
    override fun getPhotos(): List<IPhoto> =
        arrayListOf(
            Photo("https://wallpapercave.com/wp/wp3121130.jpg"),
            Photo("https://wallpaperaccess.com/full/1472687.jpg"),
            Photo("https://i.pinimg.com/originals/76/6c/5f/766c5f67f47b2c4169bb9ca0a816cf1b.jpg")
        )
}