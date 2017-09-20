package com.periferiait.contactbusiness.kedditbysteps.di.news

/**
 * Created by admin on 20/09/17.
 */

import com.periferiait.contactbusiness.kedditbysteps.api.NewsApi
import com.periferiait.contactbusiness.kedditbysteps.api.NewsRestApi
import com.periferiait.contactbusiness.kedditbysteps.api.RedditApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 *
 * @author juancho.
 */
@Module
class NewsModule {

    @Provides
    @Singleton
    fun provideNewsAPI(redditApi: RedditApi): NewsApi = NewsRestApi(redditApi)

    @Provides
    @Singleton
    fun provideRedditApi(retrofit: Retrofit): RedditApi = retrofit.create(RedditApi::class.java)

    /**
     * NewsManager is automatically provided by Dagger as we set the @Inject annotation in the
     * constructor, so we can avoid adding a 'provider method' here.
     */
}