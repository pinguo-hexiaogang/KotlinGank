package com.denny.hexiaogang.kotlingank.android

import dagger.Subcomponent
import javax.inject.Singleton

/**
 * Created by hexiaogang on 2017/8/1.
 */
@PerComponent
@Subcomponent(modules = arrayOf(AndroidModule::class))
interface AndroidComponent {
    fun inject(fragment: AndroidFragment)
}