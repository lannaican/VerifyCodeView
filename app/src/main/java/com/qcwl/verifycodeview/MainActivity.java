package com.qcwl.verifycodeview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.star.view.VerificationCodeView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VerificationCodeView codeView = findViewById(R.id.codeView);
        codeView.setInputCompleteListener(new VerificationCodeView.InputCompleteListener() {
            @Override
            public void inputComplete() {
                Log.e("!1", "完成");
            }

            @Override
            public void deleteContent() {
                Log.e("!1", "删除");
            }
        });
    }
}
