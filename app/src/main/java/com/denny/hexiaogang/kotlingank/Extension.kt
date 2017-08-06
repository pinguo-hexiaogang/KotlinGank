package com.denny.hexiaogang.kotlingank

import android.app.Activity
import android.support.v4.app.Fragment
import com.denny.hexiaogang.kotlingank.application.GankApplication

/**
 * Created by hexiaogang on 2017/8/1.
 */
val Activity.app: GankApplication
    get() = application as GankApplication

val Fragment.fApp: GankApplication
    get() = context.applicationContext as GankApplication