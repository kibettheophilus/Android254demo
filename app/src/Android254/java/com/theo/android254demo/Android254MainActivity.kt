package com.theo.android254demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.theo.android254demo.databinding.ActivityAndroid254MainBinding

class Android254MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAndroid254MainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAndroid254MainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bottomNavigation.setupWithNavController(navController)

//        // hide bottom menu when user navigates to details screens
//        navHostFragment.findNavController()
//            .addOnDestinationChangedListener { _, destination, _ ->
//                when (destination.id) {
//                    R.id.itemDetailFragment -> binding.bottomNavigation.visibility = View.GONE
//                    else -> binding.bottomNavigation.visibility = View.VISIBLE
//                }
//            }
    }
}
