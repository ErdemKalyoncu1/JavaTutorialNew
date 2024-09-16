public class Main {
    public static void main(String[] args) {
        String letter="";

        String upper= letter.toUpperCase();

        switch (upper){
            case "A":
            case "E":
            case "I":
            case "İ":
            case "O":
            case "Ö":
            case "U":
            case "Ü":
                System.out.println(letter+" Harfi bir SESLİ harftir!");
            break;
            default:
                System.out.println(letter+" Harfi bir SESSİZ harftir!");

        }
    }
}