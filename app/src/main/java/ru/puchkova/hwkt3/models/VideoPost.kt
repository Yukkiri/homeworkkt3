package ru.puchkova.hwkt3.models

data class VideoPost(
    val videoLink: String, // Добавлено только для видео

    override val date: String,
    override val author: String,
    override val postBody: String? = null,
    override var likeCount: Int,
    override var commentCount: Int,
    override var repostCount: Int,
    override var isLiked: Boolean
) : IPost {

    override fun getPostType() = IPost.PostType.VIDEO
}