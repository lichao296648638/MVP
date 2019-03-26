package mvp.neal.com.mvp.contract;

import mvp.neal.com.callback.CallBack1;
import mvp.neal.com.entity.UserEntity;
import mvp.neal.com.http.HttpUtil;
import mvp.neal.com.mvp.presenter.BasePresenter;
import mvp.neal.com.mvp.view.BaseView;
import mvp.neal.com.singleInstance.ToastUtil;

/**
 * Contract 契约类这是Google MVP与其他实现方式的又一个不同，契约类用于定义同一个界面的view的接口和presenter的具体实现。
 * 好处是通过规范的方法命名和注释可以清晰的看到整个页面的逻辑。
 */
public class UserInfoContract {

    public static class Presenter implements BasePresenter {

        public void getUserInfo(String uid, CallBack1<UserEntity> callBack1) {
            UserEntity userEntity = new HttpUtil().getUserInfo(uid);
            callBack1.onCallBack(userEntity);

        }

        @Override
        public void onDestroy() {
            ToastUtil.getInstance().showToast("MVP销毁操作");
        }
    }

    public interface View extends BaseView<Presenter> {
        void setDataToView(UserEntity userEntity);
    }

}
