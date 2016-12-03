package com.linky.offersystem.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.linky.offersystem.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linky on 16-11-27.
 */
public class ManagerActivity extends Activity {

    private Spinner mSpChannel;
    private List<String> list = new ArrayList<String>();
    private TextView myTextView;
    private Spinner mySpinner;
    private Spinner mSpCountry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage);

        mSpChannel = (Spinner) findViewById(R.id.sp_channel);

        // 建立数据源
        String[] mItems = getResources().getStringArray(R.array.channel);

        // 建立Adapter并且绑定数据源
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, mItems);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //绑定 Adapter到控件
        mSpChannel.setAdapter(adapter);
        mSpChannel.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {

                String[] languages = getResources().getStringArray(R.array.channel);
                Toast.makeText(ManagerActivity.this, "你点击的是:" + languages[pos], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

        mSpCountry = (Spinner) findViewById(R.id.sp_country);
        // 建立数据源
        String[] mCountrys = getResources().getStringArray(R.array.country);

        // 建立 Adapter 并且绑定数据源
        ArrayAdapter<String> countryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, mCountrys);
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //绑定 Adapter到控件
        mSpCountry.setAdapter(countryAdapter);
        mSpCountry.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {

                String[] languages = getResources().getStringArray(R.array.country);
                Toast.makeText(ManagerActivity.this, "你点击的是:" + languages[pos], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Another interface callback
            }
        });

    }
}
