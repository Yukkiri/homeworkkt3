package ru.puchkova.hwkt3

import android.view.View
import android.widget.TextView
import android.widget.VideoView

class GeoPostHolder(itemView: View) : MainHolder(itemView){
    fun bindGeo(post: Post) {
        super.bind(post)
        val mainText = itemView.findViewById<TextView>(R.id.mainText)
        val video: VideoView = itemView.findViewById(R.id.video)
        mainText.text = post.postBody
        video.visibility = View.VISIBLE
        video.setVideoPath(post.videoLink)
    }
}