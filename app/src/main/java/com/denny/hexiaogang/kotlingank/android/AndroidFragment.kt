package com.denny.hexiaogang.kotlingank.android

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.denny.hexiaogang.kotlingank.fApp
import javax.inject.Inject

/**
 * Created by hexiaogang on 2017/8/1.
 */
class AndroidFragment : Fragment(),IAndroidView{
    @Inject
    lateinit var mPresenter: AndroidPresenter
    val component: AndroidComponent by lazy {
        fApp.appComponent.plus(AndroidModule())
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = super.onCreateView(inflater, container, savedInstanceState);
        component.inject(this)
        mPresenter.attach(this)

        mPresenter.requestAndroidList()



        return rootView;
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mPresenter.detach()
    }
}