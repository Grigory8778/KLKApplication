package com.example.klkapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.kalcapplication.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val _0 = findViewById<Button>(R.id.btn_0)
        val _1 = findViewById<Button>(R.id.btn_1)
        val _2 = findViewById<Button>(R.id.btn_2)
        val _3 = findViewById<Button>(R.id.btn_3)
        val _4 = findViewById<Button>(R.id.btn_4)
        val _5 = findViewById<Button>(R.id.btn_5)
        val _6 = findViewById<Button>(R.id.btn_6)
        val _7 = findViewById<Button>(R.id.btn_7)
        val _8 = findViewById<Button>(R.id.btn_8)
        val _9 = findViewById<Button>(R.id.btn_9)
        val btnPlus = findViewById<Button>(R.id.btn_sum)
        val btnDiv = findViewById<Button>(R.id.btn_div)
        val btnUm = findViewById<Button>(R.id.btn_um)
        val btnMinus = findViewById<Button>(R.id.btn_minus)
        val btnEq = findViewById<Button>(R.id.btn_eq)
        val txt1 = findViewById<TextView>(R.id.txt1)
        val txt2 = findViewById<TextView>(R.id.txt2)
        val txt3 = findViewById<TextView>(R.id.txt3)
        val txt4 = findViewById<TextView>(R.id.txt4)
        val txt5 = findViewById<TextView>(R.id.txt5)

        _0.setOnClickListener {


            if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                b = "$b" + "0"
                d = b.toInt()
                txt4.text = b.toInt().toString()
            } else {
                c = "$c" + "0"
                txt1.text = c.toInt().toString()
                a = c.toInt()
            }
        }
        _1.setOnClickListener {
            if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                b = "$b" + "1"
                d = b.toInt()
                txt4.text = b.toInt().toString()
            } else {
                c = "$c" + "1"
                txt1.text = c.toInt().toString()
                a = c.toInt()
            }
        }
        _2.setOnClickListener {

            if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                b = "$b" + "2"
                d = b.toInt()
                txt4.text = b.toInt().toString()
            } else {
                c = "$c" + "2"
                txt1.text = c.toInt().toString()
                a = c.toInt()
            }
        }
        _3.setOnClickListener {

            if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                b = "$b" + "3"
                d = b.toInt()
                txt4.text = b.toInt().toString()
            } else {
                c = "$c" + "3"
                txt1.text = c.toInt().toString()
                a = c.toInt()
            }
        }
        _4.setOnClickListener {

            if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                b = "$b" + "4"
                d = b.toInt()
                txt4.text = b.toInt().toString()
            } else {
                c = "$c" + "4"
                txt1.text = c.toInt().toString()
                a = c.toInt()
            }
        }
        _5.setOnClickListener {

            if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                b = "$b" + "5"
                d = b.toInt()
                txt4.text = b.toInt().toString()
            } else {
                c = "$c" + "5"
                txt1.text = c.toInt().toString()
                a = c.toInt()
            }
        }
        _6.setOnClickListener {

            if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                b = "$b" + "6"
                d = b.toInt()
                txt4.text = b.toInt().toString()
            } else {
                c = "$c" + "6"
                txt1.text = c.toInt().toString()
                a = c.toInt()
            }
        }
        _7.setOnClickListener {
            if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                b = "$b" + "7"
                d = b.toInt()
                txt4.text = b.toInt().toString()
            } else {
                c = "$c" + "7"
                txt1.text = c.toInt().toString()
                a = c.toInt()
            }
        }
        _8.setOnClickListener {

            if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                b = "$b" + "8"
                d = b.toInt()
                txt4.text = b.toInt().toString()
            } else {
                c = "$c" + "8"
                txt1.text = c.toInt().toString()
                a = c.toInt()
            }
        }
        _9.setOnClickListener {
            if (txt2.text == "/" || txt2.text == "*" || txt2.text == "+" || txt2.text == "-") {
                b = "$b" + "9"
                d = b.toInt()
                txt4.text = b.toInt().toString()
            } else {
                c = "$c" + "9"
                txt1.text = c.toInt().toString()
                a = c.toInt()
            }
        }
        btnDiv.setOnClickListener { txt2.text = "/" }
        btnMinus.setOnClickListener { txt2.text = "-" }
        btnPlus.setOnClickListener { txt2.text = "+" }
        btnUm.setOnClickListener { txt2.text = "*" }
        btnEq.setOnClickListener {
            txt5.text = "="
            when (txt2.text) {
                "/" -> txt3.text = (a / d).toString()
                "*" -> txt3.text = (a * d).toString()
                "+" -> txt3.text = (a + d).toString()
                "-" -> txt3.text = (a - d).toString()
            }
        }

    }

    var a: Int = 0
    var b: String = ""
    var c: String = ""
    var d:  = 0.0

