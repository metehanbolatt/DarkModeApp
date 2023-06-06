package com.metehanbolat.darkmodeapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.metehanbolat.darkmodeapp.databinding.ImageItemBinding

class ImageAdapter(private val imageList: List<String>) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    inner class ImageViewHolder(val binding: ImageItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val binding = ImageItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val item = imageList[position]
        holder.binding.apply {
            imageText.text = item
        }
    }

    override fun getItemCount() = imageList.size
}