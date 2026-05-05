package com.example.navi

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class ThirdFragment : Fragment(R.layout.fragment_third) {
    private val args: ThirdFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.tv_info)?.text = args.pesan

        view.findViewById<Button>(R.id.btn_next)?.setOnClickListener {
            val action = ThirdFragmentDirections.actionThirdFragmentToFourthFragment("Dari Frag 3")
            findNavController().navigate(action)
        }
    }
}