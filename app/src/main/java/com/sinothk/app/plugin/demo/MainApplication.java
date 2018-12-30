package com.sinothk.app.plugin.demo;

import android.app.Application;
import android.content.Context;

import com.didi.virtualapk.PluginManager;

/**
 * <pre>
 *  创建:  梁玉涛 2018/12/30 on 13:03
 *  项目:  AppPluginLib
 *  描述:
 *  更新:
 * <pre>
 */
public class MainApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        PluginManager.getInstance(base).init();
    }
}
