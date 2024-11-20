package com.example.codechallenge.viewModel

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    companion object {
        const val HARCODED_PASSDORD = "1234"
        const val HARCODED_USER = "Augusto"
    }

    fun doLogin(userInput: String, passwordInput: String): Boolean {
        return if(validateUserInput(userInput) && validatePasswordInput(passwordInput)) {
            true
        } else {
            false
        }
    }

    private fun validateUserInput(userInput: String): Boolean {
        return (userInput.isNotEmpty() && userInput == HARCODED_USER)
    }

    private fun validatePasswordInput(passwordInput: String): Boolean {
        return (passwordInput.isNotEmpty() && passwordInput == HARCODED_PASSDORD)
    }
}