package ru.julappdev.kedditbysteps

import android.app.Application
import ru.julappdev.kedditbysteps.di.AppModule
import ru.julappdev.kedditbysteps.di.news.DaggerNewsComponent
import ru.julappdev.kedditbysteps.di.news.NewsComponent

/**
 * Created by yulia on 16.10.16.
 */
class KedditApp : Application() {

    companion object {
        lateinit var newsComponent: NewsComponent
    }

    override fun onCreate() {
        super.onCreate()
        newsComponent = DaggerNewsComponent.builder()
                .appModule(AppModule(this))
                .build()
    }
}