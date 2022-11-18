package com.wahyurhy.mengapaperlucompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import com.wahyurhy.mengapaperlucompose.databinding.ActivityMainBinding
import com.wahyurhy.mengapaperlucompose.databinding.ActivitySample1Binding

class Sample1Activity : AppCompatActivity() {

    private var binding: ActivitySample1Binding? = null

    var expanded = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySample1Binding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.cardView?.setOnClickListener {
            if (expanded){
                TransitionManager.beginDelayedTransition(binding?.cardView, AutoTransition())
                binding?.tvHidden?.visibility = View.GONE
            } else {
                TransitionManager.beginDelayedTransition(binding?.cardView, AutoTransition())
                binding?.tvHidden?.visibility = View.VISIBLE
            }
            expanded = !expanded
        }
    }
}