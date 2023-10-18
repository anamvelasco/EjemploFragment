package com.ana.ejemplofragment.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ana.ejemplofragment.R
import com.ana.ejemplofragment.databinding.ActivityMainBinding
import com.ana.ejemplofragment.ui.bottom.BottomNavigationActivity
import com.ana.ejemplofragment.ui.masterdetail.MasterDetailActivity
import com.ana.ejemplofragment.ui.navdrawer.NavigationDrawerActivity
import com.ana.ejemplofragment.ui.tabbed.TabbedActivity

class MainActivity : AppCompatActivity() {
    private lateinit var fragmentBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fragmentBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = fragmentBinding.root
        setContentView(view)

        fragmentBinding.swipetabsButton.setOnClickListener {
            val intent = Intent(this,TabbedActivity::class.java)
            startActivity(intent)
        }
        fragmentBinding.navigationdrawerButton.setOnClickListener {
            val intent = Intent(this,NavigationDrawerActivity::class.java)
            startActivity(intent)
        }
        fragmentBinding.bottonnavigationButton.setOnClickListener {
            val intent = Intent(this,BottomNavigationActivity::class.java)
            startActivity(intent)
        }
        fragmentBinding.masterdetailButton.setOnClickListener {
            val intent = Intent(this,MasterDetailActivity::class.java)
            startActivity(intent)
        }
    }
}