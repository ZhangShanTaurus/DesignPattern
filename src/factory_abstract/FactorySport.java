package factory_abstract;

/**
 * 生产运动服装的工厂
 * Created by zhangss on 2017/5/26.
 */
public class FactorySport implements IFactory {

    @Override
    public ICoat createCoat() {
        return new CoatSport();
    }

    @Override
    public ITrousers createTrousers() {
        return new TrousersSport();
    }
}
