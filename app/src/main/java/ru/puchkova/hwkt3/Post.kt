package ru.puchkova.hwkt3

class Post(
    val date: String,
    val author: String,
    val postBody: String,
    var likeCount: Int,
    var commentCount: Int,
    var repostCount: Int,
    var isLiked: Boolean
){}