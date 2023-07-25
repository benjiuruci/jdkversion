package com.qin.model.privateInterface;

/**
 * @author qinxianzhong
 * @since 2023/7/21 18:00:22
 */
public class main {

    public static void main(String[] args) {
        PrivateInterfaceImpl privateInterfaceImpl = new PrivateInterfaceImpl();

        System.out.println(privateInterfaceImpl.add(1,2));

        System.out.println(privateInterfaceImpl.subtract(5,6));
    }

}
