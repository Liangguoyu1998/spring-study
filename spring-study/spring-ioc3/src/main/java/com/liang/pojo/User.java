package com.liang.pojo;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
public class User {
    private int id;
    private String name;
    public User(){
        System.out.println("这是User类的无参构造！");
    }
    public User(int id,String name){
        System.out.println("这是User类的有参构造！");
        this.id = id;
        this.name = name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
