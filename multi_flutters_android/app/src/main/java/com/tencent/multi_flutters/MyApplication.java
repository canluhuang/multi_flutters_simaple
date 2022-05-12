package com.tencent.multi_flutters;

import android.app.Application;
import io.flutter.embedding.engine.FlutterEngineGroup;

public class MyApplication extends Application {

   public FlutterEngineGroup engineGroup;

   @Override public void onCreate() {
      super.onCreate();
      engineGroup = new FlutterEngineGroup(this);
   }
}
