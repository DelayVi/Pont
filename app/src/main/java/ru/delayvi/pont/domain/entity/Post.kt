package ru.delayvi.pont.domain.entity

data class Post(
    val photoUri: String,
    var postDescription: String,
    var likes: Int,
    var comments: List<Comment>
)
