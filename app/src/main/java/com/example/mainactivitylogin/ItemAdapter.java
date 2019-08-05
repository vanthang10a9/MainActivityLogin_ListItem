package com.example.mainactivitylogin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    List<Item> listItem;
    private Context context;

    @Override
    public int getCount() {
        return 0;
    }

    public ItemAdapter(Context context, List<Item> listItem) {
        this.listItem = listItem;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = layoutInflater.inflate(R.layout.layout_item, null);
        }

        TextView mTextViewName = (TextView) view.findViewById(R.id.name);
        TextView mTextViewAmount = (TextView) view.findViewById(R.id.amount);
        TextView mTextViewPrice = (TextView) view.findViewById(R.id.price);

        Item item= listItem.get(i);
        mTextViewName.setText("Name: " + item.getName());
        mTextViewAmount.setText("Amount: " + item.getAmount());
        mTextViewPrice.setText("Price: " + item.getPrice());

        return view;
    }

}
