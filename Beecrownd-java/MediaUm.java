import java.util.Scanner;

public class MediaUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double A = Double.parseDouble(sc.nextLine());
        Double B = Double.parseDouble(sc.nextLine());

        Double media = ((A * 3.5) + (B * 7.5))/(3.5 + 7.5);

        System.out.printf("MEDIA =%.5f", media);
    }
}
