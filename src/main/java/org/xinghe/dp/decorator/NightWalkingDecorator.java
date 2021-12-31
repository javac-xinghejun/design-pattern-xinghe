package org.xinghe.dp.decorator;

/**
 * do sth.
 *
 * @author 星河君❀❀ on 2021/12/24 - 11:12 上午
 * @see [相关类/方法]
 * @since [版本号]
 */
public class NightWalkingDecorator extends AbstractDressDecorator {

    public NightWalkingDecorator(IDress baiZhantang) {
        super(baiZhantang);
    }

    /**
     * 穿好衣服
     */
    @Override
    public void getDressed() {
        super.getDressed();
        steal();
    }

    private void steal() {
        System.out.println("盗圣重出江湖啦！");
    }
}
