package com.example.bodyboost

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.bodyboost.databinding.ActivityHomeBinding
import com.google.firebase.auth.FirebaseAuth


class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())

        auth = FirebaseAuth.getInstance()




        binding.bottomNavigationView.setOnItemSelectedListener {

                when (it.itemId) {

                    R.id.home -> replaceFragment(Home())
                    R.id.fit -> replaceFragment(Fit())
                    R.id.profile -> replaceFragment(Profile())


                    else -> {


                    }

                }

                true

            }


        }

        private fun replaceFragment(fragment: Fragment) {

            val fragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout, fragment)
            fragmentTransaction.commit()


        }
    }



