package com.geektech.bottomnavigation.ui.notifications

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geektech.bottomnavigation.databinding.ItemMemoryBinding

class MemoryAdapter(
    private var names: ArrayList<String> = ArrayList()
) :
    RecyclerView.Adapter<MemoryAdapter.MemoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemoryViewHolder {
        val itemView = ItemMemoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MemoryViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MemoryViewHolder, position: Int) {
        holder.bind(names[position])
    }

    override fun getItemCount() = names.size

    class MemoryViewHolder(private val binding: ItemMemoryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(contact: String) {
            binding.text.text = contact.toString()
        }
    }
}