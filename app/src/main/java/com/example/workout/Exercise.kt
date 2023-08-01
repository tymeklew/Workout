package com.example.workout

data class Exercise(
    var name : String,
    var sets : List<Set>,
    var completed : Boolean = false
    )
