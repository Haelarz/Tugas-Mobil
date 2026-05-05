package com.example.navi

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class FifthFragment : Fragment(R.layout.fragment_fifth) {
    private val args: FifthFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.tv_info)?.text = args.pesan

        view.findViewById<Button>(R.id.btn_next)?.setOnClickListener {
            val action = FifthFragmentDirections.actionFifthFragmentToSeventhFragment("Dari Frag 5")
            findNavController().navigate(action)
        }
    }
}