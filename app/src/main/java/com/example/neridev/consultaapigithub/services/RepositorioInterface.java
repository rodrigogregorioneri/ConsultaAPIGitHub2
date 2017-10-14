package com.example.neridev.consultaapigithub.services;

import com.example.neridev.consultaapigithub.entity.Repositories;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


/**
 * Created by neridev on 14/10/2017.
 */

public interface RepositorioInterface {
        public static final String API_URL = "https://api.github.com/";

        @GET("search/repositories?q=language:Java&sort=stars&page=1")
        Call<List<Repositories>> listRepos();



}
