package com.denny.hexiaogang.kotlingank.android

import com.denny.hexiaogang.kotlingank.jsonbean.BaseResponse
import com.denny.hexiaogang.kotlingank.jsonbean.ItemResponse
import com.denny.hexiaogang.kotlingank.network.ApiService
import com.denny.hexiaogang.kotlingank.presenter.Presenter
import com.denny.hexiaogang.kotlingank.presenter.ViewController
import com.orhanobut.logger.Logger
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by hexiaogang on 2017/8/6.
 */
@PerComponent
class AndroidPresenter @Inject constructor() : Presenter {
    @Inject
    lateinit var apiService: ApiService
    lateinit var androidView: IAndroidView


    override fun attach(controller: ViewController) {
        androidView = controller as IAndroidView
    }

    override fun detach() {
    }

    fun requestAndroidList() {
        apiService.getAndroidList(1)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe({ response: BaseResponse<List<ItemResponse>> ->
                    Logger.d(response.toString())
                    response.toString()
                }, { it.printStackTrace() })

    }
}