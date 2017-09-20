package com.periferiait.contactbusiness.kedditbysteps.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by admin on 20/09/17.
 */
interface RedditApi {

    @GET("/top.json")
    fun getTop(@Query("after") after: String,
               @Query("limit") limit: String): Call<RedditNewsResponse>;
}