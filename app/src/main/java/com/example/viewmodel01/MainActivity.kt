package com.example.viewmodel01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeViewModel()
    }

    fun initializeViewModel(){
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        textViewTitulo.text = (++mainViewModel.contador).toString()

        var nameObserver = Observer<String> {
            textView.text = it.toString()
        }
        mainViewModel.getCurrentName().observe(this, nameObserver)
        button.setOnClickListener {
            mainViewModel.getCurrentName().setValue("Hola ${mainViewModel.contador}")
        }

    }
}
