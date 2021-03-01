package com.aa.android.cleanarchikotlin.data.repository

import com.aa.android.cleanarchikotlin.data.local.ILocalData
import com.aa.android.cleanarchikotlin.data.network.INetworkData
import com.aa.android.cleanarchikotlin.featureGallery.entities.IPhoto

class Repository(
    private val localData: ILocalData,
    private val networkData: INetworkData
) : IRepository {
    override fun getPhotos(): List<IPhoto> = localData.getPhotos()
}