package com.example.marketplace

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.marketplace.databinding.FragmentFoodMenuBinding
import com.example.marketplace.databinding.FragmentMenuFragmentBinding

class SearchFragment : Fragment() {

    lateinit var binding: FragmentMenuFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_search, container, false)
    }
}