package org.xinghe.dp.proxy;

/**
 * do sth.
 *
 * @author 星河君❀❀ on 2021/12/31 - 4:56 下午
 * @see [相关类/方法]
 * @since [版本号]
 */
public class GuoFurong implements ISaleBooks {

    private ISaleBooks iSaleBooks;

    public GuoFurong(ISaleBooks iSaleBooks) {
        this.iSaleBooks = iSaleBooks;
    }

    /**
     * 出版书
     */
    @Override
    public void negotiatePublishingBooks() {
        proofreadTheManuscript();
        System.out.println("我是郭芙蓉，我帮吕轻侯洽谈出书事宜！");
        iSaleBooks.negotiatePublishingBooks();
    }

    /**
     * 签署合同
     */
    @Override
    public void signContract() {
        checkContractDetails();
        System.out.println("我是郭芙蓉，我帮吕轻侯敲定合同细节！");
        iSaleBooks.signContract();
    }

    private void proofreadTheManuscript() {
        System.out.println("我郭芙蓉负责校对书稿！");
    }

    private void checkContractDetails() {
        System.out.println("我郭芙蓉负责敲定合同细节！");
    }
}
