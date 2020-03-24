package HotelManagerSystem;

import java.util.Scanner;
public class Hotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //seCustomer cs = new Customer(sc.next(),sc.next());
        Room[] rm = new Room[10];
        for (int i =0;i<rm.length;i++){
            rm[i] = new Room();
            rm[i].status =true;
            rm[i].customer = new Customer();
            rm[i].roomNumber = i+100;
        }

        String str = sc.next();
        if(str.equals("search")){
            Integer roomNo = sc.nextInt();
            rm[roomNo].searchRoom();
        }else if(str.equals("in")){
            Integer roomNo = sc.nextInt();
            rm[roomNo].inRoom();
        }else if(str.equals("out")){
            Integer roomNo = sc.nextInt();
            rm[roomNo].outRoom();
        }else {
            System.out.println("未知");
        }

    }
}
