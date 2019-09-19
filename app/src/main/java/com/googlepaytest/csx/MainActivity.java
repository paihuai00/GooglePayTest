package com.googlepaytest.csx;

import android.content.ComponentName;
import android.content.Intent;
import android.os.UserHandle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.googlepaytest.csx.github_google_pay.GitPayTestActivity;
import com.googlepaytest.csx.native_google_pay.NativePayTestActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_native, btn_git;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_native = findViewById(R.id.btn_native);
        btn_native.setOnClickListener(this);

        btn_git = findViewById(R.id.btn_git);
        btn_git.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = null;

        switch (v.getId()) {
            case R.id.btn_native:
                intent = new Intent(this, NativePayTestActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_git:
                intent = new Intent(this, GitPayTestActivity.class);
                startActivity(intent);
                break;
        }

    }

    @Override
    public synchronized ComponentName startForegroundServiceAsUser(Intent service, UserHandle user) {
        return null;
    }

}
