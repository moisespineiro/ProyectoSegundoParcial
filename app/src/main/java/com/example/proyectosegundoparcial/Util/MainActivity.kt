package com.example.proyectosegundoparcial.Util

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.proyectosegundoparcial.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){

            R.id.itmTiendasCercanas -> {
                val intent = Intent(this@MainActivity, StoresNext2MeActivity::class.java)
                startActivity(intent)
            }

            R.id.itmMisListas -> {
                val intent = Intent(this@MainActivity, MyListsActivity::class.java)
                startActivity(intent)
            }

            R.id.itmSugerencias -> {
                val intent = Intent(this@MainActivity, SuggestionsActivity::class.java)
                startActivity(intent)
            }

            R.id.itmAcercaNosotros -> {
                val intent = Intent(this@MainActivity, AboutUsActivity::class.java)
                startActivity(intent)
            }
        }
        return true
    }
}
