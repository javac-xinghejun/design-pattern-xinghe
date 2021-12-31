package org.xinghe.dp.decorator;

/**
 * do sth.
 *
 * @author 星河君❀❀ on 2021/12/24 - 10:56 上午
 * @see [相关类/方法]
 * @since [版本号]
 */
public class BukuaiDecorator extends AbstractDressDecorator{

    public BukuaiDecorator(IDress baiZhantang) {
        super(baiZhantang);
    }

    /**
     * 穿好衣服
     */
    @Override
    public void getDressed() {
        super.getDressed();
        doPlanKoudan();
    }

    private void doPlanKoudan(){
        System.out.println("现在开始执行口淡行动！因为口淡，所以找盐。");
    }
}
