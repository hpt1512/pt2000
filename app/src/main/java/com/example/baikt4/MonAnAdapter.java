package com.example.baikt4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MonAnAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<MonAn> arrayMonAn;

    public MonAnAdapter(Context myContext, int myLayout, List<MonAn> arrayMonAn) {
        this.myContext = myContext;
        this.myLayout = myLayout;
        this.arrayMonAn = arrayMonAn;
    }

    @Override
    public int getCount() {
        return arrayMonAn.size();
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
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(myLayout, null);

        TextView txtTen = (TextView) convertView.findViewById(R.id.textViewTen);
        txtTen.setText(arrayMonAn.get(position).ten);
        TextView txtGia = (TextView) convertView.findViewById(R.id.textViewGia);
        txtGia.setText(arrayMonAn.get(position).gia);
        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.imageviewHinh);
        imgHinh.setImageResource(arrayMonAn.get(position).hinh);
        return convertView;
    }
}
