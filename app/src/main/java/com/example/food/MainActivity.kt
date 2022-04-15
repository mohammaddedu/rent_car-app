package com.example.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu1, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==R.id.Order){
            var a = supportFragmentManager.beginTransaction()
            var b = OrderFragment()
            a.replace(R.id.container, b)
            a.commit()
        }
        if (item.itemId==R.id.Rate){
            var a = supportFragmentManager.beginTransaction()
            var b = RateFragment()
            a.replace(R.id.container, b)
            a.commit()
        }
        return super.onOptionsItemSelected(item)
    }
}


