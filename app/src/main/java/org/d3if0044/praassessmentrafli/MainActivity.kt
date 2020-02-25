package org.d3if0044.praassessmentrafli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import org.d3if0044.praassessmentrafli.databinding.ActivityMainBinding
import org.d3if0044.praassessmentrafli.databinding.FragmentMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val  binding:ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val navController = this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        var navController = this.findNavController(R.id.myNavHostFragment)
        return super.onSupportNavigateUp()
    }

}
