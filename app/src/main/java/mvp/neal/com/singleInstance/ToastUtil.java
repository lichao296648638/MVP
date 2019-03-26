package mvp.neal.com.singleInstance;

import android.widget.Toast;

import mvp.neal.com.MyApplication;

public class ToastUtil {
    private final static ToastUtil INSTANCE = new ToastUtil();

    private ToastUtil() {
    }

    public static ToastUtil getInstance() {
        return INSTANCE;
    }

    public void showToast(String str) {
        Toast.makeText(MyApplication.getContext(), str, Toast.LENGTH_SHORT).show();
    }
}
