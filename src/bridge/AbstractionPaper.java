package bridge;

/**
 * 抽象化角色:纸
 * Created by zhangss on 2017/6/1.
 */
public abstract class AbstractionPaper {

    private IPaint paint;

    /**
     * 绘画
     */
    public void draw() {
        if (paint != null) {
            System.out.println("使用" + paint.getPaintName() + "在" + getPaperName() + "上绘画");
        }
    }

    /**
     * 获取纸的名字
     *
     * @return 纸的名字
     */
    public abstract String getPaperName();

    public void setImplementor(IPaint pen) {
        this.paint = pen;
    }
}
