package com.example.lunger.view.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lunger.R;
import com.example.lunger.view.base.BaseActivity;
import com.example.lunger.view.event.MainEvent;

import de.greenrobot.event.EventBus;

/**
 * Created by Allen on 2017/04/01.
 * 测试EventBus
 */
public class SecondActivity extends BaseActivity {

    private EditText editText;
    private Button button_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText = (EditText) findViewById(R.id.et);
        button_send = (Button) findViewById(R.id.btn_send);
        button_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = editText.getText().toString();
                if (!TextUtils.isEmpty(msg)) {
                    MainEvent event = MainEvent.getInstance(MainEvent.TYPE_ONE);
                    event.setData(msg);
                    EventBus.getDefault().post(event);
                    finish();
                } else {
                    Toast.makeText(mContext, "请填写数据", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public void onEventMainThread(Object event) {

    }
}
