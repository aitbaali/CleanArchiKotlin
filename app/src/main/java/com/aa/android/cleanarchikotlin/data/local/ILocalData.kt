package com.aa.android.cleanarchikotlin.data.local

interface ILocalData {
    fun getPhotos(): List<ILocalPhotoModel>
}

interface ILocalPhotoModel {
    val url: String
}