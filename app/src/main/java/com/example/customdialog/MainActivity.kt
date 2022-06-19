package com.example.customdialog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.customdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        clickListeners()

    }

    private fun clickListeners() {

        binding.btnShowDialgog.setOnClickListener {
           val dialog =  ThankYouDialog(this)
           dialog.show()
        }


    }
}