package com.example.navigationdrawerkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationdrawerkullanimi.databinding.FragmentBirinciBinding


class BirinciFragment : Fragment() {
    private lateinit var binding: FragmentBirinciBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBirinciBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }


}