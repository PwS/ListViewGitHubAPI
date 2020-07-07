package com.application.androidgithubapi.helper

import com.application.androidgithubapi.constant.EnumBase
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by PwS on 6/25/2020
 */
object ServiceGenerator {
    @JvmStatic
    fun build(): Retrofit {
        val builder = Retrofit.Builder()
        builder.baseUrl(EnumBase.GITHUB_BASE_URL)
        //GsonConverterFactory
        builder.addConverterFactory(GsonConverterFactory.create())
        return builder.build()
    }
}