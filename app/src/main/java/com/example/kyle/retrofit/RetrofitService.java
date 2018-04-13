package com.example.kyle.retrofit;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class RetrofitService {

    HerokuService herokuService;

    public RetrofitService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://brogram.herokuapp.com/")
                .addConverterFactory(MoshiConverterFactory.create())
                .build();

        herokuService = retrofit.create(HerokuService.class);
    }

    public Call<List<Product>> getProducts() {
         return herokuService.getProducts();
    }
}
