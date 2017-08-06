package com.denny.hexiaogang.kotlingank.presenter

/**
 * Created by hexiaogang on 2017/8/6.
 */
interface Presenter {
    fun attach(controller: ViewController)
    fun detach()
}