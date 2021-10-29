package com.example.nav5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController

class Fragment1 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_1, container, false)
        activity?.findViewById<TextView>(R.id.text_toolbar)!!.text = "Fragment 1"
        val navController = findNavController()
        val to2 = view.findViewById<AppCompatButton>(R.id.to2)
        to2.setOnClickListener { navController.navigate(R.id.action_Fragment1_to_Fragment2) }
        return view
    }


}