package com.example.nav5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController


class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_2, container, false)
        val navController = findNavController()
        val to1 = view.findViewById<AppCompatButton>(R.id.to1)
        val to3 = view.findViewById<AppCompatButton>(R.id.to3)
        activity?.findViewById<TextView>(R.id.text_toolbar)!!.text = "Fragment 2"
        to1.setOnClickListener { navController.navigate(R.id.action_Fragment2_to_Fragment1) }
        to3.setOnClickListener { navController.navigate(R.id.action_Fragment2_to_Fragment3) }
        return view
    }



}