package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizapp.databinding.ActivityLoginBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {
    private lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signupBtn.setOnClickListener {
            Firebase.auth.createUserWithEmailAndPassword(binding.emailtxt.editText?.text.toString(), binding.passtxt.editText?.text.toString()).addOnCompleteListener{
                if(it.isSuccessful){
                    Toast.makeText(this,"User created !!!", Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this, "Failed !!!", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}
