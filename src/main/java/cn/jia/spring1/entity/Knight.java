package cn.jia.spring1.entity;

/**
 * Created by jia on 2018/3/26.
 */
public class Knight {
    private String name;
    public Knight(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                '}';
    }
}
