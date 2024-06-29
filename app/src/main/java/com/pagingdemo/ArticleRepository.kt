package com.pagingdemo

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow

class ArticleRepository(private val apiService: ApiService) {
    fun getArticles(): Flow<PagingData<Article>> {
        return Pager(
            config = PagingConfig(
                pageSize = 20,
                prefetchDistance = 2,
                initialLoadSize = 40
            ),
            pagingSourceFactory = { ArticlePagingSource(apiService) }
        ).flow
    }
}