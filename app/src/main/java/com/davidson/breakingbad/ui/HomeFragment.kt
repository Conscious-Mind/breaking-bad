package com.davidson.breakingbad.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.davidson.breakingbad.databinding.FragmentHomeBinding
import com.davidson.breakingbad.viewmodels.HomeViewModel
import com.davidson.breakingbad.viewmodels.HomeViewModelFactory


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var viewModel: HomeViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        val homeViewModelFactory = HomeViewModelFactory(requireActivity().application)
        viewModel = ViewModelProvider(this, homeViewModelFactory)[HomeViewModel::class.java]

        binding.lifecycleOwner = viewLifecycleOwner

        viewModel.breakingBadCharacterList.observe(viewLifecycleOwner) {
            binding.tvChecking.text = it.toString()
        }

        return binding.root
    }

}