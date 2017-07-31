package us.pinguo.demo.bet.network.utils

import com.denny.hexiaogang.kotlingank.network.ApiService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


object RetrofitManager {
    private var mRetrofit: Retrofit

    val mApiService: ApiService
    public get() = field

    val BASE_URL = "http://52.14.164.47/"
    //val BASE_URL = "http://10.1.5.221:8001/"
    val STATUS_CODE_SUCCESS: Int = 100200;
    val STATUS_CODE_EMAIL_ALREADY_EXSIT: Int = 100401;

    init {
        val okHttpClient = OkHttpClient().newBuilder()
                .connectTimeout(60, TimeUnit.SECONDS)
                .readTimeout(60, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .build()
        mRetrofit = Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okHttpClient)
                .build()
        mApiService = this.mRetrofit.create(ApiService::class.java)
    }

}