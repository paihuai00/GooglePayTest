package com.googlepaytest.csx;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.UserHandle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import com.googlepaytest.csx.github_google_pay.GitPayTestActivity;
import com.googlepaytest.csx.native_google_pay.NativePayTestActivity;
import okhttp3.OkHttpClient;

import static android.webkit.WebViewZygote.getPackageName;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_native, btn_git;
    TextView tv_app_vs_code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_native = findViewById(R.id.btn_native);
        btn_native.setOnClickListener(this);

        btn_git = findViewById(R.id.btn_git);
        btn_git.setOnClickListener(this);

        tv_app_vs_code = findViewById(R.id.tv_app_vs_code);

        //获取版本号
        try {
            PackageManager packageManager=getPackageManager();
            PackageInfo packageInfo= null;
            packageInfo = packageManager.getPackageInfo(getPackageName(),PackageManager.GET_CONFIGURATIONS);

            tv_app_vs_code.setText("App版本code = " + packageInfo.versionCode);

        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        initData();
    }

    private void initData(){

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
