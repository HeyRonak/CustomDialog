package com.example.customdialog

import android.app.Dialog
import android.os.Bundle
import com.example.customdialog.databinding.DialogThankyouBinding

class ThankYouDialog(activity: MainActivity) : Dialog(activity) {

    private lateinit var binding: DialogThankyouBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogThankyouBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnCancel.setOnClickListener {
            dismiss()
        }

    }

}