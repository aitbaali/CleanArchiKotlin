package com.aa.android.cleanarchikotlin.featureGallery.ui.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.aa.android.cleanarchikotlin.R
import com.aa.android.cleanarchikotlin.databinding.ItemPhotoBinding
import com.aa.android.cleanarchikotlin.featureGallery.ui.viewmodels.IGalleryPhotoModel
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

class GalleryListAdapter :
    ListAdapter<IGalleryPhotoModel, GalleryListAdapter.ViewHolder>(PHOTO_COMPARATOR) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemPhotoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ViewHolder(private val binding: ItemPhotoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(photo: IGalleryPhotoModel) {
            binding.apply {
                Glide.with(itemView)
                    .load(photo.url)
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .error(R.mipmap.ic_launcher)
                    .into(imageViewPhoto)
            }
        }
    }

    companion object {
        private val PHOTO_COMPARATOR = object : DiffUtil.ItemCallback<IGalleryPhotoModel>() {
            //TODO(AB-AI) Update areItemsTheSame to compare ids instead of urls
            override fun areItemsTheSame(
                oldItem: IGalleryPhotoModel,
                newItem: IGalleryPhotoModel
            ): Boolean = oldItem.url == newItem.url

            //TODO(AB-AI) Update areContentsTheSame to compare data object instead of content urls
            override fun areContentsTheSame(
                oldItem: IGalleryPhotoModel,
                newItem: IGalleryPhotoModel
            ): Boolean = oldItem.url == newItem.url
        }
    }
}