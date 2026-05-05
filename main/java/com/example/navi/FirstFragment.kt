package com.example.navi

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment(R.layout.fragment_first) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_to_2).setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment("2 (Frag 1)")
            findNavController().navigate(action)
        }

        view.findViewById<Button>(R.id.btn_to_3).setOnClickListener {
            val action = FirstFragmentDirections.actionFirstFragmentToThirdFragment("3 (Frag 1)")
            findNavController().navigate(action)
        }
    }
}