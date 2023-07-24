package com.qin.model.PrivateInterface;

/**
 * 测试私有接口
 * @author qinxianzhong
 * @since 2023/7/21 17:54:02
 */
public interface PrivateInterface {



    default int addNum(int i, int j){
        return i+addOne(j);
    }



    default int subtract(int i, int j) {

        return addNum(i,addOne(j));
    }


    /**
     * 私有方法
     * @param num
     * @return
     */
    private int addOne(int num){

        return num + 1;
    }

}
