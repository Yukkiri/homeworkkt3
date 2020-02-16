package ru.puchkova.hwkt3

import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

open class MainHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(post: Post) {
        var author = itemView.findViewById<TextView>(R.id.author)
        var date = itemView.findViewById<TextView>(R.id.date)
        var likesCount = itemView.findViewById<TextView>(R.id.likesCount)
        var shareCount = itemView.findViewById<TextView>(R.id.shareCount)
        var commentCount = itemView.findViewById<TextView>(R.id.commentsCount)
        var like = itemView.findViewById<ImageButton>(R.id.like)
        var comment = itemView.findViewById<ImageButton>(R.id.comment)
        var share = itemView.findViewById<ImageButton>(R.id.share)
        author.text = post.author
        date.text = post.date
        likesCount.text = post.likeCount.toString()
        if (post.likeCount == 0)
            likesCount.visibility = View.GONE
        else
            likesCount.visibility = View.VISIBLE
        shareCount.text = post.repostCount.toString()
        if (post.repostCount == 0)
            shareCount.visibility = View.GONE
        else
            shareCount.visibility = View.VISIBLE
        commentCount.text = post.commentCount.toString()
        if (post.commentCount == 0)
            commentCount.visibility = View.GONE
        else
            commentCount.visibility = View.VISIBLE

        like.setOnClickListener {
            if (post.isLiked) {
                post.isLiked = false
                post.likeCount--
                likesCount.text = post.likeCount.toString()
            } else {
                post.isLiked = true
                post.likeCount++
                likesCount.text = post.likeCount.toString()
            }


            if (post.isLiked)
                like.setBackgroundResource(R.drawable.ic_like_true)
            else
                like.setBackgroundResource(R.drawable.ic_favorite)
        }
    }

}