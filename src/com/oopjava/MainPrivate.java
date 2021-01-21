package oopjava;

public class MainPrivate {
    public static void main(String[] args) {
        UserPrivate user1 = new UserPrivate();

        // error, field name tidak visible sehingga tidak dapat write data
        // user1.name = "Permadi";
        user1.setName("Permadi Eka Permana");
        // nama berhasil di write
        user1.getName();
        // nama berhasil di read
        System.out.println("Nama Saya adalah : "+user1.getName());
    }
}
