package com.csergio.myapp1.util

import com.csergio.myapp1.model.ChatRoom
import com.csergio.myapp1.model.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Field
import retrofit2.http.POST

interface PostService {

    @POST("/users/signup")
    fun requestSignUpPost(@Body user:User):Call<String>

    @POST("/users/login")
    fun requestLogin(@Body user:User):Call<String>

    @POST("/users/friends")
    fun getFriendsList():Call<MutableList<User>>

    @POST("/chat/checkroom")
    fun isExistRoom(@Body chatroom:ChatRoom):Call<MutableList<ChatRoom>>

}