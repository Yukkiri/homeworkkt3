package ru.puchkova.hwkt3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class MediaPostAdapter(var posts: List<Post>) : RecyclerView.Adapter<MediaPostHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        MediaPostHolder(LayoutInflater.from(parent.context).inflate(R.layout.post_card, parent, false))

    override fun getItemCount() = posts.size

    override fun onBindViewHolder(holder: MediaPostHolder, position: Int) {
        holder.bindVideo(posts[position])
    }
}