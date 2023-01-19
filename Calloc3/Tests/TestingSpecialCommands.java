import org.junit.Assert;
import org.junit.Test;

public class TestingSpecialCommands {
    @Test
    public void fireTest() throws Exception{
        SpecialTimeFactory specialTimeFactory = new FireTimeFactory();
        Assert.assertEquals("Приступаем к тушению пожара ...", specialTimeFactory.getEmployee().work());
        Assert.assertEquals("Пожарная машина готова к работе ...", specialTimeFactory.getCar().drive());
        Assert.assertEquals("Пожарный инвентарь экипирован ...", specialTimeFactory.getSpecialEquipment().equipment());
    }

    @Test
    public void policeTest() throws Exception{
        SpecialTimeFactory specialTimeFactory = new PoliceTimeFactory();
        Assert.assertEquals("Полицейский готов к работе ...", specialTimeFactory.getEmployee().work());
        Assert.assertEquals("Полицейская машина готова к работе ...", specialTimeFactory.getCar().drive());
        Assert.assertEquals("Полицейский инвентарь экипирован ...", specialTimeFactory.getSpecialEquipment().equipment());
    }

    @Test
    public void medicalTest() throws Exception{
        SpecialTimeFactory specialTimeFactory = new MedicalTimeFactory();
        Assert.assertEquals("Доктор готов к работе ...", specialTimeFactory.getEmployee().work());
        Assert.assertEquals("Машина скорой помощи готова к работе ...", specialTimeFactory.getCar().drive());
        Assert.assertEquals("Медицинский инвентарь экипирован ...", specialTimeFactory.getSpecialEquipment().equipment());
    }
}
