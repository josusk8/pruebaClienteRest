package com.example.pruebaclienterest.Interface;

import com.example.pruebaclienterest.persistence.Model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface  JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Posts>> getPosts();
}
