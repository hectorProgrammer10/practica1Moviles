package com.example.greetingcard.register.data.repository

import com.example.greetingcard.core.network.RetrofitHelper
import com.example.greetingcard.register.data.datasource.RegisterApi
import com.example.greetingcard.register.data.model.CreateUserRequest
import com.example.greetingcard.register.data.model.UserDTO
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class RegisterService()  {
    private val registerApi = RetrofitHelper.getRetrofit()

    suspend fun invokeValidateUsername(username : String) : Boolean {
        return withContext(Dispatchers.IO) {
            val response = registerApi.validateUsername(username)
            response.body()?.success ?: false
        }
    }

    suspend fun invokeCreateUser(request : CreateUserRequest) : UserDTO? {
        return withContext(Dispatchers.IO) {
            val response = registerApi.createUser(request)
            response.body()
        }
    }
}