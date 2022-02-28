package com.kotlin.mvvmpattern.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.kotlin.mvvmpattern.ui.authentication.SignInActivity
import com.kotlin.mvvmpattern.ui.dashboard.DashboardActivity
import com.kotlin.mvvmpattern.viewmodel.AuthenticationViewModel


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModelProvider(this).get(AuthenticationViewModel::class.java)
        if (viewModel.isLogin())
            startActivity(Intent(this, DashboardActivity::class.java))
        else
            startActivity(Intent(this, SignInActivity::class.java))
        finish()
    }
}