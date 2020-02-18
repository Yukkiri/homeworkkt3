package ru.puchkova.hwkt3.adapter.holder

import android.view.View
import android.widget.TextView
import android.widget.VideoView
import kotlinx.android.synthetic.main.ads_post.view.*
import ru.puchkova.hwkt3.R
import ru.puchkova.hwkt3.models.AdsPost
import ru.puchkova.hwkt3.models.Post

class AdsPostHolder(itemView: View) : MainHolder(itemView){
    val delete = itemView.delete
    fun bindAds(post: AdsPost) {
        super.bind(post)
        val mainText = itemView.findViewById<TextView>(R.id.mainText)
        mainText.text = post.postBody

        delete.setOnClickListener{
            itemView.visibility = View.GONE
        }
    }
}