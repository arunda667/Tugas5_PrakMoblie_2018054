package com.example.pertemuan5_reycycle;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recylerView;
    String s1[], s2[],s3[];
    int images[] =
            {R.drawable.rog,R.drawable.acer,R.drawable.zenbook,R.drawable.dell};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recylerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.Laptop);
        s2 = getResources().getStringArray(R.array.penjelasan);
        s3 = getResources().getStringArray(R.array.bintang);
        LaptopAdapter appAdapter = new LaptopAdapter(this,s1,s2,s3,images);
        recylerView.setAdapter(appAdapter);
//        recylerView.setLayoutManager(new LinearLayoutManager(this));

        LinearLayoutManager layoutManager = new LinearLayoutManager((this),
        LinearLayoutManager.HORIZONTAL,false);
        recylerView.setLayoutManager(layoutManager);
        recylerView.setItemAnimator(new DefaultItemAnimator());



    }
}
