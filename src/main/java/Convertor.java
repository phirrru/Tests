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
}