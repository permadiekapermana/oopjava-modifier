package oopjava;

public class User{

    public String username = "permadiekapermana";
    public String name = "Permadi";

    public void showName(){
        System.out.println("Halo, nama saya : "+name);
    }

    public void showUsername(){
        System.out.println("Halo, username saya : "+username);
    }

    public void changeName(String name){
        this.name = name;
    }

    public void importantNote(){
        System.out.println("Modifier public akan membuat member dan class bisa di akses dari mana saja.");
    }

}
