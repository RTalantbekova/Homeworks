package com.example.l3_homework

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var txtOne : TextView? = null
    var txtTwo : TextView? = null
    var txtThree : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext = findViewById<Button>(R.id.next)

        btnNext.setOnClickListener {
            val intent = Intent(applicationContext,CheckActivity::class.java)
            startActivityForResult(intent, 1)
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1 && resultCode == Activity.RESULT_OK){
            val txtOne = findViewById<TextView>(R.id.firstMovie)
            val txtTwo = findViewById<TextView>(R.id.secondMovie)
            val txtThree = findViewById<TextView>(R.id.thirdMovie)

            val chkMovieOne = intent.getBooleanExtra("firstCheck",false)
            val chkMovieTwo = intent.getBooleanExtra("secondCheck",false)
            val chkMovieThree = intent.getBooleanExtra("thirdCheck",false)

            val txtMovieOne = data?.getStringExtra("txtFirst")
            val txtMovieTwo = data?.getStringExtra("txtSecond")
            val txtMovieThree = data?.getStringExtra("txtThird")

            if (chkMovieOne){
                txtOne?.text = txtMovieOne
            } else {
                txtOne?.text = "Not choosen"
            }

            if (chkMovieTwo){
                txtTwo?.text = txtMovieTwo
            } else {
                txtTwo?.text = "Not choosen"
            }

            if (chkMovieThree){
                txtThree?.text = txtMovieThree
            } else {
                txtThree?.text = "Not choosen"
            }
        }

    }
}