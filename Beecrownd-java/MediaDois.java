import java.util.Scanner;

public class MediaDois {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Double A = Double.parseDouble(sc.nextLine());
    Double B = Double.parseDouble(sc.nextLine());
    Double C = Double.parseDouble(sc.nextLine());

    Double media = ((A * 2) + (B * 3) + (C * 5))/(2 + 3 + 5);

    System.out.printf("MEDIA =%.1f", media);
}
}
