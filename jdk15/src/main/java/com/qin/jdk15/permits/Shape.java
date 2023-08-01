package com.qin.jdk15.permits;

/**
 * sealed关键字表示该类是一个密封类
 * 不能被其他的类继承
 * 只能 permits关键字声明的类才可以
 *
 * 不能用于interface
 * @author qinxianzhong
 * @since 2023/7/28 15:57:49
 */
public sealed class Shape permits Circle, Square {

    private String colour;

    private double weight;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "colour='" + colour + '\'' +
                ", weight=" + weight +
                '}';
    }
}
