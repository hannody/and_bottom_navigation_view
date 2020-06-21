package com.abunayla.bottomnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstFrag = FirstFragment()
        val secondFrag = SecondFragment()
        val thirdFrag = ThirdFragment()
        val forthFrag = FourthFragment()

        setCurrentFragment(firstFrag)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.games-> setCurrentFragment(firstFrag)
                R.id.hd-> setCurrentFragment(secondFrag)
                R.id.f_4K-> setCurrentFragment(thirdFrag)
                R.id.cloud-> setCurrentFragment(forthFrag)
            }
            true
        }
    }


    private fun setCurrentFragment(frag:Fragment) = supportFragmentManager.beginTransaction().
    apply{
        replace(R.id.flFragment, frag)
        commit()
    }
}