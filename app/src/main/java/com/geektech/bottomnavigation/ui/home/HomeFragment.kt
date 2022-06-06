package com.geektech.bottomnavigation.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geektech.bottomnavigation.base.BaseFragment
import com.geektech.bottomnavigation.base.BaseViewModel
import com.geektech.bottomnavigation.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding, BaseViewModel>() {
    public var list: ArrayList<String> = ArrayList()
    public var number = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }



    override fun inflateViewBinding(inflater: LayoutInflater): FragmentHomeBinding {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding
    }

    override fun initViewModel() {
        super.initViewModel()
    }

    override fun initListener() {
        super.initListener()

        binding.btnMinus.setOnClickListener {
            viewModel.onPlus()
            viewModel.list.add("+")

        }

        binding.btnPlus.setOnClickListener {
            viewModel.onMinus()
            viewModel.list.add("-")
        }
    }
}