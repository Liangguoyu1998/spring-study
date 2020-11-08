package com.liang.pojo;

/**
 * @description:
 * @author:Lenovo
 * @date:2020-10-29 2020/10/29
 */
public class Hello {
    private String str;
    public Hello(){}
    public Hello(String str){
        this.str = str;
    }
    public void setStr(String str){
        this.str = str;
    }
    public String getStr(){
        return this.str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
