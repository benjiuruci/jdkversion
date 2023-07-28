package com.qin.jdk14;

/**
 * 测试新版 Instanceof
 * @author qinxianzhong
 * @since 2023/7/28 14:37:47
 */
public class InstanceofTest {
    public static void main(String[] args) {


        Girraffe girraffe = new Girraffe();
        girraffe.setName("111");
        testZooOld(girraffe);

    }

    /**
     * 使用instanceof模式匹配后，可以在同一表达式中进行类型检查和类型转换
     * @param animal
     */
    public static void testZooOld(Object animal){
        if (animal instanceof Girraffe girraffe ){
            System.out.println("girraffe:" + girraffe.getName());
        }else if (animal instanceof Hippo hippo) {
            System.out.println("hippo:" + hippo.getName());
        }
    }



}

class Girraffe{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Hippo{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
