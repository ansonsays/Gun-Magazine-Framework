import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in;
        int num;
        Bullet bullet;

        in = new Scanner(System.in);
        System.out.println("Maximum capacity of magazine?");
        num = in.nextInt();

        Magazine gunMag = new Magazine(num);
        System.out.println("Magazine created! ");
        while (true) {
            System.out.println("\n" + gunMag.toString());
            System.out.println("What would you like to do?");
            System.out.println("Input 1 to load Hollow Point bullet.");
            System.out.println("Input 2 to load Full Metal Jacket bullet.");
            System.out.println("Input 3 to unload bullet.");
            System.out.println("Input 4 to check magazine.");
            System.out.println("Input 5 to quit.");

            num = in.nextInt();

            if (num == 1) {
                bullet = new Bullet("Hollow Point bullet");
                gunMag.loadBullet(bullet);
            } else if (num == 2) {
                bullet = new Bullet("Full Metal Jacket bullet");
                gunMag.loadBullet(bullet);
            } else if (num == 3) {
                gunMag.unloadBullet();
            } else if (num == 4) {
                gunMag.toString();
            } else if (num == 5) {
                break;
            }
        }
    }
}