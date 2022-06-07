package com.geektech.bottomnavigation.ui.math

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.geektech.bottomnavigation.base.BaseFragment
import com.geektech.bottomnavigation.base.BaseViewModel
import com.geektech.bottomnavigation.databinding.FragmentMathBinding

class MathFragment : BaseFragment<FragmentMathBinding, BaseViewModel>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }



    override fun inflateViewBinding(inflater: LayoutInflater): FragmentMathBinding {
        binding = FragmentMathBinding.inflate(inflater)
        return binding
    }

    override fun initViewModel() {
        super.initViewModel()
    }

    override fun initListener() {
        super.initListener()

        binding.btnPlus.setOnClickListener {
            viewModel.onPlus()
            viewModel.list.add("+")

        }

        binding.btnMinus.setOnClickListener {
            viewModel.onMinus()
            viewModel.list.add("-")
        }
    }
}