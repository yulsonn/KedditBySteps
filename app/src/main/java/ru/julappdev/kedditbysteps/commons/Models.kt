package ru.julappdev.kedditbysteps.commons

import ru.julappdev.kedditbysteps.commons.adapter.AdapterConstants
import ru.julappdev.kedditbysteps.commons.adapter.ViewType

/**
 * Created by yulia on 18.09.16.
 */
data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
) : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}