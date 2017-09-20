package com.periferiait.contactbusiness.kedditbysteps.api




import retrofit2.Call
/**
 * Created by admin on 20/09/17.
 */

interface NewsApi {
    fun getNews(after: String, limit: String): Call<RedditNewsResponse>
}