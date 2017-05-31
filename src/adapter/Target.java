package adapter;

/**
 * 目标接口，标准接口
 * Created by zhangss on 2017/5/31.
 */
public interface Target {

    /**
     * 需要水
     */
    void requestWater();

    /**
     * 需要空气
     */
    void requestAir();
}
