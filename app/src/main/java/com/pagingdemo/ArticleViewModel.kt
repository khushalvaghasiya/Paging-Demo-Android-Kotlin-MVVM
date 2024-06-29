package com.pagingdemo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import kotlinx.coroutines.flow.Flow

class ArticleViewModel : ViewModel() {

    private val repository = ArticleRepository(RetrofitInstance.api)

    val articles: Flow<PagingData<Article>> = repository.getArticles().cachedIn(viewModelScope)
}