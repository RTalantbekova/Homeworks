package com.example.l3_homework

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class CheckActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check)

        val chkOne = findViewById<CheckBox>(R.id.cbOne)
        val chkTwo = findViewById<CheckBox>(R.id.cbTwo)
        val chkThree = findViewById<CheckBox>(R.id.cbThird)

        val twOne = findViewById<TextView>(R.id.txt_One)
        val twTwo = findViewById<TextView>(R.id.txt_Two)
        val twThree = findViewById<TextView>(R.id.txt_Three)

        val btnReturn = findViewById<Button>(R.id.back)

        btnReturn.setOnClickListener {
            val chk_One = chkOne.isChecked
            val chk_Two = chkTwo.isChecked
            val chk_Three = chkThree.isChecked

            val mOne = twOne.text.toString()
            val mTwo = twTwo.text.toString()
            val mThree = twThree.text.toString()

            val intent = Intent()
            intent.putExtra("firstCheck", chk_One)
            intent.putExtra("secondCheck", chk_Two)
            intent.putExtra("thirdCheck", chk_Three)

            intent.putExtra("txtFirst", mOne)
            intent.putExtra("txtSecond", mTwo)
            intent.putExtra("txtThird", mThree)

            setResult(Activity.RESULT_OK, intent)
            finish()
            //startActivity(intent)

        }
    }
}