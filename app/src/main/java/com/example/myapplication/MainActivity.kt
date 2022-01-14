package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerViewPersonAdapter: RecyclerViewPersonAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView = findViewById<BottomNavigationView>(R.id.bottomNavMenu)
        val controller = findNavController(R.id.nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.addFragment,
                R.id.userFragment
            )
        )
        setupActionBarWithNavController(controller, appBarConfiguration)
        navView.setupWithNavController(controller)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerViewPersonAdapter(getData())

    }
    private fun getData() : List<Posts>{
        val list = ArrayList<Posts>()
        list.add(
            Posts(
                1,
                "https://www.myanbiz-consulting.com/wp-content/uploads/2019/04/4214892-news-images.jpg",
                "Best news in the world\nfor you"
            )
        )
        list.add(
            Posts(
                2,
                "https://www.myanbiz-consulting.com/wp-content/uploads/2019/04/4214892-news-images.jpg",
                "very very gooood\nnews for you"
            )
        )
        list.add(
            Posts(
                3,
                "https://www.myanbiz-consulting.com/wp-content/uploads/2019/04/4214892-news-images.jpg",
                "very very gooood\nnews for you"
            )
        )
        list.add(
            Posts(
                4,
                "https://www.myanbiz-consulting.com/wp-content/uploads/2019/04/4214892-news-images.jpg",
                "very very gooood\nnews for you"
            )
        )
        return list
    }
}