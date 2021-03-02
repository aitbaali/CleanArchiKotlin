package com.aa.android.cleanarchikotlin.featureGallery.ui.viewmodels

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.aa.android.cleanarchikotlin.entities.IPhoto
import com.aa.android.cleanarchikotlin.entities.Photo
import com.aa.android.cleanarchikotlin.featureGallery.presenters.IGalleryPresenter
import com.nhaarman.mockito_kotlin.mock
import org.junit.Assert
import org.junit.Rule
import org.junit.Test

class GalleryViewModelTest {

    @get:Rule
    val rule: InstantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun `loading photos should update view model live data`() {
        val presenter: IGalleryPresenter = mock()
        val viewModel = GalleryViewModel()

        val photos = listOf<IPhoto>(Photo(url = "url1"), Photo(url = "url2"), Photo(url = "url3"))
        presenter.retrievedPhotos(photos)

        viewModel.photos.observeForever { _photos ->
            Assert.assertEquals(_photos[0].url, "url1")
            Assert.assertEquals(_photos[1].url, "url2")
            Assert.assertEquals(_photos[2].url, "url3")
        }
    }

    @Test
    fun `loading empty photos should update view model live data`() {
        val presenter: IGalleryPresenter = mock()
        val viewModel = GalleryViewModel()

        presenter.retrievedPhotos(listOf())

        viewModel.photos.observeForever { _photos ->
            Assert.assertEquals(_photos, emptyList<IPhoto>())
        }
    }
}