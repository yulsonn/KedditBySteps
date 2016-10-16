package ru.julappdev.kedditbysteps.api

import retrofit2.Call

/**
 * Created by yulia on 16.10.16.
 */
interface NewsAPI {

    fun getNews(after: String, limit: String): Call<RedditNewsResponse>
}