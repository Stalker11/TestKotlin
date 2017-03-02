package com.olegel.testkotlin

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class KotlinOneActivity : Activity() {
    private var textView:TextView? = null
    private var editText: EditText? = null
    private var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kotlin_activity_one)
        textView = findViewById(R.id.one_kotlin_activity_text) as TextView
        editText = findViewById(R.id.one_kotlin_activity_edit) as EditText
        button = findViewById(R.id.one_kotlin_activity_button) as Button
        button?.setOnClickListener {
            textView?.text = editText?.text
        }
    }
    fun testSeing(){
        textView
    }
}