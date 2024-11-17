package com.codepath.articlesearch

import android.app.Application

// Base class within the app the contains all other components (e.g., activities and services)
class ArticleApplication : Application() {
    // Use lazy initialization so this variable isn't created
    // until it is needed
    val db by lazy { AppDatabase.getInstance(this) }
}