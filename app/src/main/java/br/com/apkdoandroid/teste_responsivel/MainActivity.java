package br.com.apkdoandroid.teste_responsivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //artigo
    //https://medium.com/@kamranramzan098/supporting-adjusting-text-size-on-different-screen-sizes-in-android-a6ea82a219f5

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}