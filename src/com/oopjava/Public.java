package oopjava;

public class Public {
    public static void main(String[] args) {
        User user1 = new User();
        // nama pada class User dapat diakses public
        user1.showName();
        // username pada class User dapat diakses public
        user1.showUsername();
        System.out.println();

        // ubah nama
        user1.name = "Permadi Eka Permana";
        // nama bisa dirubah
        user1.showName();
        System.out.println();

        // ubah nama dengan constrctor
        user1.changeName("Permadi EP");
        user1.showName();

        // dapat bebas modifikasi write read pada public
        System.out.println("\nCatatan Penting mengenai Public :");
        user1.importantNote();
    }
}
