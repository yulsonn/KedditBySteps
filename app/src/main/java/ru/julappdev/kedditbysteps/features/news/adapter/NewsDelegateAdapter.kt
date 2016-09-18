package ru.julappdev.kedditbysteps.features.news.adapter

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import kotlinx.android.synthetic.main.news_item.view.*
import ru.julappdev.kedditbysteps.R
import ru.julappdev.kedditbysteps.commons.RedditNewsItem
import ru.julappdev.kedditbysteps.commons.adapter.ViewType
import ru.julappdev.kedditbysteps.commons.adapter.ViewTypeDelegateAdapter
import ru.julappdev.kedditbysteps.commons.extensions.getFriendlyTime
import ru.julappdev.kedditbysteps.commons.extensions.inflate
import ru.julappdev.kedditbysteps.commons.extensions.loadImg

/**
 * Created by yulia on 18.09.16.
 */
class NewsDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
        return TurnsViewHolder(parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
        holder as TurnsViewHolder
        holder.bind(item as RedditNewsItem)
    }

    class TurnsViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item)) {

        fun bind(item: RedditNewsItem) = with(itemView) {
            //Picasso.with(itemView.context).load(item.thumbnail).into(img_thumbnail)
            img_thumbnail.loadImg(item.thumbnail)
            description.text = item.title
            author.text = item.author
            comments.text = "${item.numComments} comments"
            time.text = item.created.getFriendlyTime()
        }
    }
}