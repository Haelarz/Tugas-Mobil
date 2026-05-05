package com.example.navi

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FourthFragment : Fragment(R.layout.fragment_fourth) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_to_5).setOnClickListener {
            val action = FourthFragmentDirections.actionFourthFragmentToFifthFragment("5 (Frag 1)")
            findNavController().navigate(action)
        }

        view.findViewById<Button>(R.id.btn_to_6).setOnClickListener {
            val action = FourthFragmentDirections.actionFourthFragmentToSixthFragment("6 (Frag 1)")
            findNavController().navigate(action)
        }
    }
}