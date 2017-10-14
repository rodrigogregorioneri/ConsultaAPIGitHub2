package com.example.neridev.consultaapigithub;

import com.example.neridev.consultaapigithub.entity.Repositories;
import com.example.neridev.consultaapigithub.services.RepositorioInterface;

import java.util.List;


import retrofit2.Call;
import retrofit2.Response;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by neridev on 14/10/2017.
 */

public class rest implements RepositorioInterface {

    @Override
    public Call<List<Repositories>> listRepos() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(RepositorioInterface.API_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();

        List<Repositories> repositories = null;

        RepositorioInterface service = retrofit.create(RepositorioInterface.class);

        Call<List<Repositories>> call = service.listRepos();
        Call<List<Repositories>> call2 = call.clone();
        Response<List<Repositories>> response = null;
        try {
            response = call2.execute();
            repositories = response.body();
            if (repositories != null) {
                return (Call<List<Repositories>>) repositories;
            }
            return (Call<List<Repositories>>) repositories;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
