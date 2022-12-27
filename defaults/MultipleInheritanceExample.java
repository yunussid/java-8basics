package com.example.defaults;

public class MultipleInheritanceExample implements InterfaceA,InterfaceB,InterfaceC {
    public static void main(String[] args) {
        MultipleInheritanceExample multipleInheritanceExample=new MultipleInheritanceExample();
        multipleInheritanceExample.sumA(4,8);
        multipleInheritanceExample.sumB(2,4);
        multipleInheritanceExample.sumC(1,2);
    }
    public void sumA(int num1,int num2){
        System.out.println("MultipleInheritanceexample.sumA"+(num1+num2));
    }
}
