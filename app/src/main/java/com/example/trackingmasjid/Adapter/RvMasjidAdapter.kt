package com.example.trackingmasjid.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trackingmasjid.Model.RvMasjidModel
import com.example.trackingmasjid.databinding.ViewRecycleBinding
import androidx.core.content.ContextCompat
import com.example.trackingmasjid.R

class RvMasjidAdapter(private val list: List<RvMasjidModel>) :
    RecyclerView.Adapter<RvMasjidAdapter.ViewHolder>() {

    class ViewHolder(val binding: ViewRecycleBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ViewRecycleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(list[position]) {
                binding.ivMasjid.setImageResource(this.image)
                binding.tvMasjid.text = this.name
                binding.tvJarak.text = this.desc
            }
        }
    }
}