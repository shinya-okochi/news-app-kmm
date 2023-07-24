package com.example.news_app_kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform