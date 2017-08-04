package com.denny.hexiaogang.kotlingank.android

import android.content.ClipData
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.denny.hexiaogang.kotlingank.R
import com.denny.hexiaogang.kotlingank.fApp
import com.denny.hexiaogang.kotlingank.jsonbean.ItemResponse
import javax.inject.Inject

/**
 * Created by hexiaogang on 2017/8/1.
 */
class AndroidFragment : Fragment(), IAndroidView {
    @Inject
    lateinit var mPresenter: AndroidPresenter
    private var adapter: BaseQuickAdapter<ItemResponse, BaseViewHolder>? = null

    val component: AndroidComponent by lazy {
        fApp.appComponent.plus(AndroidModule())
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater?.inflate(R.layout.android_layout, container, false)
        component.inject(this)
        mPresenter.attach(this)

        mPresenter.requestAndroidList()

        return rootView;
    }

    private fun initAdapter(items: List<ItemResponse>) {
        /*if (adapter == null) {
            adapter = object : BaseQuickAdapter(R.layout.android_layout, items) {
                override fun convert(helper: BaseViewHolder, item: ItemResponse) {

                }
            }
        }*/

    }

    override fun onDestroyView() {
        super.onDestroyView()
        mPresenter.detach()
    }
}