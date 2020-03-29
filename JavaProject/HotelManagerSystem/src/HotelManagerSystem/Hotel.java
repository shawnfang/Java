package HotelManagerSystem;

import java.util.Scanner;
public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //seCustomer cs = new Customer(sc.next(),sc.next());
        Room[] rm = new Room[10];
        for (int i = 0; i < rm.length; i++) {
            rm[i] = new Room();
            rm[i].status = true;
            rm[i].customer = new Customer();
            rm[i].roomNumber = i + 100;
        }
        while (true) {
            System.out.println("请输入你要的操作search/in/out");
            String str = sc.next();
            if (str.equals("search")) {
                System.out.println("请输入你要查询的房间号：");
                Integer roomNo = sc.nextInt();
                if( (roomNo >=10) || ( roomNo <= 0) ){
                    System.out.println("没有这个房间");
                }else {
                    rm[roomNo].searchRoom();
                }
            } else if (str.equals("in")) {
                System.out.println("请输入您要入住的房间：");
                Integer roomNo = sc.nextInt();
                rm[roomNo].inRoom();
            } else if (str.equals("out")) {
                System.out.println("请输入您要退房的房间号：");
                Integer roomNo = sc.nextInt();
                rm[roomNo].outRoom();
            }else if(str.equals("quite")){
                System.out.println("欢迎再次光临");
            }
            else {
                System.out.println("未知");
            }

        }
    }

}