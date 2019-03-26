package mvp.neal.com.http;


import mvp.neal.com.entity.UserEntity;

public class HttpUtil {

    public HttpUtil() {

    }

    public UserEntity getUserInfo(String uid) {
        UserEntity userEntity = new UserEntity();
        userEntity.setAge(18);
        userEntity.setName("小明");
        return userEntity;
    }


}
