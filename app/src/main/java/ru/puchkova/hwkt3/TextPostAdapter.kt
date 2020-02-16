package ru.puchkova.hwkt3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class TextPostAdapter(var posts: List<Post>) : RecyclerView.Adapter<TextPostHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        TextPostHolder(LayoutInflater.from(parent.context).inflate(R.layout.post_card, parent, false))

    override fun getItemCount() = posts.size

    override fun onBindViewHolder(holder: TextPostHolder, position: Int) {
        holder.bindText(posts[position])
    }
}