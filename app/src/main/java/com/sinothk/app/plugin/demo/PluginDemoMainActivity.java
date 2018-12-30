package com.sinothk.app.plugin.demo;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.didi.virtualapk.PluginManager;

import java.io.File;

public class PluginDemoMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plugin_demo_activity_main);

        findViewById(R.id.downLoadApkBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pluginPath = Environment.getExternalStorageDirectory().getAbsolutePath().concat("/test1.apk");
                File plugin = new File(pluginPath);
                try {
                    PluginManager.getInstance(PluginDemoMainActivity.this).loadPlugin(plugin);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        findViewById(R.id.openBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Given "com.didi.virtualapk.demo" is the package name of plugin APK,
                // and there is an activity called `MainActivity`.
                try {
                    Intent intent = new Intent();
                    intent.setClassName("com.sinothk.plugin.demo1", "com.sinothk.plugin.demo1.MainActivity");
                    startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
    }
}
