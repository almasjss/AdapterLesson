package com.example.adapterlesson;

import android.media.Image;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    int[] images = {R.drawable.image1, R.drawable.image2,
            R.drawable.image3, R.drawable.image4};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gallery gallery = findViewById(R.id.gallery);
        gallery.setAdapter(new ImageAdapter(this, images));

//        GridView gridView = findViewById(R.id.gridView);
//        ImageAdapter imageAdapter = new ImageAdapter(this, images);
//        gridView.setAdapter(imageAdapter);

//        ListView listView = findViewById(R.id.listView);
//        String[] data = {"Test1","Test2","Test3","Test4","Test5"};
//        ArrayAdapter<String> arrayAdapter = new
//                ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);
//        listView.setAdapter(arrayAdapter);
//    }


    }

}