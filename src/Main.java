import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LCGRandom random = new LCGRandom();

        System.out.println("--------- Zar At ---------");
        boolean continuePlaying = true;
        while (continuePlaying) {
            System.out.println("1. Tek zar at");
            System.out.println("2. Çift zar at");
            System.out.println("3. Çıkış");
            System.out.println("--------------------------");
            System.out.print("Seçiniz: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int dice = random.nextInt(1, 6);
                    System.out.println("--------------------------");
                    System.out.println("Zar atıldı: " + dice);
                    System.out.println("--------------------------");
                    break;

                case 2:
                    int dice1 = random.nextInt(1, 6);
                    int dice2 = random.nextInt(1, 6);
                    System.out.println("--------------------------");
                    System.out.println("Birinci zar: " + dice1);
                    System.out.println("İkinci zar: " + dice2);
                    System.out.println("Toplam: " + (dice1 + dice2));
                    System.out.println("--------------------------");
                    break;

                case 3:
                    continuePlaying = false;
                    System.out.println("--------------------------");
                    System.out.println("Uygulamadan çıkılıyor...");
                    System.out.println("--------------------------");
                    break;
                default:
                    System.out.println("--------------------------");
                    System.out.println("Lütfen 1 ila 3 arasında bir sayı seçiniz.");
                    System.out.println("--------------------------");
            }
        }
        scanner.close();
    }
}