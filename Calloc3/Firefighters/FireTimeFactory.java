public class FireTimeFactory implements SpecialTimeFactory{
    @Override
    public Employee getEmployee() {
        return new Firefighter();
    }

    @Override
    public Car getCar() {
        return new FireEngine();
    }

    @Override
    public SpecialEquipment getSpecialEquipment() {
        return new FireTools();
    }
}
