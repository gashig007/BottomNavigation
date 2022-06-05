package com.geektech.bottomnavigation.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.geektech.bottomnavigation.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null
    lateinit var adapter: MemoryAdapter
    lateinit var list: ArrayList<String>

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        notificationsViewModel.text.observe(viewLifecycleOwner) {

        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = MemoryAdapter(loadData())
        binding.recycler.adapter = adapter
    }

    private fun loadData(): ArrayList<String> {
        list = ArrayList()
        list.add("fswfcs")
        list.add("fswfcs")
        list.add("fswfcs")
        list.add("fswfcs")
        list.add("fswfcs")
        list.add("fswfcs")
        return list
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}