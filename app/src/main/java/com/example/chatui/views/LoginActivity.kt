package com.example.chatui.views

import LoginResponse
import NetworkUtils
import SessionManager
import android.content.Intent
import android.os.Bundle
import android.util.Base64
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.chatui.databinding.ActivityLoginBinding
import com.example.chatui.models.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.Instant
import java.time.format.DateTimeFormatter
import java.util.Date
import java.util.Locale
import java.util.TimeZone

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var session: SessionManager
    private val CLIENT_ID = "myclientid"
    private val CLIENT_SECRET = "myclientsecret"
    private val GRANT_TYPE = "password"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        session = SessionManager(applicationContext)


        binding.btnLogin.setOnClickListener {
            login()
        }

    }

    fun login() {
        val service = NetworkUtils.createServiceLogin()

        val email = binding.edtEmail.text.toString()
        val password = binding.edtPassword.text.toString()

        val combineCredentials = "$CLIENT_ID:$CLIENT_SECRET"
        val authorization =
            "Basic " + Base64.encodeToString(combineCredentials.toByteArray(), Base64.NO_WRAP)

        service.login(authorization, email, password, GRANT_TYPE)
            .enqueue(object : Callback<LoginResponse> {
                override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                    if (response.isSuccessful) {
                        val loginResponse = response.body()
                        saveToken(loginResponse?.accessToken.toString(), loginResponse!!.expiresIn)
                        saveLogedUser()
                        startActivity(Intent(this@LoginActivity, ChatRoomActivity::class.java))
                        finish()
                    }
                }

                override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                    Log.i("LOGIN", t.message.toString())
                }
            })

    }
    fun saveToken(token: String, expiresIn: Long) {
        session.accessToken = "Bearer $token"
        session.accessTokenExpiration = Date().time.plus(expiresIn * 1000).toString()
    }

    fun saveLogedUser() {
        val service = NetworkUtils.createServiceUser()
        val accessToken = session.accessToken

        if (accessToken != null) {
            service.getUser(accessToken)
                .enqueue(object : Callback<User> {
                    override fun onResponse(call: Call<User>, response: Response<User>) {
                        if (response.isSuccessful) {
                            val user = response.body()
                            session.userLogged = user?.nickname.toString()
                        }
                    }

                    override fun onFailure(call: Call<User>, t: Throwable) {
                        Log.i("LOGIN", t.message.toString())
                    }
                })
        }
    }
}