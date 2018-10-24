package com.websarva.wings.android.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Spinner spinner;
    private final String [] wineList = {"カベルネソーヴィニョン", "シラー","ピノノワール","マスカットベーリーA","ガメイ","メルロー","サンジョヴェーゼ","ネッビオーロ","テンプラニーリョ"};
    TextView wineTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.imageView);
        spinner = (Spinner)findViewById(R.id.spinner);
        wineTextView = (TextView)findViewById(R.id.wineTextView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                wineList
        );
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (position){

                    // {0:"カベルネソーヴィニョン", "シラー","ピノノワール","マスカットベーリーA","ガメイ","メルロー","サンジョヴェーゼ","ネッビオーロ","テンプラニーリョ"}
                    case 1:
                        imageView.setImageResource(R.drawable.syrah);
                        wineTextView.setText(R.string.det_cabernetsauvignon);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.pinotnoir);
                        wineTextView.setText(R.string.det_pinotnoir);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.muscatbailey_a);
                        wineTextView.setText(R.string.det_muscatbailey_a);
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.gamay);
                        wineTextView.setText(R.string.det_gamay);
                        break;
                    case 5:
                        imageView.setImageResource(R.drawable.merlot);
                        wineTextView.setText(R.string.det_merlot);
                        break;
                    case 6:
                        imageView.setImageResource(R.drawable.sangiovese);
                        wineTextView.setText(R.string.det_sangiovese);
                        break;
                    case 7:
                        imageView.setImageResource(R.drawable.nebbiolo);
                        wineTextView.setText(R.string.det_nebbiolo);
                        break;
                    case 8:
                        imageView.setImageResource(R.drawable.tempranillo);
                        wineTextView.setText(R.string.det_tempranillo);
                        break;
                    default:
                        imageView.setImageResource(R.drawable.cabernetsauvignon);
                        wineTextView.setText(R.string.det_cabernetsauvignon);
                        break;

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
