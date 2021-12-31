package org.xinghe.dp.proxy;

/**
 * do sth.
 *
 * @author 星河君❀❀ on 2021/12/31 - 4:56 下午
 * @see [相关类/方法]
 * @since [版本号]
 */
public class LvQinghou implements ISaleBooks{

    /**
     * 出版书
     */
    @Override
    public void publishBooks() {
        System.out.println("我是吕轻侯，我要出书！");
    }

    /**
     * 签署合同
     */
    @Override
    public void signContract() {
        System.out.println("我是吕轻侯，我要签合同卖书！");
    }
}
