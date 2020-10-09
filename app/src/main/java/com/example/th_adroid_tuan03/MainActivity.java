package com.example.th_adroid_tuan03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGoods;
    CustomGoodsAdapter cusAdapter;
    ArrayList<Goods> listGoods;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvGoods = findViewById(R.id.lvGoods);

        listGoods = new ArrayList<>();
        listGoods.add(new Goods("Cá nấu lẩu","Shop Devang",R.drawable.ca_nau_lau));
        listGoods = new ArrayList<>();
        listGoods.add(new Goods("Cá nấu lẩu","Shop Devang",R.drawable.ca_nau_lau));
        listGoods.add(new Goods("Cá nấu lẩu","Shop Devang",R.drawable.ca_nau_lau));
        listGoods.add(new Goods("Cá nấu lẩu","Shop Devang",R.drawable.ca_nau_lau));
        listGoods.add(new Goods("Cá nấu lẩu","Shop Devang",R.drawable.ca_nau_lau));
        listGoods.add(new Goods("Cá nấu lẩu","Shop Devang",R.drawable.ca_nau_lau));
        listGoods.add(new Goods("Cá nấu lẩu","Shop Devang",R.drawable.ca_nau_lau));
        listGoods.add(new Goods("Cá nấu lẩu","Shop Devang",R.drawable.ca_nau_lau));
        listGoods.add(new Goods("Cá nấu lẩu","Shop Devang",R.drawable.ca_nau_lau));
        listGoods.add(new Goods("Cá nấu lẩu","Shop Devang",R.drawable.ca_nau_lau));
        listGoods.add(new Goods("Cá nấu lẩu","Shop Devang",R.drawable.ca_nau_lau));
        listGoods.add(new Goods("Cá nấu lẩu","Shop Devang",R.drawable.ca_nau_lau));
        listGoods.add(new Goods("Cá nấu lẩu","Shop Devang",R.drawable.ca_nau_lau));
        listGoods.add(new Goods("Cá nấu lẩu","Shop Devang",R.drawable.ca_nau_lau));

        cusAdapter = new CustomGoodsAdapter(this,R.layout.item_listview,listGoods);
        lvGoods.setAdapter(cusAdapter);
    }
}