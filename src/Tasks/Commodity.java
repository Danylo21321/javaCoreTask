package Tasks;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Commodity {
    public static List<Commodity> list = new ArrayList<>();


    private String nameModel;
    private int sum;
    private int serialNumber;

    public void Comparator(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            String forSwitch = scanner.next();
            switch (forSwitch) {
                case ("1") -> {
                    System.out.println("enter parametr add");
                    String name = scanner.next();
                    int sum = scanner.nextInt();
                    int serialNumber = scanner.nextInt();
                    AddToList(name, sum, serialNumber);
                }
                case ("2") -> {
                    System.out.println("enter parametr remove");
                    int remove = scanner.nextInt();
                    RemoveWithList(remove);
                }
                case ("3") -> {
                    System.out.println("enter parametr switch");
                    int removeIndex = scanner.nextInt();
                    RemoveWithList(removeIndex);
                    String nameSwitch = scanner.next();
                    int sumSwitch = scanner.nextInt();
                    int serialNumberSwitch = scanner.nextInt();
                    AddToList(nameSwitch, sumSwitch, serialNumberSwitch);
                }
                case ("4") -> {
                    SortWithSum();
                    System.out.println("sorted by sum");
                }
                case ("5") -> {
                    SortedWithSerialNumber();
                    System.out.println("sorted by serial number");
                }
                case ("6") -> {
                    System.out.println("you exit");
                    System.exit(0);
                }
                default -> System.out.println("incorrect answer");
            }
        }
    }

    private static void AddToList(String nameModel, int sum, int serialNumber){
        Realize realize = () -> {
            list.add(new Commodity(nameModel, sum, serialNumber));
            list.forEach(System.out::println);
        };
        realize.operationWithList();
    }

    private static void RemoveWithList(int removeIndex){
        Realize realize1 = () -> {
            list.remove(removeIndex);
            list.forEach(System.out::println);
        };
        realize1.operationWithList();
    }


    private static void SortWithSum(){
        Realize realizeSort = () -> list.stream()
                .sorted(Comparator.comparingInt(Commodity::getSum))
                .forEach(System.out::println);
        realizeSort.operationWithList();
    }

    private static void SortedWithSerialNumber(){
        Realize realizeSortSerialNumber = () -> list.stream()
                .sorted(Comparator.comparingInt(Commodity::getSerialNumber))
                .forEach(System.out::println);
        realizeSortSerialNumber.operationWithList();
    }


}
