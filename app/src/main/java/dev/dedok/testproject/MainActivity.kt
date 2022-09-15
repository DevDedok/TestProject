package dev.dedok.testproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dev.dedok.testproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        binding.button.setOnClickListener {
            Toast.makeText(this@MainActivity, getString(R.string.toast_text), Toast.LENGTH_LONG)
                .show()
        }
        
    }
}