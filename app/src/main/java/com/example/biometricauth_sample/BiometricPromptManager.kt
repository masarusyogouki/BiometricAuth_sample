package com.example.biometricauth_sample

import android.hardware.biometrics.BiometricManager

class BiometricPromptManager {
    private val activity:
    // タイトルと説明を受け取る関数
    fun showBiometricPrompt(
        title: String,
        description: String
    ) {
        val manager = BiometricManager.from(activity)
    }
}