package com.company;

public class Main {

    public static void main(String[] args) {
        //需求：根据指定月份，打印该月份所属季节
        //3,4,5为春季，6,7,8为夏季，9,10,11为秋季，11,12,1为冬季
        int x = 4;
        switch(x)
        {
            case 3:
            case 4:
            case 5:
                System.out.println(x+"春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(x+"夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(x+"秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(x+"冬季");
                break;
            default:
                System.out.println("no");

        }

    }
}
