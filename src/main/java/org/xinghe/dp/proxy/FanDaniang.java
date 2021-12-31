package org.xinghe.dp.proxy;

/**
 * do sth.
 *
 * @author 星河君❀❀ on 2021/12/31 - 5:00 下午
 * @see [相关类/方法]
 * @since [版本号]
 */
public class FanDaniang {

    public static void main(String[] args) {
        ISaleBooks lvQinghz = new LvQinghou();
        ISaleBooks guoFurong = new GuoFurong(lvQinghz);
        System.out.println("范大娘来谈出书……");
        guoFurong.publishBooks();
        System.out.println("范大娘来谈合同……");
        guoFurong.signContract();

    }
}
