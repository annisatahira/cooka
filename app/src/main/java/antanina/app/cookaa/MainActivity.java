package antanina.app.cookaa;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import antanina.app.cookaa.adapter.JfyAdapter;
import antanina.app.cookaa.model.modelJfy;

/**
 * Created by annisatahira on 06/01/19.
 */

public class MainActivity extends AppCompatActivity {

    RecyclerView lstJfymenu;
    LinearLayoutManager linear;

    List<modelJfy> jfys;
    JfyAdapter adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstJfymenu = findViewById(R.id.lst_jfy_menu);

        linear = new LinearLayoutManager(this);
        lstJfymenu.setLayoutManager(linear);

        jfys = new ArrayList<>();
        jfys.add(new modelJfy(R.drawable.rempah, "Rempah-Rempah"));
        jfys.add(new modelJfy(R.drawable.ic_bahan, "Bahan Masakan"));
        jfys.add(new modelJfy(R.drawable.ic_masak, "Tips Memasak"));

        adapter = new JfyAdapter(this, jfys);
        lstJfymenu.setAdapter(adapter);

    }
}
