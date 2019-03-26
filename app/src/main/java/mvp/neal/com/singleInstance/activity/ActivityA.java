package mvp.neal.com.singleInstance.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mvp.neal.com.R;
import mvp.neal.com.singleInstance.ToastUtil;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_menu:
                ToastUtil.getInstance().showToast("页面A中的吐司");
                break;

            case R.id.bt_activityB:
                startActivity(new Intent(ActivityA.this, ActivityB.class));
                break;
        }
    }
}
