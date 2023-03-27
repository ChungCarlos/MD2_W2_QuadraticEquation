import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a:");
        double properties1 = scanner.nextInt();
        System.out.println("Enter b:");
        double properties2 = scanner.nextInt();
        System.out.println("Enter c:");
        double properties3 = scanner.nextInt();

        QuadraticEquation quadraticEquation = new QuadraticEquation(properties1, properties2, properties3);
        quadraticEquation.diplay();
    }
}

class QuadraticEquation {
    private double properties1, properties2, properties3;
    private double nghiem1, nghiem2;

    public QuadraticEquation(double properties1, double properties2, double properties3) {
        this.properties1 = properties1;
        this.properties2 = properties2;
        this.properties3 = properties3;
    }

    public double getProperties1() {
        return properties1;
    }

    public double getProperties2() {
        return properties2;
    }

    public double getProperties3() {
        return properties3;
    }

    public double getDiscriminant() {
        return properties2 * properties2 - 4 * properties1 * properties3;
    }

    public double getN1() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return (-properties2 + Math.sqrt(getDiscriminant())) / (2 * properties1);
        }
    }

    public double getN2() {
        if (getDiscriminant() < 0) {
            return 0;
        } else {
            return (-properties2 - Math.sqrt(getDiscriminant())) / (2 * properties1);
        }
    }

    public void diplay() {
        if (getDiscriminant() < 0) {
            System.out.println("Phương trình không có nghiệm");
        } else if (getDiscriminant() == 0) {
            nghiem1 = nghiem2 = -properties2 / (2 * properties1);
            System.out.println("Phương trình có 1 nghiệm kép: " + nghiem1);
        } else {
            System.out.println("Phương trình có 2 nghiệm: "+ getN1() +" và " + getN2());
        }
    }
}
