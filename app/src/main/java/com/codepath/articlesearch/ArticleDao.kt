package com.codepath.articlesearch

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ArticleDao {
    @Query("SELECT * FROM article_table")
    // Flow List creates an asynchronous data stream that sequentially emits values
    // and completes normally or with an exception.
    // Use getAll() to listen to any database changes and update the UI
    fun getAll(): Flow<List<ArticleEntity>>

    @Insert
    fun insertAll(articles: List<ArticleEntity>)
    // Note: can create an insert() function to insert only one ArticleEntity,
    // not List<ArticleEntity>

    @Query("DELETE FROM article_table")
    fun deleteAll()
}