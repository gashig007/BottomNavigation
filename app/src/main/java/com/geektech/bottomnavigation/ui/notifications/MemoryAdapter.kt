package com.geektech.bottomnavigation.ui.notifications

import android.database.DataSetObserver
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.geektech.bottomnavigation.databinding.ItemMemoryBinding

class adapter(var info: ArrayList<String>) : RecyclerView.Adapter<adapter.ViewHolder>(), Adapter {

    class ViewHolder(var binding: ItemMemoryBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(info: ArrayList<String>, position: Int){binding.text.text = info[position]}
    }
    override fun getItemCount() = info.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemMemoryBinding.inflate(
                LayoutInflater
                    .from(parent.context), parent, false
            )
        println(info.size)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(info, position)
    }

    override fun registerDataSetObserver(p0: DataSetObserver?) {
        TODO("Not yet implemented")
    }

    override fun unregisterDataSetObserver(p0: DataSetObserver?) {
        TODO("Not yet implemented")
    }

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getItem(p0: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("Not yet implemented")
    }

    override fun getViewTypeCount(): Int {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

}