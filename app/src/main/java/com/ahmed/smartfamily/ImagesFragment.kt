package com.ahmed.smartfamily

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ahmed.smartfamily.databinding.FragmentImagesBinding
import com.ahmed.smartfamily.databinding.FragmentRankingBinding


class ImagesFragment : Fragment() {

    private var _binding: FragmentImagesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding=FragmentImagesBinding.inflate(inflater, container, false)

        binding.ivPresident.setImageResource(R.drawable.image)
        binding.ivFounder.setImageResource(R.drawable.image)
        binding.ivPrevPresident.setImageResource(R.drawable.image)
        binding.ivPrevFounder.setImageResource(R.drawable.image)

        return binding.root
    }
}