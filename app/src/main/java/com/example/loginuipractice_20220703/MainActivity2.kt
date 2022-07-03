package com.example.loginuipractice_20220703

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

      goBtn.setOnClickListener {
          val name = nameEdt.text.toString()
          val birthYear = birthYearEdt.text.toString()
          val nickname = nicknameEdt.text.toString()

          val myIntent = Intent(this , ProfileActivity::class.java)
          myIntent.putExtra("name" , name)
              .putExtra("birthYear" , birthYear)
              .putExtra("nickname" , nickname)
          startActivity(myIntent)
      }


    }
}