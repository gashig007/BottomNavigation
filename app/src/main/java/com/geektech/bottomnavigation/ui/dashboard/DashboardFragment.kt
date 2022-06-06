package com.geektech.bottomnavigation.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.geektech.bottomnavigation.base.BaseFragment
import com.geektech.bottomnavigation.base.BaseViewModel
import com.geektech.bottomnavigation.databinding.FragmentDashboardBinding

class DashboardFragment : BaseFragment<FragmentDashboardBinding, BaseViewModel>() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun initViewModel() {
        super.initViewModel()
    }

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentDashboardBinding {
        binding = FragmentDashboardBinding.inflate(inflater)
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