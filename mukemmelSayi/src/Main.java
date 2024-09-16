public class Main {
    public static void main(String[] args) {
        //Kendisinden başka pozitif tam bölenlerinin toplamı kendisine eşit olan sayı

        int number=6;
        int pozitifBolenToplami=0;

        if(number<6){
            System.out.println("6 den küçük sayıllar mükemmel sayılar değildir");
            return;
        }

        for(int i=1;i<number;i++){
            if (number %i==0){
                pozitifBolenToplami+=i;
            }
        }

        if(pozitifBolenToplami==number){
            System.out.println(number+" sayisi Mukemmel sayidir!");
        }else{
            System.out.println(number+" sayisi Mukemmel sayi değildir!");

        }
    }
}