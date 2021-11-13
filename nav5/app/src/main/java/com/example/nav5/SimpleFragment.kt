package com.example.nav5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

abstract class SimpleFragment(private val res: Int) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val layout = inflater.inflate(res, container, false)

        layout.findViewById<View>(R.id.bnToFirst)?.setOnClickListener {
            findNavController().navigate(R.id.to_Fragment1)
        }

        layout.findViewById<View>(R.id.bnToSecond)?.setOnClickListener {
            findNavController().navigate(R.id.to_Fragment2)
        }

        layout.findViewById<View>(R.id.bnToThird)?.setOnClickListener {
            findNavController().navigate(R.id.to_Fragment3)
        }

        return layout
    }
}