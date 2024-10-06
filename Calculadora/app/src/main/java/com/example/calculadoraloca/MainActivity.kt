package com.example.calculadoraloca

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

private var operationDone: Boolean = false

/**
 * Solo he hecho funcional la suma y resta la demas no me da tiempo Ruben
 */

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button1).setOnClickListener(this)
        findViewById<Button>(R.id.button2).setOnClickListener(this)
        findViewById<Button>(R.id.button3).setOnClickListener(this)
        findViewById<Button>(R.id.button4).setOnClickListener(this)
        findViewById<Button>(R.id.button5).setOnClickListener(this)
        findViewById<Button>(R.id.button6).setOnClickListener(this)
        findViewById<Button>(R.id.button7).setOnClickListener(this)
        findViewById<Button>(R.id.button8).setOnClickListener(this)
        findViewById<Button>(R.id.button9).setOnClickListener(this)
        findViewById<Button>(R.id.button10).setOnClickListener(this)
        findViewById<Button>(R.id.button11).setOnClickListener(this)
        findViewById<Button>(R.id.button12).setOnClickListener(this)
        findViewById<Button>(R.id.button13).setOnClickListener(this)
        findViewById<Button>(R.id.button14).setOnClickListener(this)
        findViewById<Button>(R.id.button15).setOnClickListener(this)
        findViewById<Button>(R.id.button16).setOnClickListener(this)
        findViewById<Button>(R.id.button17).setOnClickListener(this)
        findViewById<Button>(R.id.button18).setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(view: View?) {
        val textView: TextView = findViewById(R.id.textView2)

        if (operationDone) {
            textView.text = ""
            operationDone = false
        } else {
            when (view?.id) {
                R.id.button1 -> textView.text =
                    textView.text.toString() + getString(R.string.B_1)

                R.id.button2 -> textView.text =
                    textView.text.toString() + getString(R.string.B_2)

                R.id.button3 -> textView.text =
                    textView.text.toString() + getString(R.string.B_3)

                R.id.button4 -> textView.text =
                    textView.text.toString() + getString(R.string.B_4)

                R.id.button5 -> textView.text =
                    textView.text.toString() + getString(R.string.B_5)

                R.id.button6 -> textView.text =
                    textView.text.toString() + getString(R.string.B_6)

                R.id.button7 -> textView.text =
                    textView.text.toString() + getString(R.string.B_7)

                R.id.button8 -> textView.text =
                    textView.text.toString() + getString(R.string.B_8)

                R.id.button9 -> textView.text =
                    textView.text.toString() + getString(R.string.B_9)

                R.id.button10 -> textView.text =
                    textView.text.toString() + getString(R.string.multiply)

                R.id.button11 -> textView.text =
                    textView.text.toString() + getString(R.string.minus)

                R.id.button12 -> {
                    try {
                        textView.text = doOperation(textView.text.toString())
                        operationDone = true
                    } catch (e: Exception) {
                        textView.text = ""
                    }
                }

                R.id.button13 -> textView.text =
                    textView.text.toString() + getString(R.string.zero)

                R.id.button14 -> textView.text =
                    textView.text.toString() + getString(R.string.coma)

                R.id.button15 -> textView.text =
                    textView.text.toString() + getString(R.string.suma)

                R.id.button16 -> textView.text =
                    textView.text.toString() + getString(R.string.division)

                R.id.button17 -> textView.text =
                    textView.text.toString() + getString(R.string.percentage)

                R.id.button18 -> {
                    textView.text = ""
                }

            }
        }
    }
}

