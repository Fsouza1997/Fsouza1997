package com.example.aprendizagem.navegacaoPincipal

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.aprendizagem.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

//        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationViewPrincipal)
//        val navController = findNavController(R.id.fragmentContainerView)
//        bottomNavigationView.setupWithNavController(navController)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        findViewById<BottomNavigationView>(R.id.bottomNavigationViewPrincipal)
            .setupWithNavController(navController)


    }
}