package ru.puchkova.hwkt3

import androidx.annotation.Nullable
import java.time.LocalDate
import java.time.format.DateTimeFormatter

open class Post(
    val date: String,
    val author: String,
    val postBody: String? = null,
    var likeCount: Int,
    var commentCount: Int,
    var repostCount: Int,
    var isLiked: Boolean,
    var videoLink: String? = null){
    fun humanTime(date: String){

        var formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy")
        var ourDate = LocalDate.parse(date, formatter)
    }
}