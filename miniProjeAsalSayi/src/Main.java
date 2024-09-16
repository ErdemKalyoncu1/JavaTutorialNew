import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        int number = 3;
        boolean found=false; //reminder yani mod sonucunda 0 var mı yok mu ? bilgisini tutan değişken

        //1 i ve sayinin kendisini dizi den çıkardık
        int[] array = new int[number - 2];


        for (int i = 2; i < number; i++) {
            int remainder = number % i;
            array[i - 2] = remainder;
            //dizinin boyutu number ın 2 eksiği kadar

        }
        for(int value:array){
            if(value==0){
                found=true;
            }

        }
        if(found) {
            System.out.println(number +" sayisi ASAL SAYI DEĞİLDİR");
        }else{
            System.out.println(number +" sayisi ASAL SAYIDIR");
        }
    }
}




