package com.example.recview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv=(RecyclerView)findViewById(R.id.recview);
//        rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myadapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);

        //LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //rcv.setLayoutManager(layoutManager);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        rcv.setLayoutManager(gridLayoutManager);

    }

    public ArrayList<Model> dataqueue(){
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("C# programming");
        ob1.setDesc("Desktop Programming");
        ob1.setImgname(R.drawable.csharp);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("Python programming");
        ob2.setDesc("Data science Programming");
        ob2.setImgname(R.drawable.python);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("PHP programming");
        ob3.setDesc("Desktop Programming");
        ob3.setImgname(R.drawable.php);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("NodeJs programming");
        ob4.setDesc("Desktop Programming");
        ob4.setImgname(R.drawable.nodejs);
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setHeader("MySql programming");
        ob5.setDesc("Database Programming");
        ob5.setImgname(R.drawable.mysql);
        holder.add(ob5);

        Model ob6=new Model();
        ob6.setHeader("Javascript programming");
        ob6.setDesc("Desktop Programming");
        ob6.setImgname(R.drawable.javascript);
        holder.add(ob6);

        Model ob7=new Model();
        ob7.setHeader("Java programming");
        ob7.setDesc("Desktop Programming");
        ob7.setImgname(R.drawable.java);
        holder.add(ob7);

        Model ob8=new Model();
        ob8.setHeader("Flutter programming");
        ob8.setDesc("Mobile Programming");
        ob8.setImgname(R.drawable.flutter);
        holder.add(ob8);

        Model ob9=new Model();
        ob9.setHeader("Bootstrap programming");
        ob9.setDesc("Desktop Programming");
        ob9.setImgname(R.drawable.bootstrap);
        holder.add(ob9);

        Model ob10=new Model();
        ob10.setHeader("Bootstrap programming");
        ob10.setDesc("Desktop Programming");
        ob10.setImgname(R.drawable.swift);
        holder.add(ob10);



        return holder;
    }
}