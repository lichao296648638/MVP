package mvp.neal.com.mvp.presenter;

/**
 * BasePresenter类似于MVC中的BaseModel，主要负责业务逻辑的实现。
 * 我们这里没有把业务逻辑放在Model里去实现，当然把主要业务逻辑放在Model中去实现也是可以的。
 * google的MVP实现方案是把业务逻辑放在presenter中，弱化Model，我们这里也是这样做的。
 *
 *
 */
public interface BasePresenter {
    void onDestroy();
}