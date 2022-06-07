package com.geektech.bottomnavigation.ui.memory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.geektech.bottomnavigation.base.BaseFragment
import com.geektech.bottomnavigation.base.BaseViewModel
import com.geektech.bottomnavigation.databinding.FragmentMemoryBinding

class MemoryFragment : BaseFragment<FragmentMemoryBinding, BaseViewModel>() {

    lateinit var adapter: MemoryAdapter
    var info: ArrayList<String> = ArrayList<String>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = MemoryAdapter(viewModel.list)
        binding.recycler.adapter = adapter
    }

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentMemoryBinding {
        binding = FragmentMemoryBinding.inflate(inflater)
        return binding
    }

    override fun initViewModel() {
        super.initViewModel()
    }
}