package com.example.texttospeech

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    var Text : EditText? =null
    //var btnText :Button?=null
    var textToSpeech:TextToSpeech?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Text=findViewById(R.id.Text)
    //btnText=findViewById(R.id.btnText)

        // create an object textToSpeech and adding features into it
        textToSpeech = TextToSpeech(applicationContext) { i ->
            // if No error is found then only it will run
            if (i != TextToSpeech.ERROR) {
                // To Choose language of speech
                textToSpeech?.language = Locale.ENGLISH
            }
        }

        var btntext:Button?=null
        btntext=findViewById(R.id.btnText)
        btntext.setOnClickListener(View.OnClickListener {
            textToSpeech!!.speak(textToSpeech.toString(), TextToSpeech.QUEUE_FLUSH, null, "")
        })
    }
}



