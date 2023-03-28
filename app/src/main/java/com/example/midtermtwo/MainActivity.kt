package com.example.midtermtwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://randomuser.me/api/?inc=nat,name,email&results=10")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api = retrofit.create(RandomUserApi::class.java)

        suspend fun getUsers(count: Int): List<User> {
            val response = api.getUsers(count)
            return response.body()?.results ?: emptyList()
        }
    }
}