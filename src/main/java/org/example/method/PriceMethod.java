package org.example.method;

import org.example.goods.Apple;
import org.example.goods.Mango;
import org.example.goods.Strawberry;

import java.math.BigDecimal;
import java.util.Scanner;

public class PriceMethod {

    public  void test01(){
        System.out.println("请输入苹果的重量（斤）");
        Scanner appleScanner= new Scanner(System.in);

        Integer appleMass = appleScanner.nextInt();
        if (appleMass<0){
            System.out.println("请输入正确的重量（重量应大于等于0）");
        }

        Apple apple = new Apple();
        apple.setMass(appleMass);

        System.out.println("请输入草莓的重量（斤）");
        Scanner strawberryScanner= new Scanner(System.in);
        Integer strawberryMass = strawberryScanner.nextInt();

        if (strawberryMass<0){
            System.out.println("请输入正确的重量（重量应大于等于0）");
        }
        Strawberry strawberry = new Strawberry();
        strawberry.setMass(strawberryMass);

        int totalPrice= (int) ((apple.getPrice()*apple.getMass())+(strawberry.getPrice()*strawberry.getMass()));
        System.out.println("A顾客购买的"+apple.getMass()+"斤苹果和"+strawberry.getMass()+"斤草莓的总价钱是"+totalPrice);

    }


    public  void test02(){
        System.out.println("请输入苹果的重量（斤）");
        Scanner appleScanner= new Scanner(System.in);

        Integer appleMass = appleScanner.nextInt();
        if (appleMass<0){
            System.out.println("请输入正确的重量（重量应大于等于0）");
        }

        Apple apple = new Apple();
        apple.setMass(appleMass);

        System.out.println("请输入草莓的重量（斤）");
        Scanner strawberryScanner= new Scanner(System.in);
        Integer strawberryMass = strawberryScanner.nextInt();

        if (strawberryMass<0){
            System.out.println("请输入正确的重量（重量应大于等于0）");
        }
        Strawberry strawberry = new Strawberry();
        strawberry.setMass(strawberryMass);

        System.out.println("请输入芒果的重量（斤）");
        Scanner MangoScanner= new Scanner(System.in);
        Integer MangoMass = MangoScanner.nextInt();

        if (MangoMass<0){
            System.out.println("请输入正确的重量（重量应大于等于0）");
        }
        Mango mango = new Mango();
        mango.setMass(MangoMass);

        float totalPrice= (apple.getPrice()*apple.getMass())+(strawberry.getPrice()*strawberry.getMass())+(mango.getPrice()*mango.getMass());
        System.out.println("B顾客购买的"+apple.getMass()+"斤苹果,"+strawberry.getMass()+"斤草莓和"+mango.getMass()+"斤芒果的总价钱是"+totalPrice);

    }


    public  void test03(){
        System.out.println("请输入苹果的重量（斤）");
        Scanner appleScanner= new Scanner(System.in);

        Integer appleMass = appleScanner.nextInt();
        if (appleMass<0){
            System.out.println("请输入正确的重量（重量应大于等于0）");
        }

        Apple apple = new Apple();
        apple.setMass(appleMass);

        System.out.println("请输入草莓的重量（斤）");
        Scanner strawberryScanner= new Scanner(System.in);
        Integer strawberryMass = strawberryScanner.nextInt();

        if (strawberryMass<0){
            System.out.println("请输入正确的重量（重量应大于等于0）");
        }
        Strawberry strawberry = new Strawberry();
        strawberry.setMass(strawberryMass);

        System.out.println("请输入芒果的重量（斤）");
        Scanner MangoScanner= new Scanner(System.in);
        Integer MangoMass = MangoScanner.nextInt();

        if (MangoMass<0){
            System.out.println("请输入正确的重量（重量应大于等于0）");
        }
        Mango mango = new Mango();
        mango.setMass(MangoMass);

        BigDecimal totalPrice= BigDecimal.valueOf((apple.getPrice()*apple.getMass())+(strawberry.getPrice()*strawberry.getMass())*0.8+(mango.getPrice()*mango.getMass()));
        System.out.println("C顾客购买的"+apple.getMass()+"斤苹果,"+strawberry.getMass()+"斤草莓和"+mango.getMass()+"斤芒果的总价钱是"+totalPrice);

    }


    public  void test04(){
        System.out.println("请输入苹果的重量（斤）");
        Scanner appleScanner= new Scanner(System.in);

        Integer appleMass = appleScanner.nextInt();
        if (appleMass<0){
            System.out.println("请输入正确的重量（重量应大于等于0）");
        }

        Apple apple = new Apple();
        apple.setMass(appleMass);

        System.out.println("请输入草莓的重量（斤）");
        Scanner strawberryScanner= new Scanner(System.in);
        Integer strawberryMass = strawberryScanner.nextInt();

        if (strawberryMass<0){
            System.out.println("请输入正确的重量（重量应大于等于0）");
        }
        Strawberry strawberry = new Strawberry();
        strawberry.setMass(strawberryMass);

        System.out.println("请输入芒果的重量（斤）");
        Scanner MangoScanner= new Scanner(System.in);
        Integer MangoMass = MangoScanner.nextInt();

        if (MangoMass<0){
            System.out.println("请输入正确的重量（重量应大于等于0）");
        }
        Mango mango = new Mango();
        mango.setMass(MangoMass);

        BigDecimal totalPrice= BigDecimal.valueOf((apple.getPrice()*apple.getMass())+(strawberry.getPrice()*strawberry.getMass())*0.8+(mango.getPrice()*mango.getMass()));
        BigDecimal decimal = new BigDecimal(100);
        BigDecimal decimal1 = new BigDecimal(10);
        if (totalPrice.compareTo(decimal)>=0){
            totalPrice=totalPrice.subtract(decimal1);
        }

        System.out.println("D顾客购买的"+apple.getMass()+"斤苹果,"+strawberry.getMass()+"斤草莓和"+mango.getMass()+"斤芒果的总价钱是"+totalPrice);

    }

}
