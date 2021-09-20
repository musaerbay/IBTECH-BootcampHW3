package com.mr.bootcampweek3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.mr.bootcampweek3.utils.gone
import com.mr.bootcampweek3.utils.visible
import kotlinx.android.synthetic.main.activity_main.*


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.nav_host_fragment_container)
        NavigationUI.setupWithNavController(bottomnavigationview, navController)
    }

    fun hideNavigation() {
        bottomnavigationview.postDelayed(
            {
                bottomnavigationview.gone()

            }, 500
        )
    }

    fun showNavigation() {
        bottomnavigationview.postDelayed(
            {
                bottomnavigationview.visible()

            }, 500
        )
    }

}