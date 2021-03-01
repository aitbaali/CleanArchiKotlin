package com.aa.android.cleanarchikotlin.data.local

import com.aa.android.cleanarchikotlin.featureGallery.entities.IPhoto
import com.aa.android.cleanarchikotlin.featureGallery.entities.Photo

class LocalData : ILocalData {

    override fun getPhotos(): List<IPhoto> = arrayListOf<IPhoto>(
        Photo("https://i.pinimg.com/originals/91/b5/cd/91b5cdab51e207263169904b227503b4.jpg"),
        Photo("https://images.pexels.com/photos/417074/pexels-photo-417074.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"),
        Photo("https://i.pinimg.com/originals/20/c4/ed/20c4ed904c96d955c7baed21e22d47e0.jpg")
    )
}