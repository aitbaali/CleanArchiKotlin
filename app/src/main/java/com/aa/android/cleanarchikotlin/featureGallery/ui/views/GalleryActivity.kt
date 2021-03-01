package com.aa.android.cleanarchikotlin.featureGallery.ui.views

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.aa.android.cleanarchikotlin.databinding.ActivityGalleryBinding
import com.aa.android.cleanarchikotlin.featureGallery.ui.viewmodels.GalleryViewModel
import com.aa.android.cleanarchikotlin.featureGallery.ui.views.adapters.GalleryListAdapter

// need to now the view model
// get data from the view model(LiveData)
class GalleryActivity : AppCompatActivity() {

    private val viewModel: GalleryViewModel by viewModels()
    private lateinit var binding: ActivityGalleryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGalleryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = GalleryListAdapter()
        binding.apply {
            recyclerGallery.setHasFixedSize(true)
            recyclerGallery.adapter = adapter
        }

        viewModel.photos.observe(this) { photos ->
            adapter.submitList(photos)
        }
    }

    override fun onResume() {
        super.onResume()
        viewModel.retrievePhotos()
    }
}