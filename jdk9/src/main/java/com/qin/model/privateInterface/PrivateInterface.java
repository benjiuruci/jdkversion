package com.qin.model.privateInterface;

/**
 * 测试私有接口
 * @author qinxianzhong
 * @since 2023/7/21 17:54:02
 */
public interface PrivateInterface {


    default int add(int i, int j) {
        //调用私有方法
        printInfo();
        return i + j;
    }

    default int subtract(int i,int j){
        //调用私有方法
        printInfo();
        return i - j;
    }


    /**
     * 私有方法
     *
     * @return
     */
    private void printInfo(){
        System.out.println("调用打印！");
    }

}
