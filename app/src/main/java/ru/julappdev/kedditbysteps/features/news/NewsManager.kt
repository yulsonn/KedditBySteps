package ru.julappdev.kedditbysteps.features.news

import ru.julappdev.kedditbysteps.api.NewsAPI
import ru.julappdev.kedditbysteps.api.NewsRestAPI
import ru.julappdev.kedditbysteps.commons.RedditNews
import ru.julappdev.kedditbysteps.commons.RedditNewsItem
import rx.Observable

/**
 * Created by yulia on 20.09.16.
 */
class NewsManager(private val api: NewsAPI = NewsRestAPI()) {

    /**
     *
     * Returns Reddit News paginated by the given limit.
     *
     * @param after indicates the next page to navigate.
     * @param limit the number of news to request.
     */
    fun getNews(after: String, limit: String = "10"): Observable<RedditNews> {
        return Observable.create {
            subscriber ->
            val callResponse = api.getNews(after, limit)
            val response = callResponse.execute()

            if (response.isSuccessful) {
                val dataResponse = response.body().data
                val news = dataResponse.children.map {
                    val item = it.data
                    RedditNewsItem(item.author, item.title, item.num_comments,
                            item.created, item.thumbnail, item.url)
                }
                val redditNews = RedditNews(
                        dataResponse.after ?: "",
                        dataResponse.before ?: "",
                        news)

                subscriber.onNext(redditNews)
                subscriber.onCompleted()
            } else {
                subscriber.onError(Throwable(response.message()))
            }
        }
    }
}