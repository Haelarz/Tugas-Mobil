package com.example.navi

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class TenthFragment : Fragment(R.layout.fragment_tenth) {
    private val args: TenthFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.tv_final).text = "Finish! Pesan terakhir: ${args.pesan}"
    }
}