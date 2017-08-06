package com.denny.hexiaogang.kotlingank.application

import android.app.Application
import com.denny.hexiaogang.kotlingank.BuildConfig
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy

/**
 * Created by hexiaogang on 2017/7/31.
 */
class GankApplication : Application() {

    val appComponent: ApplicationComponent by lazy {
        DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build()
    }


    override fun onCreate() {
        super.onCreate()
        initLog()
    }

    private fun initLog() {
        val formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(false)  // (Optional) Whether to show thread info or not. Default true
                .methodCount(1)         // (Optional) How many method line to show. Default 2
                .methodOffset(7)        // (Optional) Hides internal method calls up to offset. Default 5
                //.logStrategy(customLog) // (Optional) Changes the log strategy to print out. Default LogCat
                .tag("Bet")   // (Optional) Global tag for every log. Default PRETTY_LOGGER
                .build()

        Logger.addLogAdapter(object : AndroidLogAdapter(formatStrategy) {
            override fun isLoggable(priority: Int, tag: String?): Boolean {
                return BuildConfig.DEBUG;
            }
        })
    }
}