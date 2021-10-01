package com.ahmed.smartfamily

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ahmed.smartfamily.databinding.FragmentRankingBinding


class RankingFragment : Fragment() {

    private var _binding: FragmentRankingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding=FragmentRankingBinding.inflate(inflater, container, false)

        binding.tvPresident.setOnClickListener {
            val transaction = (activity as MainActivity).supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, ImagesFragment())
            transaction.commit()
        }


        return binding.root
    }
}