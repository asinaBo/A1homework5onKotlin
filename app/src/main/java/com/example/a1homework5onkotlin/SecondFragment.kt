package com.example.a1homework5onkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a1homework5onkotlin.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
    binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val firstFragment = parentFragmentManager.findFragmentById(R.id.placeHolder) as? MainFragment
        val valueFromFirstFragment = firstFragment?.binding?.tvResult?.text
        binding.tvResult1.text = "Value from Fragment 1: $valueFromFirstFragment"
    }
    companion object {

        @JvmStatic
        fun newInstance() = SecondFragment()
    }
}