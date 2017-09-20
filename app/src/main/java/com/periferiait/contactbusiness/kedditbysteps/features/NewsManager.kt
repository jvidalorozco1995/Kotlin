package com.periferiait.contactbusiness.kedditbysteps.features

import com.periferiait.contactbusiness.kedditbysteps.api.NewsApi
import com.periferiait.contactbusiness.kedditbysteps.api.NewsRestApi
import com.periferiait.contactbusiness.kedditbysteps.commons.Models.RedditNews
import com.periferiait.contactbusiness.kedditbysteps.commons.Models.RedditNewsItem
import io.reactivex.Observable
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by admin on 20/09/17.
 */
@Singleton
class NewsManager @Inject constructor(private val api: NewsApi) {

    /**
     *
     * Returns Reddit News paginated by the given limit.
     *
     * @param after indicates the next page to navigate.
     * @param limit the number of news to request.
     */
    fun getNews(after: String, limit: String = "10"): Observable<RedditNews> {
        return Observable.create {
            subscriber ->
            val callResponse = api.getNews(after, limit)
            val response = callResponse.execute()

            if (response.isSuccessful) {
                val dataResponse = response.body()!!.data
                val news = dataResponse.children.map {
                    val item = it.data
                    RedditNewsItem(item.author, item.title, item.num_comments,
                            item.created, item.thumbnail, item.url)
                }
                val redditNews = RedditNews(
                        dataResponse.after ?: "",
                        dataResponse.before ?: "",
                        news)

                subscriber.onNext(redditNews)
                subscriber.onComplete()
            } else {
                subscriber.onError(Throwable(response.message()))
            }
        }
    }

}