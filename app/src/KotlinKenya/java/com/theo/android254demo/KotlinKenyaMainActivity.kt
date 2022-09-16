package com.theo.android254demo

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.theo.android254demo.databinding.ActivityKotlinKenyaMainBinding

class KotlinKenyaMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityKotlinKenyaMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKotlinKenyaMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navigation) as NavHostFragment
        navController = navHostFragment.navController
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.eventsFragment2 -> {
                navController.navigate(R.id.eventsFragment2)
            }
            R.id.aboutFragment2 -> {
                navController.navigate(R.id.aboutFragment2)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
