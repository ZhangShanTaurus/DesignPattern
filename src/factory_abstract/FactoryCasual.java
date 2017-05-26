package factory_abstract;

/**
 * 生产休闲装的工厂
 * Created by zhangss on 2017/5/26.
 */
public class FactoryCasual implements IFactory {

    @Override
    public ICoat createCoat() {
        return new CoatCasual();
    }

    @Override
    public ITrousers createTrousers() {
        return new TrousersCasual();
    }
}
