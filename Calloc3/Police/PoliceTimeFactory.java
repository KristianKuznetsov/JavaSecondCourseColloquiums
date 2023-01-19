public class PoliceTimeFactory implements SpecialTimeFactory{
    @Override
    public Employee getEmployee() {
        return new Policeman();
    }

    @Override
    public Car getCar() {
        return new PoliceCar();
    }

    @Override
    public SpecialEquipment getSpecialEquipment() {
        return new PoliceTools();
    }
}
