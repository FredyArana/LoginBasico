package com.fredy.loginapp.network

import com.fredy.loginapp.model.LoginRequest
import com.fredy.loginapp.model.LoginResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("api/login")
    suspend fun login(@Body loginRequest: LoginRequest): Response<LoginResponse>
}