package com.denny.hexiaogang.kotlingank.jsonbean

/**
 * Created by hexiaogang on 2017/8/1.
 */
data class BaseResponse<T>(val error:Boolean,val results:T)
