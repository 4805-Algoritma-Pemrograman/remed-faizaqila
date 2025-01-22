public class Nomor1{
     public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

       
        System.out.print("Masukkan total kilometer: ");
        int totalKm = scanner.nextInt();

       
        double taxiFare;

       
        if (totalKm <= 3) {
            taxiFare = 20000.0; 
        } else {
            taxiFare = 20000.0 + (totalKm - 3) * 10000.0; 
        }

       
        System.out.println("Total km: " + totalKm);
        System.out.println("Honor taksi: " + taxiFare);

        scanner.close();
    }
}
