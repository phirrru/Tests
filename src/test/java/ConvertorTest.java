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

    @Test
    void test_OneToM(){
        String expected = convertor.lengthToMetre(1,10);
        Assert.assertEquals("10660.0", expected);
    }

    @Test
    void test_TwoToM(){
        String expected = convertor.lengthToMetre(2,2);
        Assert.assertEquals("4.26", expected);
    }

    @Test
    void test_ZeroToM(){
        String expected = convertor.lengthToMetre(1,0);
        Assert.assertEquals("0.0", expected);
    }

    @Test
    void test_InvalidKmToM(){
        String expected = convertor.lengthToMetre(1,-10);
        Assert.assertEquals("Значение должно быть неотрицательным", expected);
    }

    @Test
    void test_InvalidUnitToM(){
        String expected = convertor.lengthToMetre(48,25);
        Assert.assertEquals("Отсутствует в списке", expected);
    }

    @Test
    void test_unitsOfWeight1(){
        String expected = convertor.WeightUnits(1);
        Assert.assertEquals("Пуд", expected);
    }

    @Test
    void test_unitsOfWeight2(){
        String expected = convertor.WeightUnits(2);
        Assert.assertEquals("Фунт", expected);
    }

    @Test
    void test_unitsOfWeight3(){
        String expected = convertor.WeightUnits(3);
        Assert.assertEquals("Лот", expected);
    }

    @Test
    void test_unitsOfWeight4(){
        String expected = convertor.WeightUnits(4);
        Assert.assertEquals("Золотник", expected);
    }

    @Test
    void test_unitsOfWeight5(){
        String expected = convertor.WeightUnits(5);
        Assert.assertEquals("Доля", expected);
    }

    @Test
    void test_OneToKg(){
        String expected = convertor.weightToKg(1,1.1);
        Assert.assertEquals("18.480000000000004", expected);
    }
    @Test
    void test_TwoToKg(){
        String expected = convertor.weightToKg(5,10000);
        Assert.assertEquals("0.0044", expected);
    }

    @Test
    void test_ZeroToKg(){
        String expected = convertor.weightToKg(1,0);
        Assert.assertEquals("0.0", expected);
    }

    @Test
    void test_InvalidTToKg(){
        String expected = convertor.weightToKg(1,-10);
        Assert.assertEquals("Значение должно быть неотрицательным", expected);
    }

    @Test
    void test_InvalidUnitToKg(){
        String expected = convertor.weightToKg(48,37);
        Assert.assertEquals("Отсутствует в списке", expected);
    }
}
