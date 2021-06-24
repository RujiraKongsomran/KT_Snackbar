package com.rujirakongsomran.kt_snackbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.rujirakongsomran.kt_snackbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val mySnackBar = Snackbar.make(
                it,
                "When you click on the “Show Snackbar” button, a Snackbar appears at the bottom of the screen.",
                Snackbar.LENGTH_INDEFINITE
            )
            mySnackBar.setAction(R.string.undo_string, MyUndoListener())
            mySnackBar.setActionTextColor(Color.BLUE)
            mySnackBar.setMaxInlineActionWidth(50)
            mySnackBar.show()
        }
    }
}