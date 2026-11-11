package com.example.proyecto_gimnasiopersonal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    private lateinit var editUser: EditText
    private lateinit var editPass: EditText
    private lateinit var btnValidar: Button

    companion object {
        const val MYUSER = "eduardo"
        const val MYPASS = "1234"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        initEvent()
    }

    private fun initEvent() {
        editUser = findViewById(R.id.edit_user)
        editPass = findViewById(R.id.edit_pass)
        btnValidar = findViewById(R.id.btn_validar)

        btnValidar.setOnClickListener {
            val user = editUser.text.toString()
            val pass = editPass.text.toString()

            if (user == MYUSER && pass == MYPASS) {
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("user", user)
                    putExtra("pass", pass)
                }
                startActivity(intent)
            } else {
                Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_LONG).show()
            }
        }
    }
}