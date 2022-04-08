package com.example.cvapp.ui.personal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cvapp.R
import com.example.cvapp.ui.slideshow.SlideshowViewModel

class PersonalInfoFragment : Fragment() {
    private lateinit var homeViewModel: SlideshowViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_about_me, container, false)
    }
}