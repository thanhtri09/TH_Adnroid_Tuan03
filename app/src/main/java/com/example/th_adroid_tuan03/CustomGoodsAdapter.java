package com.example.th_adroid_tuan03;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter {
    Context ctx;
    int layoutItem;
    ArrayList<Goods> listGoods;

    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Goods> listGoods) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.listGoods = listGoods;
    }

    @Override
    public int getCount() {
        return listGoods.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(ctx).inflate(layoutItem,parent,false);
        TextView tvNAme = convertView.findViewById(R.id.txtNameItem);
        TextView tvShopName = convertView.findViewById(R.id.txtShopName);
        ImageView imgItem = convertView.findViewById(R.id.img_Item1);

        tvNAme.setText(listGoods.get(position).getName());
        tvShopName.setText(listGoods.get(position).getShopName());
        imgItem.setImageResource(listGoods.get(position).getImgItem());
        return convertView;
    }
}
