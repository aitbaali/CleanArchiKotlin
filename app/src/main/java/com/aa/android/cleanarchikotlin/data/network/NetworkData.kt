package com.aa.android.cleanarchikotlin.data.network

class NetworkData : INetworkData {
    override fun getPhotos(): List<INetworkPhotoModel> =
        arrayListOf(
            NetworkPhotoModel("https://wallpapercave.com/wp/wp3121130.jpg"),
            NetworkPhotoModel("https://wallpaperaccess.com/full/1472687.jpg"),
            NetworkPhotoModel("https://i.pinimg.com/originals/76/6c/5f/766c5f67f47b2c4169bb9ca0a816cf1b.jpg")
        )
}

private data class NetworkPhotoModel(override val url: String) : INetworkPhotoModel