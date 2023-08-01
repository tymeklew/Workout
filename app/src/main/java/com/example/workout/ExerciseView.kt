package com.example.workout

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun ExerciseView(exercise: Exercise , onExerciseCompleted : () -> Unit){
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(exercise.name , fontSize = 25.sp)
        Text("${exercise.sets.size} Sets" , fontSize = 15.sp)
        for (set in exercise.sets){
            SetView(set = set , onSetCompletedToggled = {
                set.completed = !set.completed
                if (exercise.sets.all { set -> set.completed }){
                    onExerciseCompleted()
                }
            })
        }
    }
}