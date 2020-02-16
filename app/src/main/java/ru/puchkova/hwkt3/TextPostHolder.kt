package ru.puchkova.hwkt3

import android.view.View
import android.widget.ImageButton
import android.widget.TextView

class TextPostHolder(itemView: View) : MainHolder(itemView){
    fun bindText(post: Post) {
        super.bind(post)
        var mainText = itemView.findViewById<TextView>(R.id.mainText)
        mainText.text = post.postBody
    }
}