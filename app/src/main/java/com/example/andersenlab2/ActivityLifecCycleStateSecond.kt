package com.example.andersenlab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ActivityLifecCycleStateSecond : AppCompatActivity() {
    companion object {
        const val EXTRA_REPLY = "com.example.andersenlab2.extra.REPLY"
    }

    private lateinit var mReply: EditText
    private lateinit var mButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifec_cycle_state_second)

        mReply = findViewById(R.id.editText_second_lifecycle)
        mButton = findViewById(R.id.button_second_lifecycle)

        mButton.setOnClickListener {
            val reply = mReply.text.toString()
            val intent = Intent()
            intent.putExtra(EXTRA_REPLY, reply)
            setResult(RESULT_OK, intent)
            finish()
        }

        val message = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE)

        val textView: TextView = findViewById(R.id.text_message_lifecycle)
        textView.text = message
    }
}