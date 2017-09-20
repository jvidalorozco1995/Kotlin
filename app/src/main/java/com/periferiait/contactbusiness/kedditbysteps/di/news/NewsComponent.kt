package com.periferiait.contactbusiness.kedditbysteps.di.news

/**
 * Created by admin on 20/09/17.
 */
import com.periferiait.contactbusiness.kedditbysteps.di.AppModule
import com.periferiait.contactbusiness.kedditbysteps.di.NetworkModule
import com.periferiait.contactbusiness.kedditbysteps.features.NewsFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AppModule::class,
        NewsModule::class,
        NetworkModule::class)
)

interface NewsComponent {

    fun inject(newsFragment: NewsFragment)

}