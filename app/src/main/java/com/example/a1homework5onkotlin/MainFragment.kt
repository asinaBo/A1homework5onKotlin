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


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btClick.setOnClickListener {

            if (counter < 10) {
                counter++
                binding.tvResult.text = counter.toString()
            } else if (counter == 10) {
                counter --
                binding.tvResult.text = counter.toString()
                binding.btClick.text = "-1"
            } else if (counter == -0) {

                val fragment = SecondFragment()
                requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.placeHolder, fragment, )
                    .commit();
            }
        }
    }


}



