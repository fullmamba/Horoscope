package com.mamba.horoscocapp.ui.luck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mamba.horoscocapp.R
import com.mamba.horoscocapp.databinding.FragmentHoroscopeBinding
import com.mamba.horoscocapp.databinding.FragmentLuckBinding

class luckFragment : Fragment() {
    private var _binding: FragmentLuckBinding? = null
    private val binding get() = _binding!!




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLuckBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}