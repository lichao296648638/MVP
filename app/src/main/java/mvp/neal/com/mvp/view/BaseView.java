package mvp.neal.com.mvp.view;

import mvp.neal.com.mvp.presenter.BasePresenter;

/**
 * BaseView是所有View的父类，将android中的view抽象出来，只有跟view相关的操作都由baseView的实现类去完成。
 * @param <P>
 */
public interface BaseView<P extends BasePresenter> {
    void setPresenter(P presenter);
}
