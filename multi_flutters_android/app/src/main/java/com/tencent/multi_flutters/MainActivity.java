package com.tencent.multi_flutters;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    @Override protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.enter_flutter_btn).setOnClickListener(view -> {
            MainActivity.this.startActivity(new Intent(MainActivity.this, MultiFlutterActivity.class));
        });
    }
}
