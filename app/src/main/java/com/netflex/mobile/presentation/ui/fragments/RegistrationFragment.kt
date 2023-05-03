package com.netflex.mobile.presentation.ui.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toolbar
import androidx.navigation.fragment.findNavController
import com.netflex.mobile.R
import com.netflex.mobile.presentation.MainActivity


class RegistrationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_registration, container, false)
        return view
    }

}