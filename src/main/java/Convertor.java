import java.util.Scanner;

public class Convertor {
    public static String startingUnits(int n) {
        if (n == 1)
            return "Длина";
        else if (n == 2)
            return "Масса";
        else return "Отсутствует в списке";
    }

    public static String LengthUnit(int n) {
        if (n == 1)
            return "Верста";
        else if (n == 2)
            return "Сажень";
        else if (n == 3)
            return "Аршин";
        else if (n == 4)
            return "Локоть";
        else if (n == 5)
            return "Фут";
        else if (n == 6)
            return "Вершок";
        else return "Отсутствует в списке";
    }
    public static String lengthToMetre(int n, double value) {
        Scanner in = new Scanner(System.in);
        System.out.println(("Единица измерения для перевода в метры (введите цифру): " +
                "(1. Верста, 2. Сажень, 3. Аршин, 4. Локоть, 5. Фут, 6. Вершок)"));

        if (n == -1)
            n = in.nextInt();

        String unitsOfLength = LengthUnit(n);

        System.out.println("Значение для перевода в метры (введите число): ");
        if (value == -1)
            value = in.nextDouble();

        if (value < 0)
            return "Значение должно быть неотрицательным";
        else {
            switch (unitsOfLength){
                case "Верста":
                    return String.valueOf(value*1066);
                case "Сажень":
                    return String.valueOf(value*2.13);
                case "Аршин":
                    return String.valueOf(value*0.71);
                case "Локоть":
                    return String.valueOf(value*0.44);
                case "Фут":
                    return String.valueOf(value*0.3048);
                case "Вершок":
                    return String.valueOf(value*0.04);
                default:
                    return "Отсутствует в списке";
            }
        }
    }
}