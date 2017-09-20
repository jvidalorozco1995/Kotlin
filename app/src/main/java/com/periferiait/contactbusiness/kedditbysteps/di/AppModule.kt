package com.periferiait.contactbusiness.kedditbysteps.di

import android.app.Application
import android.content.Context
import com.periferiait.contactbusiness.kedditbysteps.KedditApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by admin on 20/09/17.
 */

    @Module
    class AppModule(val app: KedditApp) {

        @Provides
        @Singleton
        fun provideContext(): Context = app

        @Provides
        @Singleton
        fun provideApplication() : Application = app

    }
