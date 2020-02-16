package ru.puchkova.hwkt3

import android.net.Uri
import android.view.View
import android.widget.TextView
import android.widget.VideoView
import androidx.core.net.toUri

class MediaPostHolder(itemView: View) : MainHolder(itemView){
    fun bindVideo(post: Post) {
        super.bind(post)
        val mainText = itemView.findViewById<TextView>(R.id.mainText)
        val video: VideoView = itemView.findViewById(R.id.video)
        mainText.text = post.postBody
        video.visibility = View.VISIBLE
        val uri: Uri = post.videoLink!!.toUri()
        video.setVideoURI(uri)
    }
}