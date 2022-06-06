package com.geektech.bottomnavigation.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransitionImpl
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.geektech.bottomnavigation.base.BaseFragment
import com.geektech.bottomnavigation.base.BaseViewModel
import com.geektech.bottomnavigation.databinding.FragmentNotificationsBinding

class NotificationsFragment : BaseFragment<FragmentNotificationsBinding, BaseViewModel>() {

    lateinit var adapter: adapter

    var info: ArrayList<String> = ArrayList<String>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = adapter(viewModel.list)
        binding.recycler.adapter = adapter
    }

    override fun inflateViewBinding(inflater: LayoutInflater): FragmentNotificationsBinding {
        binding = FragmentNotificationsBinding.inflate(inflater)
        return binding
    }
}