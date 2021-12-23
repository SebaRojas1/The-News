package cl.ucn.disc.dsm.srojas.thenews;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import cl.ucn.disc.dsm.srojas.thenews.model.NewsAdapter;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listNews;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = (RecyclerView) findViewById(R.id.RecyclerId);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL
                , false));

        listNews = new ArrayList<String>();

        for (int i=0; i<50; i++) {
            listNews.add("Dato "+ i +"");
        }

        NewsAdapter adapter = new NewsAdapter(listNews);
        recycler.setAdapter(adapter);
    }
}