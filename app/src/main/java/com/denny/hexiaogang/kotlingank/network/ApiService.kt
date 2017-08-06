package com.denny.hexiaogang.kotlingank.network

import com.denny.hexiaogang.kotlingank.jsonbean.BaseResponse
import com.denny.hexiaogang.kotlingank.jsonbean.ItemResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by hexiaogang on 2017/7/29.
 */
interface ApiService {
    @GET("api/data/Android/{count}/{page}")
    fun getAndroidList(@Path("page") page: Int, @Path("count") count: Int = DEFAULT_COUNT): Observable<BaseResponse<List<ItemResponse>>>

    companion object {
        const val DEFAULT_COUNT = 10
    }
}