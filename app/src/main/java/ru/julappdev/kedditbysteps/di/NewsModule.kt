package ru.julappdev.kedditbysteps.di

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import ru.julappdev.kedditbysteps.api.NewsAPI
import ru.julappdev.kedditbysteps.api.NewsRestAPI
import ru.julappdev.kedditbysteps.api.RedditApi
import javax.inject.Singleton

/**
 * Created by yulia on 16.10.16.
 */
@Module
class NewsModule {

    @Provides
    @Singleton
    fun provideNewsAPI(redditApi: RedditApi): NewsAPI {
        return NewsRestAPI(redditApi)
    }

    @Provides
    @Singleton
    fun provideRedditApi(retrofit: Retrofit): RedditApi {
        return retrofit.create(RedditApi::class.java)
    }

    /**
     * NewsManager is automatically provided by Dagger as we set the @Inject annotation in the
     * constructor, so we can avoid adding a 'provider method' here.
     */
}