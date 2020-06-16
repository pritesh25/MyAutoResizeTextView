package com.vinrak.myautoresizetextview

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var mOutput: TextView? = null
    private var mAutoFitOutput: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mOutput = findViewById<View>(R.id.output) as TextView
        mAutoFitOutput = findViewById<View>(R.id.output_autofit) as TextView

        (findViewById<View>(R.id.input) as EditText).addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i2: Int, i3: Int) {
                // do nothing
            }

            override fun onTextChanged(charSequence: CharSequence, i: Int, i2: Int, i3: Int) {
                mOutput!!.setText(charSequence)
                mAutoFitOutput!!.text = charSequence
            }

            override fun afterTextChanged(editable: Editable) {
                // do nothing
            }
        })

    }
}