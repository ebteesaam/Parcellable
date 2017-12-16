package com.example.ran.parcellable;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ebtesam on 12/12/2017 AD.
 */

public class ArrayListAdapter extends BaseAdapter{

    Context c;
    ArrayList<Student>st;

    public ArrayListAdapter(Context c, ArrayList<Student> st) {
        this.c = c;
        this.st = st;
    }

    @Override
    public int getCount() {
        return st.size();
    }

    @Override
    public Object getItem(int i) {
        return st.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup viewGroup) {
        View view= LayoutInflater.from(this.c).inflate(R.layout.item,viewGroup,false);
        TextView tv1=view.findViewById(R.id.tv1);
        TextView tv2=view.findViewById(R.id.tv2);

        tv1.setText(st.get(i).getName());
        tv2.setText(" "+st.get(i).getId());



        return view;
    }
}
