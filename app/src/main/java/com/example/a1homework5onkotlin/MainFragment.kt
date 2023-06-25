package com.example.a1homework5onkotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a1homework5onkotlin.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding
    var counter = 0
    private var isIncreasing = true


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       /* binding.btClick.setOnClickListener {

            if (counter < 10) {
                counter++
                binding.tvResult.text = counter.toString()
            } else if (counter == 10) {
                counter--
                binding.tvResult.text = counter.toString()
                binding.btClick.text = "-1"

            }else if (counter == 0){

                val secondFragment = SecondFragment()
                requireActivity().supportFragmentManager.beginTransaction().add(R.id.placeHolder, secondFragment).commit()
            }*/

        binding.btClick.setOnClickListener {
            if (isIncreasing) {
                counter++
                binding.tvResult.text = counter.toString()
                if (counter == 10) {
                    binding.btClick.text = "-1"
                    isIncreasing = false
                }
            } else {
                counter--
                binding.tvResult.text = counter.toString()
                if (counter == 0) {
                    val secondFragment = SecondFragment()
                    val bundle = Bundle()
                    bundle.putInt("the", binding.tvResult.text.toString().toInt())
                    secondFragment.arguments = bundle

                    val fragmentManager = requireActivity().supportFragmentManager
                    val fragmentTransaction = fragmentManager.beginTransaction()
                    fragmentTransaction.replace(R.id.placeHolder, secondFragment)
                    fragmentTransaction.commit()
                    //var secondFragment = SecondFragment()
                    //requireActivity().supportFragmentManager.beginTransaction().add(R.id.placeHolder,secondFragment).commit()


                }
            }


        }
    }


}



