package com.example.maccesarr.proyectomascotas.restApi;

import com.example.maccesarr.proyectomascotas.db.ConstantesBaseDatos;
import com.example.maccesarr.proyectomascotas.restApi.model.MascotaResponse;

import retrofit2.Call;
import retrofit2.http.GET;

import static com.example.maccesarr.proyectomascotas.restApi.ConstantesRestApi.ACCESS_TOKEN;
import static com.example.maccesarr.proyectomascotas.restApi.ConstantesRestApi.KEY_ACCESS_TOKEN;

/**
 * Created by MacCesarR on 01/02/17.
 */

public interface EndpointsApi {

   @GET(ConstantesRestApi.KEY_GET_RECENT_MEDIA_USER+KEY_ACCESS_TOKEN+ACCESS_TOKEN)

   Call<MascotaResponse> getRecentMedia();


}
