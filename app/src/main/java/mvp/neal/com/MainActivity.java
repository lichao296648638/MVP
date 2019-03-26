package mvp.neal.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mvp.neal.com.mvc.activity.UserInfoActivityMVC;
import mvp.neal.com.mvp.activity.UserInfoActivityMVP;
import mvp.neal.com.singleInstance.activity.ActivityA;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_design:
                startActivity(new Intent(MainActivity.this, ActivityA.class));
                break;
            case R.id.bt_mvc:
                startActivity(new Intent(MainActivity.this, UserInfoActivityMVC.class));
                break;
            case R.id.bt_mvp:
                startActivity(new Intent(MainActivity.this, UserInfoActivityMVP.class));
                break;
        }
    }
}
