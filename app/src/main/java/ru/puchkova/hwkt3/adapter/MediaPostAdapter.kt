package ru.puchkova.hwkt3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.puchkova.hwkt3.adapter.holder.MediaPostHolder
import ru.puchkova.hwkt3.models.Post
import ru.puchkova.hwkt3.R
import ru.puchkova.hwkt3.adapter.holder.TextPostHolder
import ru.puchkova.hwkt3.models.IPost
import ru.puchkova.hwkt3.models.VideoPost


class MediaPostAdapter(var posts: List<IPost>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.post_card,
            parent,
            false
        )
        return when(viewType) {
            IPost.PostType.VIDEO -> MediaPostHolder(itemView)
            IPost.PostType.TEXT -> TextPostHolder(itemView)
            else -> throw IllegalArgumentException("ViewType $viewType is not supported!")
        }
    }

    override fun getItemViewType(position: Int) = posts[position].getPostType()

    override fun getItemCount() = posts.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val post = posts[position]
        val postType = post.getPostType()
        when (postType) {
            IPost.PostType.VIDEO -> (holder as MediaPostHolder).bindVideo(post as VideoPost)
            IPost.PostType.TEXT -> (holder as TextPostHolder).bindText(post)
            else -> throw IllegalArgumentException("ViewType $postType is not supported!")
        }
    }
}