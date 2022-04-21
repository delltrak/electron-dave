package br.com.electronapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import br.com.electron.dave.Engine

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var engine = Engine(this)
        Log.e("MainActivity", "Engine: ${engine.getName()}")
    }
}