package com.example.tp_a_distance
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView: ListView = findViewById(R.id.listView)
        val languages = listOf("Java", "C#", "Python", "Kotlin", "Swift")

        listView.choiceMode = ListView.CHOICE_MODE_SINGLE
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, languages)
        listView.adapter = adapter
    }
}