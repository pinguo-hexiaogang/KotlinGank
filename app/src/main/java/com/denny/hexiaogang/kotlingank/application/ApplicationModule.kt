package com.denny.hexiaogang.kotlingank.application

import android.content.Context
import android.content.res.Resources
import com.denny.hexiaogang.kotlingank.network.ApiService
import dagger.Module
import dagger.Provides
import us.pinguo.demo.bet.network.utils.RetrofitManager
import javax.inject.Singleton

/**
 * Created by hexiaogang on 2017/7/31.
 */
@Module
class ApplicationModule constructor(val context: Context) {

    @Provides
    @Singleton
    fun provideContext(): Context {
        return context
    }

    @Provides
    @Singleton
    fun provideResource(): Resources {
        return context.resources
    }

    @Provides
    @Singleton
    fun provideApiService():ApiService{
        return RetrofitManager.mApiService
    }

}