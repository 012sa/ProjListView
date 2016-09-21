package com.example.ifpb.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends Activity implements TextWatcher{
    EditText searchListView = (EditText) findViewById(R.id.searchListView);
    ListView listView = (ListView) findViewById(R.id.listView);
    ArrayList<CharSequence> arri = new ArrayList<CharSequence>();
    ArrayList<CharSequence> arra = new ArrayList<CharSequence>();

    arri.add("Arthur");
    arri.add("Adriell");
    arri.add("Diego");
    arri.add("Eddie");
    arri.add("Fanny");
    arri.add("Gabriels");
    arri.add("Henrique");
    arri.add("Jackeline");
    arri.add("Lívia");
    arri.add("Lorena");
    arri.add("Lucas");
    arri.add("Mateus");
    arri.add("Pedro");
    arri.add("Rayla");
    arri.add("Rebek");
    arri.add("Rosi");
    arri.add("Samuel");
    arri.add("Sarah");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        for (int i = 0; i < arri.size(); i++){
            for (int j = 0; j < arri.size(); j++){
                if(searchListView.getText().toString() == arri[i].charAt(j)){
                    arra.add(arri[i]);
                }
            }
        }

        ArrayAdapter adapti = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, arra);
        listView.setAdapter(adapti);

    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
