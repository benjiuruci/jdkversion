package com.qin.model.PrivateInterface;

/**
 * @author qinxianzhong
 * @since 2023/7/21 18:00:22
 */
public class main {

    public static void main(String[] args) {
            PrivateInterface privateInterface = new PrivateInterfaceImpl();

            System.out.println(privateInterface.addNum(1,2));
    }

}
