package ru.puchkova.hwkt3.adapter.holder

import android.view.View
import android.widget.TextView
import android.widget.VideoView
import ru.puchkova.hwkt3.R
import ru.puchkova.hwkt3.models.Post

class AdsPostHolder(itemView: View) : MainHolder(itemView){
    fun bindAds(post: Post) {
        super.bind(post)
        val mainText = itemView.findViewById<TextView>(R.id.mainText)
        val video: VideoView = itemView.findViewById(R.id.video)
        mainText.text = post.postBody
        video.visibility = View.VISIBLE
//        video.setVideoPath(post.videoLink)
    }
}