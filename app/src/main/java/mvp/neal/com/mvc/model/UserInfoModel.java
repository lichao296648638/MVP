package mvp.neal.com.mvc.model;

import mvp.neal.com.entity.UserEntity;
import mvp.neal.com.callback.CallBack1;
import mvp.neal.com.http.HttpUtil;
import mvp.neal.com.singleInstance.ToastUtil;

public class UserInfoModel implements BaseModel {

    public void getUserInfo(String uid, CallBack1<UserEntity> callback) {

        UserEntity userEntity = new HttpUtil().getUserInfo(uid);
        callback.onCallBack(userEntity);

    }


    @Override
    public void onDestroy() {
        ToastUtil.getInstance().showToast("MVC销毁操作");
    }
}
