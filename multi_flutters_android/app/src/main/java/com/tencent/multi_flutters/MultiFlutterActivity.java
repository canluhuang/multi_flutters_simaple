package com.tencent.multi_flutters;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;

public class MultiFlutterActivity extends FlutterActivity {

    @Nullable
    @Override
    public FlutterEngine provideFlutterEngine(@NonNull Context context) {
        MyApplication app = (MyApplication) getApplication();
        return app.engineGroup.createAndRunDefaultEngine(this);
    }
}
