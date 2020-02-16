package ru.puchkova.hwkt3.adapter.holder

import android.net.Uri
import android.view.View
import android.widget.VideoView
import androidx.core.net.toUri
import kotlinx.android.synthetic.main.post_card.view.*
import ru.puchkova.hwkt3.adapter.holder.MainHolder
import ru.puchkova.hwkt3.models.Post
import ru.puchkova.hwkt3.models.VideoPost

class MediaPostHolder(itemView: View) : MainHolder(itemView){

    val mainText = itemView.mainText
    val video: VideoView = itemView.video

    fun bindVideo(post: VideoPost) {
        super.bind(post)

        mainText.text = post.postBody
        video.visibility = View.VISIBLE
        val uri: Uri = post.videoLink.toUri()
        video.setVideoURI(uri)
    }
}