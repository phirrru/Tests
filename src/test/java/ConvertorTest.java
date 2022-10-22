import org.testng.Assert;
import org.testng.annotations.Test;

public class ConvertorTest {
    Convertor convertor = new Convertor();

    @Test
    void test_startingUnits1() {
        String expected = convertor.startingUnits(1);
        Assert.assertEquals("Длина", expected);
    }

    @Test
    void test_startingUnits2() {
        String expected = convertor.startingUnits(2);
        Assert.assertEquals("Масса", expected);
    }

    @Test
    void test_Invalid_startingUnits() {
        String expected = convertor.startingUnits(86);
        Assert.assertEquals("Отсутствует в списке", expected);
    }

    @Test
    void test_unitsOfLength1() {
        String expected = convertor.LengthUnit(1);
        Assert.assertEquals("Верста", expected);
    }

    @Test
    void test_unitsOfLength2() {
        String expected = convertor.LengthUnit(2);
        Assert.assertEquals("Сажень", expected);
    }

    @Test
    void test_unitsOfLength3() {
        String expected = convertor.LengthUnit(3);
        Assert.assertEquals("Аршин", expected);
    }

    @Test
    void test_unitsOfLength4() {
        String expected = convertor.LengthUnit(4);
        Assert.assertEquals("Локоть", expected);
    }

    @Test
    void test_unitsOfLength5() {
        String expected = convertor.LengthUnit(5);
        Assert.assertEquals("Фут", expected);
    }

    @Test
    void test_unitsOfLength6() {
        String expected = convertor.LengthUnit(6);
        Assert.assertEquals("Вершок", expected);
    }
}
