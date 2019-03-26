package mvp.neal.com.singleInstance.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mvp.neal.com.R;
import mvp.neal.com.singleInstance.ToastUtil;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

    }

    void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_menu:
                ToastUtil.getInstance().showToast("页面B中的吐司");
                break;
        }
    }
}
