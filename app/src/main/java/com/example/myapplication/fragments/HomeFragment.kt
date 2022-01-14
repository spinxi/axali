package com.example.myapplication.fragments

import androidx.fragment.app.Fragment
import com.example.myapplication.R

class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onCreate() {
        super.onCreate()
        setContentView(R.layout.activity_main)
    }
}