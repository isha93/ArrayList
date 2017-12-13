/**
 * Created by nayanda on 11/12/17.
 */
public class Main {
    private Main(){};

    public static void main(String[] args){

        List<String> doto = new ListArray<String>();

        doto.add("string pertama");
        doto.add("string kedua");
        doto.add("string ketiga");
//        doto.add("string 4");

        System.out.println("isi dari arraylist index pertama adalah = " + doto.get(0));
        System.out.println("isi dari arraylist index kedua adalah = " + doto.get(1));
        System.out.println("isi dari arraylist index ketiga adalah = " + doto.get(2));
//        System.out.println("isi dari arraylist index 4 adalah = " + doto.get(3));
        doto.pop(1);

        System.out.println("panjang dari arraylist sekarang = " + doto.size());
        System.out.println("isi dari arraylist index pertama adalah = " + doto.get(0));
        System.out.println("isi dari arraylist index kedua adalah = " + doto.get(1));

        doto.clear();
        System.out.println("panjang dari arraylis sekarang = " + doto.size());

    }
}
