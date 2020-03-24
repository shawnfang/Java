package HotelManagerSystem;

import java.util.Scanner;

public class Room {
    public Integer roomNumber;
    public Customer customer;
    public boolean status;

    public  Room(){
    }
    public Room(Integer roomNumber,Customer customer){
        this.roomNumber = roomNumber;
        this.customer = customer;
    }

    static Scanner sc= new Scanner(System.in);
    public void searchRoom(){
        while (status){
            System.out.println("暂时没有人入住");
        }
        System.out.println("该房间不是空房");
        System.out.println("房间已被："+ customer.name+" 入住");
    }

    public void inRoom(){
        while (true){
            if(status){
                System.out.println("请输入姓名：");
                customer.name = sc.next();
                System.out.println("请输入身份ID");
                customer.customerId = sc.next();
                status = false;
                System.out.println("已入住成功");
            }else {
                System.out.println("房间无法入住");
            }
        }
    }

    public void outRoom(){
        while (true){
            if (status){
                System.out.println("房间未被人入住");
            }else {
                customer.customerId = "";
                customer.name = "";
                status = true;
                System.out.println("已退房");
            }
        }
    }
}
