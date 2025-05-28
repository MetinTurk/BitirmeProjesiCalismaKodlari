package com.example.yemekbitirmeodevi.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.yemekbitirmeodevi.R
import com.example.yemekbitirmeodevi.data.entity.Yemekler
import com.example.yemekbitirmeodevi.databinding.FragmentAnasayfaBinding
import com.example.yemekbitirmeodevi.retrofit.YemeklerDaoInterface
import com.example.yemekbitirmeodevi.ui.adapter.YemeklerAdapter


class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    private lateinit var yemekListe: ArrayList<Yemekler>
    private lateinit var adapter: YemeklerAdapter
    private lateinit var ydi: YemeklerDaoInterface

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)



        return binding.root
    }


}