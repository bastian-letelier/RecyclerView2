package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.recyclerview2.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.contenedor.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Element> l = new ArrayList<>();
        l.add(new Element("1", "Bryan", "Letelier"));
        l.add(new Element("2", "Maria", "Rodriguez"));
        l.add(new Element("3", "Eduardo", "Perez"));
        l.add(new Element("4", "Gonzalo", "Reyes"));

        LAdapter adapter = new LAdapter();
        binding.contenedor.getAdapter();
        adapter.submitList(l);

    }
}