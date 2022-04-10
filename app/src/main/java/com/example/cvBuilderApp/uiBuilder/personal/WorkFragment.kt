package com.example.cvBuilderApp.uiBuilder.personal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cvBuilderApp.R
import com.example.cvBuilderApp.uiBuilder.slideshow.SlideshowViewModel

class WorkFragment : Fragment() {
    private lateinit var homeViewModel: SlideshowViewModel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_work, container, false)
    }
}