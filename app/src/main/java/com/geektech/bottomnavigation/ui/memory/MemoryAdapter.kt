package com.geektech.bottomnavigation.ui.memory

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.bottomnavigation.databinding.ItemMemoryBinding

class MemoryAdapter(var info: ArrayList<String>) : RecyclerView.Adapter<MemoryAdapter.MemoryViewHolder>() {
    override fun getItemCount() = info.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemoryViewHolder {
        val binding =
            ItemMemoryBinding.inflate(
                LayoutInflater
                    .from(parent.context), parent, false
            )
        println(info.size)
        return MemoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MemoryViewHolder, position: Int) {
        holder.bind(info, position)
    }

    class MemoryViewHolder(var binding: ItemMemoryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(info: ArrayList<String>, position: Int){binding.text.text = info[position]}
    }
}