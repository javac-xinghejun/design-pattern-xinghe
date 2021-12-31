package org.xinghe.dp.decorator;

/**
 * do sth.
 *
 * @author 星河君❀❀ on 2021/12/31 - 2:55 下午
 * @see [相关类/方法]
 * @since [版本号]
 */
public class DecoratorClient {

    public static void main(String[] args) {
        IDress baiZhantang = new BaiZhangtang();

        IDress nightWalkingBaiZhantang = new NightWalkingDecorator(baiZhantang);
        nightWalkingBaiZhantang.getDressed();

        IDress bukuaiBaiZhantang = new BukuaiDecorator(baiZhantang);
        bukuaiBaiZhantang.getDressed();
    }
}
