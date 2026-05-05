package com.example.navi

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SeventhFragment : Fragment(R.layout.fragment_seventh) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_to_8).setOnClickListener {
            val action = SeventhFragmentDirections.actionSeventhFragmentToEightFragment("8 (Frag 1)")
            findNavController().navigate(action)
        }

        view.findViewById<Button>(R.id.btn_to_9).setOnClickListener {
            val action = SeventhFragmentDirections.actionSeventhFragmentToNinthFragment("9 (Frag 1)")
            findNavController().navigate(action)
        }
    }
}