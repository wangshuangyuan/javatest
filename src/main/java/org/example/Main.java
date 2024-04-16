package org.example;


import org.example.method.PriceMethod;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PriceMethod priceMethod = new PriceMethod();
        Scanner chooseScanner = new Scanner(System.in);

        System.out.println("请选择要计算的题目：");

        System.out.println("1、有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。\n" +
                "现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？\n");

        System.out.println("2、超市增加了一种水果芒果，其定价为 20 元/斤。\n" +
                "现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？\n");

        System.out.println("3、超市做促销活动，草莓限时打 8 折。\n" +
                "现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？\n");

        System.out.println("4、促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。\n" +
                "现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？\n");

        Integer testNum = chooseScanner.nextInt();
        if(testNum>=0){
            System.out.println("\n");
            switch (testNum){
                case  1 :
                    System.out.println("第一题");
                    priceMethod.test01();
                    break;
                case  2 :
                    System.out.println("第二题");
                    priceMethod.test02();
                    break;
                case  3 :
                    System.out.println("第三题");
                    priceMethod.test03();
                    break;
                case  4 :
                    System.out.println("第四题");
                    priceMethod.test04();
                    break;
            }
        }else {
            System.out.println("输入的重量有误，请重新开始");
        }


    }

}