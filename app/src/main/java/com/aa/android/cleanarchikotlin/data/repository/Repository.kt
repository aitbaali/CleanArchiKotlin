package com.aa.android.cleanarchikotlin.data.repository

import com.aa.android.cleanarchikotlin.data.local.ILocalData
import com.aa.android.cleanarchikotlin.data.network.INetworkData

class Repository(
    private val localData: ILocalData,
    private val networkData: INetworkData
) : IRepository {
    override fun getPhotos(): List<IRepositoryPhotoModel> =
        localData.getPhotos().map { RepositoryPhotoModel(it.url) }
}

private data class RepositoryPhotoModel(override val url: String) : IRepositoryPhotoModel

//GIVEN : context ----> user access gallery AND local repository fails
//WHEN  : action ----> retrieval is requested
//THEN  : result ----> an error is notified