package app.data;
public class Member{
    private String IDMember;
    private String namaMember;

    abstract void meminjamBuku();

    void mengembalikanBuku(){
        System.out.println("Saya mengembalikan buku");
    }
}