package com.application.androidgithubapi

import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.application.androidgithubapi.adapter.GithubAdapter
import com.application.androidgithubapi.helper.ServiceGenerator.build
import com.application.androidgithubapi.model.GithubUser
import com.application.androidgithubapi.service.GithubService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by PwS on 6/25/2020
 */
class MainActivity : AppCompatActivity() {
    private var listView: ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById<View>(R.id.list_user) as ListView
        val githubService = build().create(
            GithubService::class.java
        )
        val callAsync =
            githubService.getUsers(10, 1)
        callAsync!!.enqueue(object : Callback<List<GithubUser?>?> {
            override fun onResponse(
                call: Call<List<GithubUser?>?>,
                response: Response<List<GithubUser?>?>
            ) {
                val result = response.body()
                val adapter = GithubAdapter(applicationContext, 0, result as List<GithubUser>)
                listView!!.adapter = adapter
            }

            override fun onFailure(
                call: Call<List<GithubUser?>?>,
                t: Throwable
            ) {
                println(t.message)
            }
        })
    }
}