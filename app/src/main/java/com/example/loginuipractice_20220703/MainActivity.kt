package com.example.loginuipractice_20220703

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        회원가입 창으로 이동
        signUpBtn.setOnClickListener {
//            Toast.makeText(this, "회원가입버튼 클릭" , Toast.LENGTH_SHORT).show()
            // 비행기 티켓을 발권
            val myIntent = Intent(this , SignUpActivity::class.java)

            startActivity(myIntent)
        }
//        로그인 로직실행
        loginBtn.setOnClickListener { 
            val id = idEdt.text.toString()
            val password = passwordEdt.text.toString()
            if(id != "admin"){
                Toast.makeText(this , "아이디가 잘못됐습니다." , Toast.LENGTH_SHORT).show()
            }else{
                if(password != "asdf"){
                    Toast.makeText(this , "비밀번호가 잘못됐습니다." , Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this , "관리자님 환영합니다.." , Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}