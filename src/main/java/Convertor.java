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
    public static String WeightUnits(int n) {
        if (n == 1)
            return "Пуд";
        else if (n == 2)
            return "Фунт";
        else if (n == 3)
            return "Лот";
        else if (n == 4)
            return "Золотник";
        else if (n == 5)
            return "Доля";
        else return "Отсутствует в списке";
    }

    public static String weightToKg(int n, double value) {
        Scanner in = new Scanner(System.in);

        System.out.println(("Единица измерения для перевода в кг (введите цифру): " +
                "(1. Пуд, 2. Фунт, 3. Лот, 4. Золотник, 5. Доля)"));

        if (n == -1)
            n = in.nextInt();

        String unitsOfWeight = WeightUnits(n);

        System.out.println("Значение для перевода в кг (введите число): ");
        if (value == -1)
            value = in.nextDouble();
        if (value < 0)
            return "Значение должно быть неотрицательным";
        else {
            switch (unitsOfWeight){
                case "Пуд":
                    return String.valueOf(value*16.8);
                case "Фунт":
                    return String.valueOf(value*0.4);
                case "Лот":
                    return String.valueOf(value*0.0012);
                case "Золотник":
                    return String.valueOf(value*0.0004);
                case "Доля":
                    return String.valueOf(value*0.00000044);
                default:
                    return "Отсутствует в списке";
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Тип величины - 1. Длина, 2. Масса (введите цифру): ");
        int n = in.nextInt();

        String basicUnits = startingUnits(n);

        switch (basicUnits) {
            case "Длина":
                System.out.println(lengthToMetre(-1,-1));
            case "Масса":
                System.out.println(weightToKg(-1,-1));
        }
    }
}