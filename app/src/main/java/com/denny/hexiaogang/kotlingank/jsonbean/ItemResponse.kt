package com.denny.hexiaogang.kotlingank.jsonbean

/**
 * Created by hexiaogang on 2017/8/6.
 */
data class ItemResponse(val _id: String,
                        val createdAt: String,
                        val desc: String,
                        val publishedAt: String,
                        val source: String,
                        val images:List<String>,
                        val type: String,
                        val url: String,
                        val used: Boolean,
                        val who: String
)
