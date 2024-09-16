public class Main {
    public static void main(String[] args) {

        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Sınavdan A aldınız");
                break;
            case 'B':
            case 'C':
                System.out.println("Sınavdan geçtiniz");
                break;

            case 'D':
                System.out.println("Geçtiniz");
                break;

            case 'F':
                System.out.println("Malesef kaldınız");
                break;

            default:
                System.out.println("Geçersiz not girdiniz!");
        }


    }
}