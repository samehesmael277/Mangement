package com.sameh.management

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.sameh.management.databinding.ActivityAppBinding

class AppActivity : AppCompatActivity() {

    private var _binding: ActivityAppBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toggle = ActionBarDrawerToggle(
            this, binding.drawer, binding.homeToolBar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close
        )

        binding.drawer.addDrawerListener(toggle)
        toggle.syncState()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}