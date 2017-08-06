package com.denny.hexiaogang.kotlingank.application

import com.denny.hexiaogang.kotlingank.android.AndroidComponent
import com.denny.hexiaogang.kotlingank.android.AndroidModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by hexiaogang on 2017/8/1.
 */
@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {
    fun plus(module: AndroidModule): AndroidComponent
}