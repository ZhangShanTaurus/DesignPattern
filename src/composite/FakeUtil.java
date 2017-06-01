package composite;

import java.util.List;

/**
 * 制造假数据
 * Created by zhangss on 2017/6/1.
 */
public class FakeUtil {

    public static void addFakeData() {
        Composite china = new Composite("中国");
        Leaf beiJing = new Leaf("北京");
        Leaf tianJin = new Leaf("天津");
        Composite heBei = new Composite("河北");
        Composite heNan = new Composite("河南");
        Composite anHui = new Composite("安徽");

        china.add(beiJing);
        china.add(heBei);
        china.add(heNan);
        china.add(tianJin);
        china.add(anHui);

        Leaf hengShui = new Leaf("衡水");
        Leaf shiJiaZhuang = new Leaf("石家庄");
        Composite hanDan = new Composite("邯郸");
        heBei.add(hengShui);
        heBei.add(hanDan);
        heBei.add(shiJiaZhuang);

        Leaf wuHu = new Leaf("芜湖");
        Leaf huangShan = new Leaf("黄山");
        Composite heFei = new Composite("合肥");
        anHui.add(wuHu);
        anHui.add(huangShan);
        anHui.add(heFei);

        Leaf feiXiang = new Leaf("肥乡");
        Leaf guanTao = new Leaf("馆陶");
        hanDan.add(feiXiang);
        hanDan.add(guanTao);

        Leaf feiDong = new Leaf("肥东");
        Leaf feixi = new Leaf("肥西");
        heFei.add(feiDong);
        heFei.add(feixi);

        displayTree(china, 0);

        System.out.println("-------------移除合肥-------------");
        anHui.remove(heFei);

        displayTree(china, 0);

    }

    private static void displayTree(IComponent root, int line) {
        for (int i = 0; i < line; i++) {
            System.out.print("    ");
        }
        System.out.println(root.getName());
        if (root.getChildren() != null && !root.getChildren().isEmpty()) {
            List<IComponent> children = root.getChildren();
            for (IComponent c : children) {
                displayTree(c, line + 2);
            }
        }
    }
}
