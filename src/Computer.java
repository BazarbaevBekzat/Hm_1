public final class Computer {
    private String brand;
    private double cpuSpeed;

    public Computer(String brand, double cpuSpeed) {
        this.brand = brand;
        setCpuSpeed(cpuSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }

    public void setCpuSpeed(double cpuSpeed) {
        if (cpuSpeed >= 0) {
            this.cpuSpeed = cpuSpeed;
        } else {
            System.out.println("Скорость процессора не может быть отрицательной.");
        }
    }

    public void boot() {
        System.out.println("Загружаем операционную систему.");
    }
}
