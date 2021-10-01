package com.ahmed.smartfamily

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import com.ahmed.smartfamily.databinding.FragmentAnimationBinding

class AnimationFragment : Fragment() {

    private var _binding: FragmentAnimationBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentAnimationBinding.inflate(inflater, container, false)
        val view = binding.root

        //ImageView Animation
        Handler().postDelayed({
            val animation = AnimationUtils.loadAnimation(context, R.anim.blink)
            binding.ivIcon.startAnimation(animation)
        }, 2000)


        //TextView Animation
        //Typing Animation
        Handler().postDelayed({
            run {
                binding.tvIcon.visibility = View.VISIBLE
                binding.tvIcon.text = "A"
            }
        }, 1400)
        Handler().postDelayed({
            run {
                binding.tvIcon.append("c")
            }
        }, 1600)
        Handler().postDelayed({
            run {
                binding.tvIcon.append("t")
            }
        }, 1800)
        Handler().postDelayed({
            run {
                binding.tvIcon.append("i")
            }
        }, 2000)
        Handler().postDelayed({
            run {
                binding.tvIcon.append("v")
            }
        }, 2200)
        Handler().postDelayed({
            run {
                binding.tvIcon.append("a")
            }
        }, 2400)
        Handler().postDelayed({
            run {
                binding.tvIcon.append("t")
            }
        }, 2600)
        Handler().postDelayed({
            run {
                binding.tvIcon.append("e")
            }
        }, 2800)
        Handler().postDelayed({
            run {
                binding.tvIcon.append(" ")
            }
        }, 3000)
        Handler().postDelayed({
            run {
                binding.tvIcon.append("Y")
            }
        }, 3200)
        Handler().postDelayed({
            run {
                binding.tvIcon.append("o")
            }
        }, 3400)
        Handler().postDelayed({
            run {
                binding.tvIcon.append("u")
            }
        }, 3600)
        Handler().postDelayed({
            run {
                binding.tvIcon.append("r")
            }
        }, 3800)
        Handler().postDelayed({
            run {
                binding.tvIcon.append(" ")
            }
        }, 4000)
        Handler().postDelayed({
            run {
                binding.tvIcon.append("M")
            }
        }, 4200)
        Handler().postDelayed({
            run {
                binding.tvIcon.append("i")
            }
        }, 4400)
        Handler().postDelayed({
            run {
                binding.tvIcon.append("n")
            }
        }, 4600)
        Handler().postDelayed({
            run {
                binding.tvIcon.append("d")
            }
        }, 4800)

        //Going to Second Fragment
        Handler().postDelayed({
            val transaction = (activity as MainActivity).supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, RankingFragment())
            transaction.commit()
        }, 5200)



        return view
    }

}