package com.example.marinapera.sensorkids

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_log_in.*

class LogInActivity : AppCompatActivity() {

    var prefs: Prefs?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        prefs = Prefs(this)

        NextButtonLogin.setOnClickListener{
            if(prefs!!.firstTimeState){
                Toast.makeText(this,"First time is TRUE",Toast.LENGTH_LONG).show()
                prefs!!.firstTimeState = false
                val intent = Intent(this, TutorialActivity::class.java)
                startActivity(intent)
            }else{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }

    }
}
