package com.example.codechallenge

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import com.example.codechallenge.viewModel.MainActivityViewModel


class MainActivity : ComponentActivity() {

    val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userInput = findViewById<EditText>(R.id.user_input)
        val passwordInput = findViewById<EditText>(R.id.password_input)
        val button = findViewById<Button>(R.id.login_button)
        val intent = Intent(this, WelcomeActivity::class.java)
        button.setOnClickListener {
            if (viewModel.doLogin(userInput.text.toString(), passwordInput.text.toString())) {
                startActivity(intent)
            } else {
                Toast.makeText(this, R.string.error_message, Toast.LENGTH_LONG).show()
            }
        }
    }
}