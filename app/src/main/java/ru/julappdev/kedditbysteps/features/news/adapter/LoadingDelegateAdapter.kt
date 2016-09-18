package ru.julappdev.kedditbysteps.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import ru.julappdev.kedditbysteps.R
import ru.julappdev.kedditbysteps.commons.adapter.ViewType
import ru.julappdev.kedditbysteps.commons.adapter.ViewTypeDelegateAdapter
import ru.julappdev.kedditbysteps.commons.extensions.inflate

/**
 * Created by yulia on 18.09.16.
 */
class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = TurnsViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading)) {
    }
}