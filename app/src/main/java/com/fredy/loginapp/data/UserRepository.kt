package com.fredy.loginapp.data

import com.fredy.loginapp.model.LoginRequest
import com.fredy.loginapp.model.LoginResponse
import com.fredy.loginapp.network.ApiService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun loginUser(email: String, password: String): LoginResponse? {
        val response = apiService.login(LoginRequest(email, password))
        return if (response.isSuccessful) {
            response.body()
        } else {
            null
        }
    }
}