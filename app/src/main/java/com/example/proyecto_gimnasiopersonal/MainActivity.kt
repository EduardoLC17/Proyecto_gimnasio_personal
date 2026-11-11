package com.example.proyecto_gimnasiopersonal

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var tvUser: TextView
    private lateinit var tvPass: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initEvent()
        showData()
    }

    private fun initEvent() {
        tvUser = findViewById(R.id.tv_user)
        tvPass = findViewById(R.id.tv_pass)
    }

    private fun showData() {
        val user = getIntent().getStringExtra("user")
        val pass = getIntent().getStringExtra("pass")
        tvUser.text = "Bienvenido, $user"
        tvPass.text = "Contraseña: $pass"
        Toast.makeText(this, "Login correcto", Toast.LENGTH_SHORT).show()
    }
}
