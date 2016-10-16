package ru.julappdev.kedditbysteps.di

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.julappdev.kedditbysteps.KedditApp
import javax.inject.Singleton

/**
 * Created by yulia on 16.10.16.
 */
@Module
class AppModule(val app: KedditApp) {

    @Provides
    @Singleton
    fun provideContext(): Context {
        return app
    }

    @Provides
    @Singleton
    fun provideApplication(): KedditApp {
        return app
    }
}