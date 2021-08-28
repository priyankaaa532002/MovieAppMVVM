package com.example.movieapp.data.api

import com.example.movieapp.data.vo.MovieDetails
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface TheMovieDBInterface {

    //https://api.themoviedb.org/3/movie/497698?api_key=ed0a9b22fe9c7200aaa0122d04550e78
    //https://www.themoviedb.org/
    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id")id: Int): Single<MovieDetails>
}