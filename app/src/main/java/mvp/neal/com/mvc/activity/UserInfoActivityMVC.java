package mvp.neal.com.mvc.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mvp.neal.com.R;
import mvp.neal.com.entity.UserEntity;
import mvp.neal.com.callback.CallBack1;
import mvp.neal.com.mvc.model.UserInfoModel;
import mvp.neal.com.singleInstance.ToastUtil;

public class UserInfoActivityMVC extends AppCompatActivity {
    private UserInfoModel mUserModel;
    Button btRequest;
    EditText etID;
    TextView tvAge, tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        btRequest = (Button) findViewById(R.id.bt_request);
        etID = (EditText) findViewById(R.id.et_id);
        tvAge = (TextView) findViewById(R.id.tv_age);
        tvName = (TextView) findViewById(R.id.tv_name);
        mUserModel = new UserInfoModel();

    }

    void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_request:
                getUserInfo(etID.getText().toString());
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUserModel.onDestroy();
    }

    /**
     * 获取用户信息
     *
     * @param uid
     */
    private void getUserInfo(String uid) {
        ToastUtil.getInstance().showToast("用户id:" + uid);
        mUserModel.getUserInfo(uid, new CallBack1<UserEntity>() {
            @Override
            public void onCallBack(UserEntity userEntity) {
                setDataToView(userEntity);
            }
        });
    }

    /**
     * 设置用户信息到view
     */
    private void setDataToView(UserEntity userEntity) {
        tvAge.setText(userEntity.getAge()+"");
        tvName.setText(userEntity.getName());
    }
}
