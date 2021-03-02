package com.aa.android.cleanarchikotlin.data.repository

interface IRepository {
    fun getPhotos(): List<IRepositoryPhotoModel>
}

interface IRepositoryPhotoModel {
    val url: String
}