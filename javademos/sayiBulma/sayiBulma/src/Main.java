public class Main {

    public static void main(String[] args) {
        int[] sayilar = new int[]{2, 4, 6, 8, 11};
        int aranacak = 8;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            System.out.println("Sayi mevcuttur");
        } else {
            System.out.println("Sayi mevcut değildir");
        }


    }
}