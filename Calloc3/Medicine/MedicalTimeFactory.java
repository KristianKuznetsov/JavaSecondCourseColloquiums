public class MedicalTimeFactory implements SpecialTimeFactory{
    @Override
    public Employee getEmployee() {
        return new Doctor();
    }

    @Override
    public Car getCar() {
        return new AmbulaneCar();
    }

    @Override
    public SpecialEquipment getSpecialEquipment() {
        return new MedicalTools();
    }
}
