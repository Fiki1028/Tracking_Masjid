package com.example.trackingmasjid

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.trackingmasjid.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Akses tampilan menggunakan binding
        binding.singUp.setOnClickListener {
            binding.singUp.background = resources.getDrawable(R.drawable.switch_trcks, null)
            binding.singUp.setTextColor(resources.getColor(R.color.textColor, null))
            binding.logIn.background = null
            binding.singUpLayout.visibility = View.VISIBLE
            binding.logInLayout.visibility = View.GONE
            binding.logIn.setTextColor(resources.getColor(R.color.greenColor, null))
        }

        binding.logIn.setOnClickListener {
            binding.singUp.background = null
            binding.singUp.setTextColor(resources.getColor(R.color.greenColor, null))
            binding.logIn.background = resources.getDrawable(R.drawable.switch_trcks, null)
            binding.singUpLayout.visibility = View.GONE
            binding.logInLayout.visibility = View.VISIBLE
            binding.logIn.setTextColor(resources.getColor(R.color.textColor, null))
        }

        binding.singIn.setOnClickListener {
            startActivity(Intent(this@LoginActivity, MainActivity::class.java))
        }
    }
}