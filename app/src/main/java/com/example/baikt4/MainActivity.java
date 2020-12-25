package com.example.baikt4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gvMonAn;
    ListView lvMonAn;
    ArrayList<MonAn> mangMonAn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvMonAn = (GridView) findViewById(R.id.gridviewMonAn);
        lvMonAn = (ListView) findViewById(R.id.listviewMonAn);
        mangMonAn = new ArrayList<MonAn>();

        mangMonAn.add(new MonAn("Bánh Mỳ","15000đ",R.drawable.a));
        mangMonAn.add(new MonAn("Bánh Mỳ","15000đ",R.drawable.b));
        mangMonAn.add(new MonAn("Bánh Mỳ","15000đ",R.drawable.c));
        mangMonAn.add(new MonAn("Bánh Mỳ","15000đ",R.drawable.d));
        mangMonAn.add(new MonAn("Bánh Mỳ","15000đ",R.drawable.e));
        mangMonAn.add(new MonAn("Bánh Mỳ","15000đ",R.drawable.f));
        mangMonAn.add(new MonAn("Bánh Mỳ","15000đ",R.drawable.g));
        mangMonAn.add(new MonAn("Bánh Mỳ","15000đ",R.drawable.h));
        mangMonAn.add(new MonAn("Bánh Mỳ","15000đ",R.drawable.m));
        mangMonAn.add(new MonAn("Bánh Mỳ","15000đ",R.drawable.n));

        MonAnAdapter anAdapter = new MonAnAdapter(
                MainActivity.this,
                R.layout.item_grid,
                mangMonAn
        );
        gvMonAn.setAdapter(anAdapter);

        MonAnAdapter anAdapter2 = new MonAnAdapter(
                MainActivity.this,
                R.layout.item_list,
                mangMonAn
        );
        lvMonAn.setAdapter(anAdapter2);
    }
}