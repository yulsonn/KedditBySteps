package ru.julappdev.kedditbysteps.di.news

import dagger.Component
import ru.julappdev.kedditbysteps.di.AppModule
import ru.julappdev.kedditbysteps.di.NetworkModule
import ru.julappdev.kedditbysteps.di.NewsModule
import ru.julappdev.kedditbysteps.features.news.NewsFragment
import javax.inject.Singleton

/**
 * Created by yulia on 16.10.16.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class, NewsModule::class, NetworkModule::class))
interface NewsComponent {

    fun inject(newsFragment: NewsFragment)

}