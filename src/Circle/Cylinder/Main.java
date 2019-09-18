package Circle.Cylinder;

import Classes.Circle;
import Classes.Cylinder;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();
        double[] arraySquareCircle;
        double[] arrayVolumeCylinder;
        int index;
        double maxSquare;
        double averageVolume;
        maxSquare = 0;
        averageVolume = 0;
        index = 0;
        String message;
        String check;
        boolean flag;
        double radius = 0;
        double height = 0;
        final int quantityCirclesToCylinder;
        quantityCirclesToCylinder = 2;
        int quantity = 0;
        boolean isCorrect = false;
        while (!isCorrect) {
            System.out.print("Введите кол-во цилиндров:");
            Scanner in = new Scanner(System.in);
            check = in.nextLine();
            try {
                quantity = Integer.parseInt(check);
                isCorrect = true;
            } catch (IllegalArgumentException e) {
                System.out.print("Введены неверные данные, введите количество заново!\r\n");
                isCorrect = false;
            }
            if (isCorrect) {
                message = "Кол-во цилиндров:" + check + "\r\n" + "Кол-во окружностей:"
                        + Integer.toString(quantity * quantityCirclesToCylinder) + "\r\n";
                System.out.print(message);

            }
        }
        arraySquareCircle = new double[quantity];
        arrayVolumeCylinder = new double[quantity];
        System.out.print("Теперь введите высоту каждого цилиндра и радиус окружностей:");
        for (int i = 0; i < quantity; i++) {
            message = "\r\nРадиус цилиндра №" + Integer.toString(i + 1) + ":";
            System.out.print(message);
            Scanner in = new Scanner(System.in);
            flag = false;
            while (!flag) {
                check = in.nextLine();
                try {
                    radius = Double.parseDouble(check);
                    flag = true;
                } catch (IllegalArgumentException e) {
                    System.out.print("Введены неверные данные, попробуйте заново\r\n");
                    flag = false;
                }
            }
            message = "Высота цилиндра №" + Integer.toString(i + 1) + ":";
            System.out.print(message);
            flag = false;
            while (!flag) {
                check = in.nextLine();
                try {
                    height = Double.parseDouble(check);
                    flag = true;
                } catch (IllegalArgumentException e) {
                    System.out.print("Введены неверные данные, попробуйте заново\r\n");
                }
            }
            circle.setRadiusCircle(radius);
            cylinder.setHeight(height);
            cylinder.setRadiusCylinder(radius);

            message = "Площадь окружности:" + Double.toString(circle.getSquareCircle()) + "\r\nДлина окружности:"
                    + Double.toString(circle.getLenghtCircle()) + "\r\nПолная площадь цилиндра:"
                    + Double.toString(cylinder.getSquareCylinder()) + "\r\nПлощадь боковой стороны цилиндра:"
                    + Double.toString(cylinder.getSideSquareCylinder()) + "\r\nОбъем цилиндра:"
                    + Double.toString(cylinder.getVolumeCylinder());
            System.out.print(message);
            arraySquareCircle[i] = circle.getSquareCircle();
            arrayVolumeCylinder[i] = cylinder.getVolumeCylinder();
        }
        for (int i = 0; i < quantity; i++) {
            averageVolume += arrayVolumeCylinder[i];
            if (maxSquare < arraySquareCircle[i]) {
                maxSquare = arraySquareCircle[i];
                index = i + 1;
            }
        }
        averageVolume /= quantity;
        message = "\r\nМаксимальая площадь у окружности цилиндра №" + Integer.toString(index) + ":" + Double.toString(maxSquare)
                + "\r\nСредний объем цилиндров:" + Double.toString(averageVolume);
        System.out.print(message);
    }

}
