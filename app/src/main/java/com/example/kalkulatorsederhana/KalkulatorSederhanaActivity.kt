package com.example.kalkulatorsederhana

import android.os.Bundle
import android.text.method.TextKeyListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var etangka1 : EditText
    private lateinit var etangka2 : EditText
    private lateinit var btnkali : Button
    private lateinit var btntambah : Button
    private lateinit var btnkurang : Button
    private lateinit var txthasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kalkulator_sederhana)

        etangka1 = findViewById(R.id.etangka1)
        etangka2 = findViewById(R.id.etangka2)
        btnkali = findViewById(R.id.btnkali)
        btntambah = findViewById(R.id.btntambah)
        btnkurang = findViewById(R.id.btnkurang)
        txthasil = findViewById(R.id.txthasil)

        btnkurang. setOnClickListener(){
            val hasil =etangka1.text.toString().toInt() - etangka2.text.toString().toInt()
            txthasil.setText("hasil pengurangan :" +hasil)
        }
        btntambah. setOnClickListener(){
            val hasil =etangka1.text.toString().toInt() + etangka2.text.toString().toInt()
            txthasil.setText("hasil penambahan :" +hasil)
        }
        btnkali. setOnClickListener(){
            val hasil =etangka1.text.toString().toInt() * etangka2.text.toString().toInt()
            txthasil.setText("hasil perkalian :" +hasil)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
