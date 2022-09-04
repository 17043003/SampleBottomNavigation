package com.example.samplebottomnavigation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.samplebottomnavigation.databinding.FragmentChartBinding

class ChartFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentChartBinding.inflate(inflater, container, false)
        return binding.root
    }
}