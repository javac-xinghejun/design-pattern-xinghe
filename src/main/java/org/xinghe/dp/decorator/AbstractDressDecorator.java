package org.xinghe.dp.decorator;

/**
 * do sth.
 *
 * @author 星河君❀❀ on 2021/12/24 - 10:55 上午
 * @see [相关类/方法]
 * @since [版本号]
 */
public abstract class AbstractDressDecorator implements IDress{
    private IDress baiZhantang;

    public AbstractDressDecorator(IDress baiZhantang){
        this.baiZhantang = baiZhantang;
    }
    /**
     * 穿好衣服
     */
    @Override
    public void getDressed() {
        baiZhantang.getDressed();
    }
}
