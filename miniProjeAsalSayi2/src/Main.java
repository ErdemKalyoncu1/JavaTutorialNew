public class Main {
    public static void main(String[] args) {
        int number=2;
        boolean isPrime=true;

        if(number==1){
            System.out.println("Sayi Asal Değildir");
            return;
        }

        if(number<1){
            System.out.println("Geçersiz Sayi Girdiniz.");
            return;
        }

        for(int i=2;i<number;i++){
            if(number%i==0) {
                isPrime=false;
            }
        }

        if (isPrime){
            System.out.println(number+ " Sayisi Asaldır.");
        } else{
            System.out.println(number+ " Sayisi Asal Değildir.");
        }
    }
}