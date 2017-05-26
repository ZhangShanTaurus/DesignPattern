package factory_abstract;

/**
 * 创建衣服的类
 * Created by zhangss on 2017/5/26.
 */
public class CreateClothes {

    /**
     * 裤子
     */
    private ITrousers trousers;

    /**
     * 外套
     */
    private ICoat coat;

    public CreateClothes(IFactory factory) {
        coat = factory.createCoat();
        trousers = factory.createTrousers();
    }

    /**
     * 打印衣服信息
     */
    public void printClothesInfo() {
        System.out.println("穿着:" + coat.getCoatType() + "," + trousers.getTrousersType());
    }
}
