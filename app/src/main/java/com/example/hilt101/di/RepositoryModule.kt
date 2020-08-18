package com.example.hilt101.di

import com.example.hilt101.repository.MainRepository
import com.example.hilt101.retrofit.BlogRetrofit
import com.example.hilt101.retrofit.NetworkMapper
import com.example.hilt101.room.BlogDao
import com.example.hilt101.room.CacheMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {
    @Singleton
    @Provides
    fun provideMainRepository(
        blogDao: BlogDao,
        retrofit: BlogRetrofit,
        cacheMapper: CacheMapper,
        networkMapper: NetworkMapper
    ): MainRepository {
        return MainRepository(blogDao, retrofit, cacheMapper, networkMapper)
    }
}