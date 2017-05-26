package factory_abstract;

/**
 * 抽象工厂
 * Created by zhangss on 2017/5/26.
 */
public interface IFactory {

    /**
     * 生产外套
     *
     * @return
     */
    ICoat createCoat();

    /**
     * 生产裤子
     *
     * @return
     */
    ITrousers createTrousers();
}
