package mvp.neal.com.mvp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import mvp.neal.com.R;
import mvp.neal.com.callback.CallBack1;
import mvp.neal.com.entity.UserEntity;
import mvp.neal.com.mvc.model.UserInfoModel;
import mvp.neal.com.mvp.contract.UserInfoContract;
import mvp.neal.com.singleInstance.ToastUtil;

public class UserInfoActivityMVP extends AppCompatActivity implements UserInfoContract.View {
    private UserInfoContract.Presenter mUserPresenter;
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


        setPresenter(new UserInfoContract.Presenter());

    }

    void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_request:
                ToastUtil.getInstance().showToast("用户id：" + etID.getText().toString());
                mUserPresenter.getUserInfo(etID.getText().toString(), new CallBack1<UserEntity>() {
                    @Override
                    public void onCallBack(UserEntity userEntity) {
                        setDataToView(userEntity);
                    }
                });
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUserPresenter.onDestroy();
    }


    @Override
    public void setPresenter(UserInfoContract.Presenter presenter) {
        mUserPresenter = presenter;
    }

    @Override
    public void setDataToView(UserEntity userEntity) {
        tvAge.setText(userEntity.getAge() + "");
        tvName.setText(userEntity.getName());
    }
}
