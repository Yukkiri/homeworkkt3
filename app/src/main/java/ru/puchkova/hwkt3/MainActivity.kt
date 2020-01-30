package ru.puchkova.hwkt3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var date: TextView
    private lateinit var author: TextView
    private lateinit var mainText: TextView
    private lateinit var likes: ImageButton
    private lateinit var comments: ImageButton
    private lateinit var repost: ImageButton
    private lateinit var likesCount: TextView
    private lateinit var commentsCount: TextView
    private lateinit var repostCount: TextView

    private val post = Post("13 september 2019", "Netology", "Some text here\nHas no idea what i should write\nJust testing my code",
        9, 0, 1, false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        setPost()
    }

    fun init() {
        date = findViewById(R.id.date)
        author = findViewById(R.id.author)
        mainText = findViewById(R.id.mainText)
        likes = findViewById(R.id.like)
        comments = findViewById(R.id.comment)
        repost = findViewById(R.id.share)
        likesCount = findViewById(R.id.like_count)
        commentsCount = findViewById(R.id.comment_count)
        repostCount = findViewById(R.id.share_count)

        likes.setOnClickListener{
            if(post.isLiked) {
                post.isLiked = false
                post.likeCount--
                likesCount.setText(post.likeCount.toString())
            } else {
                post.isLiked = true
                post.likeCount++
                likesCount.setText(post.likeCount.toString())
            }
            setColor()
        }
    }

    fun setPost(){
        date.setText(post.date)
        author.setText(post.author)
        mainText.setText(post.postBody)
        if(post.likeCount != 0)
            likesCount.setText(post.likeCount.toString())
        else
            likesCount.setText("")
        if(post.commentCount != 0)
            commentsCount.setText(post.commentCount.toString())
        else
            commentsCount.setText("")
        if(post.repostCount != 0)
            repostCount.setText(post.repostCount.toString())
        else
            repostCount.setText("")

        setColor()
    }

    fun setColor(){
        if(post.isLiked)
            likes.setBackgroundResource(R.drawable.ic_like_true)
        else
            likes.setBackgroundResource(R.drawable.ic_favorite)
    }
}
