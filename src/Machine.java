public abstract class Machine {
    private String modelName;
    private int productionYear;

    public Machine(String modelName, int productionYear) {
        this.modelName = modelName;
        setProductionYear(productionYear);
    }

    public String getModelName() {
        return modelName;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        if (productionYear >= 0) {
            this.productionYear = productionYear;
        } else {
            System.out.println("Год производства не может быть отрицательным.");
        }
    }

    public abstract void start();
}
