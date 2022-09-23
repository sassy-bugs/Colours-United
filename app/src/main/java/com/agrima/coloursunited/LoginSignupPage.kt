package com.agrima.coloursunited

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
//import kotlinx.android.synthetic.main.activity_login_page.*

class LoginSignupPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        val signin:TextView  = findViewById(R.id.signin)
        val signup:TextView = findViewById(R.id.signup)
        val signin_signup_btn:Button = findViewById(R.id.signin_signup_btn)
        val signin_signup_txt:TextView = findViewById(R.id.signin_signup_txt)
        val forgotpassword:TextView = findViewById(R.id.forgot_password)
        val circleImageView:de.hdodenhof.circleimageview.CircleImageView = findViewById(R.id.circleImageView)

        signin.setOnClickListener {
            signin.setTextColor(Color.parseColor("#D8E9F0"))
            signin.setBackgroundColor(Color.parseColor("#33425B"))
            signup.setTextColor(Color.parseColor("#FF2729C3"))
            signup.setBackgroundResource(R.drawable.bordershape)
            circleImageView.setImageResource(R.drawable.signin_boy_img)
            signin_signup_txt.text = "Sign In"
            signin_signup_btn.text = "Sign In"
            forgotpassword.visibility = View.VISIBLE
//            val intent= Intent(this@LoginSignupPage, DisplayActivity:: class.java)
//            startActivity(intent)
        }
        signup.setOnClickListener {
            signup.setTextColor(Color.parseColor("#D8E9F0"))
            signup.setBackgroundColor(Color.parseColor("#33425B"))
            signin.setTextColor(Color.parseColor("#FF2729C3"))
            signin.setBackgroundResource(R.drawable.bordershape)
            circleImageView.setImageResource(R.drawable.signup_boy_img)
            signin_signup_txt.text = "Sign Up"
            signin_signup_btn.text = "Sign Up"
            forgotpassword.visibility = View.INVISIBLE
//            val intent= Intent(this@LoginSignupPage, DisplayActivity:: class.java)
//            startActivity(intent)
        }

    }
    fun switchActivity(view: View) {
        val intent= Intent(this@LoginSignupPage, DisplayActivity::class.java )
        startActivity(intent)
    }
}