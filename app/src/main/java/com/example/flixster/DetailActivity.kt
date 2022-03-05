package com.example.flixster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var tvOverview: TextView
    private lateinit var ratingBar: RatingBar
    private lateinit var tvPopularity: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        tvTitle = findViewById(R.id.tvTitle)
        tvOverview = findViewById(R.id.tvOverview)
        ratingBar = findViewById(R.id.rbVoteAverage)
        tvPopularity = findViewById(R.id.tvPopularity)

        val movie = intent.getParcelableExtra<Movie>(MOVIE_EXTRA) as Movie
        tvTitle.text = movie.title
        tvOverview.text = movie.overview
        ratingBar.rating = movie.voteAverage.toFloat()
        tvPopularity.text = "Popularity: " + movie.popularity.toString()
    }
}