package fr.dev.koff.testysv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import fr.dev.koff.youtubesearchview.YoutubeSearchView;

public class MainActivity extends AppCompatActivity {

    YoutubeSearchView youtubeSearchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        youtubeSearchView = (YoutubeSearchView)findViewById(R.id.searchView);

        youtubeSearchView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                youtubeSearchView.LoadSearchresult(charSequence.toString(),
                        "AIzaSyAXSYq-75wtYyhXHIy_8R1BMGG0ZwkAi90");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        youtubeSearchView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                youtubeSearchView.setText(youtubeSearchView.getYoutube_link());
            }
        });
    }
}
