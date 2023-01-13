package com.biniyam.personsarraylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Persons> personsArrayList = new ArrayList<Persons>();

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        personsArrayList.add(new Persons("malin",34,"mailin@mail.com"));
        personsArrayList.add(new Persons("moye",40,"moye@mail.com"));
        personsArrayList.add(new Persons("biye",345,"biye@mail.com"));
        personsArrayList.add(new Persons("sewyeye",12,"sewie@mail.com"));




        ArrayAdapter<Persons> arrayAdapter =
                new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, personsArrayList);

        listView.setAdapter(arrayAdapter);

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(MainActivity.this, PersonActivity.class );
                Persons persons = personsArrayList.get(position);

                intent.putExtra("NAME", persons.getName());
                intent.putExtra("AGE", persons.getAge());
                intent.putExtra("ADDRESS", persons.getAddress());



                startActivity(intent);


            }
        });








    }
}