package ru.delayvi.pont.domain.entity

data class Post(
    val time: String,
    val id: Int,
    val photoUri: String,
    var postDescription: String,
    var likes: Int,
    var comments: List<Comment>
)
