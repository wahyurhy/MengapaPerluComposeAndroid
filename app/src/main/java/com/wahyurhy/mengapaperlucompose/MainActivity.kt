package com.wahyurhy.mengapaperlucompose

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wahyurhy.mengapaperlucompose.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        initView()
    }

    private fun initView() {
        binding?.btnSample1?.setOnClickListener {
            val intentSample1 = Intent(this, Sample1Activity::class.java)
            startActivity(intentSample1)
        }

        binding?.btnSample1Compose?.setOnClickListener {
            val intentSample1Compose = Intent(this, Sample1ComposeActivity::class.java)
            startActivity(intentSample1Compose)
        }

        binding?.btnSample2Compose?.setOnClickListener {
            val intentSample2Compose = Intent(this, Sample2ComposeActivity::class.java)
            startActivity(intentSample2Compose)
        }

        binding?.btnSample3Compose?.setOnClickListener {
            val intentSample3Compose = Intent(this, Sample3ComposeActivity::class.java)
            startActivity(intentSample3Compose)
        }
    }
}