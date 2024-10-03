package com.example.kotlin2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.kotlin2.databinding.FragmentFragment1Binding

class fragment1 : Fragment() {
    private lateinit var binding: FragmentFragment1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFragment1Binding.inflate(inflater, container,
            false)
        binding.btnNext.setOnClickListener {
            findNavController().navigate(R.id.
            action_fragment1_to_fragment2)
        }
        return binding.root
    }
}