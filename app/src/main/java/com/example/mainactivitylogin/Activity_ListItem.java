package com.example.mainactivitylogin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class Activity_ListItem extends AppCompatActivity {
    List<Item> mListItem;
    ListView mlistView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listitem);

        Item sach = new Item("Sach", 10, 20000);
        Item but = new Item("But", 50, 3000);
        mListItem.add(sach);
        mListItem.add(but);

        mlistView = (ListView) findViewById(R.id.listitem);
        mlistView.setAdapter(new ItemAdapter(this, mListItem));


    }
}
