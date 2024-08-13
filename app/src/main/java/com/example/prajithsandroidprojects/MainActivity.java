package com.example.prajithsandroidprojects;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
                new Project("getting started app",
                        "a simple getting started app for learning android studio setup",
                        R.drawable.start),
                new Project("length converter app",
                        "a simple length converter app that converts length " +
                                "(ex m to inch) based on user input", R.drawable.tape),
                new Project("vancouver restaurant app",
                        "a simple restaurant app that has several dishes",
                        R.drawable.food),
                new Project("simple reminder app",
                        "simple reminder app that adds tasks and shows time remaining",
                        R.drawable.todo)
        };
    }
}