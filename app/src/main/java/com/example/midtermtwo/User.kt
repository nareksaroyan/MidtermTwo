package com.example.midtermtwo

data class User(
    val name: Name,
    val email: String,
    val nat: String
)

data class Name(
    val title: String,
    val first: String,
    val last: String
)