import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.println("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }*/
        Dimensions dimensions = new Dimensions(5, 6, 7);
        Cargoinfo cargoinfo = new Cargoinfo(dimensions,
                10, "тут",
                false, "10050ad",
                false);
        System.out.println(cargoinfo);
        Cargoinfo cargoinfocopy = cargoinfo.setDimensions(dimensions.setWidth(1).setHeight(2).setLength(3));
        System.out.println(cargoinfocopy);

        cargoinfocopy = cargoinfo.setWeight(56.9);
        System.out.println(cargoinfocopy);

        cargoinfocopy = cargoinfo.setAddress("Tam");
        System.out.println(cargoinfocopy);


    }
}
