package com.example.picassokullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.picassokullanimi.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val url = "http://kasimadalan.pe.hu/yemekler/resimler/ayran.png"
        Picasso.get().load(url).into(binding.imageView)
    }
}