public class Main {
    public static void main(String[] args) {
        int sayi1=101;
        int sayi2=100;
        int sayi3=100;
        int enBuyuk=sayi1;
        //sadece > yaptığımda neden doğru sonucu veriyor iki sayı eşit olsa bile?

      /*  if(sayi1>sayi2 && sayi1>sayi3){
            System.out.println("En büyük sayi : "+sayi1);
        } else if (sayi2>sayi3 && sayi2>sayi1) {
            System.out.println("En büyük sayi : "+sayi2);


        }else{
            System.out.println("En büyük sayi : "+sayi3);

        }*/

        if (sayi2>enBuyuk){
            enBuyuk=sayi2;
        }

        else if (sayi3>enBuyuk) {
            enBuyuk=sayi3;
        }

        System.out.println("En büyük sayi: "+enBuyuk);

    }
}