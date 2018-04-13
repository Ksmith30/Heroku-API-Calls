package com.example.kyle.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HerokuService {
    @GET("api/product/")
    Call<List<Product>> getProducts();

}
