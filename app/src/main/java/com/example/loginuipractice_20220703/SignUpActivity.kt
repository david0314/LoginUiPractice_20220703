package com.example.loginuipractice_20220703

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        signUpBtn.setOnClickListener {
            Toast.makeText(this ,"${nicknameEdt.text}님 회원가입을 축하합니다." , Toast.LENGTH_SHORT).show()

            finish()
        }

    }
}