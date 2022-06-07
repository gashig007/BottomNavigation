package com.geektech.bottomnavigation.ui.result

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.lifecycle.Observer
import com.geektech.bottomnavigation.base.BaseFragment
import com.geektech.bottomnavigation.base.BaseViewModel
import com.geektech.bottomnavigation.databinding.FragmentResultBinding

class ResultFragment : BaseFragment<FragmentResultBinding, BaseViewModel>() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun initViewModel() {
        super.initViewModel()
    }

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentResultBinding {
        binding = FragmentResultBinding.inflate(inflater)
        return binding
    }

    override fun initListener() {
        super.initListener()
        viewModel.onPlus()
        viewModel.onMinus()
        viewModel.counter.observe(this, Observer{ counter->
            binding.text.text = counter.toString()
        })

    }
}