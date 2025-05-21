package com.example.navigationdrawerkullanimi

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.navigationdrawerkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        NavigationUI.setupWithNavController(binding.navigationView ,navHostFragment.navController)

        binding.toolbar.title = "Başlık"

        val toogle = ActionBarDrawerToggle(this , binding.drawer, binding.toolbar, 0 , 0)
        binding.drawer.addDrawerListener(toogle)
        toogle.syncState()

        val baslik = binding.navigationView.inflateHeaderView(R.layout.navigation_baslik)
        val textBaslik = baslik.findViewById(R.id.textViewBaslik) as TextView
        textBaslik.text = "Merhaba"

    }

    override fun onBackPressed() {
        if(binding.drawer.isDrawerOpen(GravityCompat.START))
        {
            binding.drawer.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()
        }

    }
}