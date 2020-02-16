package ru.puchkova.hwkt3

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ВООБЩЕ НЕ ПОНИМАЮ ЧТО ДЕЛАЮ

        val posts = listOf(

            Post("13 september 2019", "Netology", "Some text here\nHas no idea what i should write\nJust testing my code",
                9, 0, 1, false, "http://video.ch9.ms/ch9/507d/71f4ef0f-3b81-4d2c-956f-c56c81f9507d/AndroidEmulatorWithMacEmulator.mp4"),

            Post("15 september 2019", "Netology", "Otters are cute",
                0, 0, 2, false, "https://www.youtube.com/watch?v=rIwGkC8QjyM"),

            Post("16 september 2019", "Netology", "But raccoons are cuter\nThe most cutest creatures in the whole world",
                99, 0, 5, false, "https://www.youtube.com/watch?v=rIwGkC8QjyM"),

            Post("20 october 2019", "Netology", "And stupid\nofc, how can i forgot",
                150, 10, 3, false, "https://www.youtube.com/watch?v=rIwGkC8QjyM"),

            Post("31 december 2019", "Netology", "Happy New Year!\nGood luck!",
                1393, 255, 100, false, "https://www.youtube.com/watch?v=rIwGkC8QjyM"),

            Post("1 january 2020", "Netology", "So much food was a mistake\nFeeling too bad\nHlp m pls",
                1800, 1010, 99, false, "https://www.youtube.com/watch?v=rIwGkC8QjyM"),

            Post("10 january 2020", "Netology", "Idk what to write\nLook at my horse\nMy horse is amazing",
                3, 40, 0, false, "https://www.youtube.com/watch?v=rIwGkC8QjyM"),

            Post("15 january 2020", "Netology", "The most\nUseless\nWay\nto waste\nmy time\nOMG",
                33, 1, 0, false, "https://www.youtube.com/watch?v=rIwGkC8QjyM"),

            Post("16 january 2020", "Netology", "Just a joke, relax",
                20, 0, 0, false, "https://www.youtube.com/watch?v=rIwGkC8QjyM")
        )

        postList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL ,false)

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {
            val permissions = arrayOf(Manifest.permission.INTERNET)
            ActivityCompat.requestPermissions(this, permissions,0)
        }

        val adapter = MediaPostAdapter(posts)

        postList.adapter = adapter
    }
}
