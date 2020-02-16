package ru.puchkova.hwkt3

interface IPost{
    object PostType {
        val TEXT = 1
        val GEO = 2
        val VIDEO = 3
        val ADS = 4
    }

    fun getPostType(): Int
}