package com.akoraingdkb.drawey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RelativeLayout
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private var shown: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val drawer: RelativeLayout = findViewById(R.id.drawer)

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { _ ->
            shown = if (shown) {
                drawerLayout.closeDrawer(drawer)
                false
            } else {
                drawerLayout.openDrawer(drawer, true)
                true
            }
        }
    }
}