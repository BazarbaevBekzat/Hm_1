public class Car extends Machine{
    private int numberOfDoors;

    public Car(String modelName, int productionYear, int numberOfDoors) {
        super(modelName, productionYear);
        setNumberOfDoors(numberOfDoors);
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        if (numberOfDoors >= 0) {
            this.numberOfDoors = numberOfDoors;
        } else {
            System.out.println("Количество дверей не может быть отрицательным.");
        }
    }

    @Override
    public void start() {
        System.out.println("Заводим машину с ключом.");
    }
}
