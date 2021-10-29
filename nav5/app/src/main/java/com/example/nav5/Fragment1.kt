package com.example.nav5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.nav5.databinding.Fragment1Binding

class Fragment1 : Fragment() {

    private var _binding: Fragment1Binding? = null
    private var navController: NavController? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = Fragment1Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
        binding.to2.setOnClickListener {
            navController!!.navigate(R.id.action_Fragment1_to_Fragment2)
        }
        activity?.findViewById<TextView>(R.id.text_toolbar)!!.text = "Fragment 1"
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}