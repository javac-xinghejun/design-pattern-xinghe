package org.xinghe.dp.decorator;

/**
 * do sth.
 *
 * @author 星河君❀❀ on 2021/12/24 - 10:54 上午
 * @see [相关类/方法]
 * @since [版本号]
 */
public class BaiZhantang implements IDress {

    /**
     * 穿好衣服
     */
    @Override
    public void getDressed() {
        System.out.println("我白展堂已经穿好衣服了！");
    }
}
