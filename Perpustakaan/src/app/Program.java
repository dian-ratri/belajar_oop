package app;
import app.data.Buku;
import java.util.HashMap;
public class Program{

    public static void main(String[] args) {
       /* Buku buku1 = new Buku();
        buku1.setJudulBuku("Harry Potter and The Deadly Hollow");
        System.out.println(buku1.getJudulBuku());
        */
        HashMap<String,Buku> lemariBuku = new HashMap<String,Buku>();
        lemariBuku.put("123-4-56-78912-0",new Buku("Harry Potter and Deadly Hollows","123-4-56-78912-0","J.K Rowling","Gramedia",452));
        lemariBuku.put("123-4-56-98711-0",new Buku("Harry Potter Order of The Phoenix","123-4-56-98711-0","J.K Rowling","Gramedia",452));

        //for eaach data buku lemari buku berdasarkan key
        int no = 1;
        for (String key : lemariBuku.keySet()){
            //get data buku satu per satu masukkan ke variabel

            String judul = lemariBuku.get(key).getJudulBuku();
            String isbn = lemariBuku.get(key).getISBN();
            String penulis = lemariBuku.get(key).getPenulis();
            String penerbit = lemariBuku.get(key).getPenerbit();
            int jmlHalaman = lemariBuku.get(key).getJmlHalaman();

            //print variable
            System.out.println("No         : "+no++);
            System.out.println("Judul      : "+judul);
            System.out.println("ISBN      : "+isbn);
            System.out.println("Penerbit   : "+penerbit);
            System.out.println("Penulis    : "+penulis);
            System.out.println("Jumlah Halaman   : "+jmlHalaman);
            System.out.println();

        }
        
    }
}