package com.example.workout

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.toMutableStateList

@Composable
fun TemplateView(template : Template){
    var exercises = remember { template.exercises.toMutableStateList() }
    Column{
        for (exercise in exercises){
            ExerciseView(exercise , onExerciseCompleted = {
                exercise.completed = true
            })
            if (exercise.completed){
                Text("Completed")
            }
        }
    }
}