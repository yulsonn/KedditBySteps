package ru.julappdev.kedditbysteps.api

import retrofit2.Call

import javax.inject.Inject

/**
 * Created by yulia on 04.10.16.
 */
class NewsRestAPI @Inject constructor(private val redditApi: RedditApi) : NewsAPI {

    override fun getNews(after: String, limit: String): Call<RedditNewsResponse> {
        return redditApi.getTop(after, limit)
    }
}