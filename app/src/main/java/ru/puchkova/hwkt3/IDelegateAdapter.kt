package ru.puchkova.hwkt3

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.ViewHolder


interface IDelegateAdapter<VH : ViewHolder?, Post> {
    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    fun onBindViewHolder(
        holder: VH,
        post: List<Post>,
        position: Int
    )

    fun onRecycled(holder: VH)
    fun isForViewType(post: List<Post>, position: Int): Boolean
}