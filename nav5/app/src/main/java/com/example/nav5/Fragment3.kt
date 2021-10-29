package com.example.nav5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class Fragment3 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_3, container, false)
        val navController = findNavController()
        val to1 = view.findViewById<AppCompatButton>(R.id.to1)
        val to2 = view.findViewById<AppCompatButton>(R.id.to2)
        activity?.findViewById<TextView>(R.id.text_toolbar)!!.text = "Fragment 3"
        to2.setOnClickListener { navController.navigate(R.id.action_Fragment3_to_Fragment2) }
        to1.setOnClickListener { navController.navigate(R.id.action_Fragment3_to_Fragment1) }
        return view
    }

}