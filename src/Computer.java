public class Computer implements Comparable<Computer>{
    private String brand, model;
    private int ram;
    private double price;

    public Computer(String brand, String model, int ram, double price) {
        setBrand(brand);
        setModel(model);
        setRam(ram);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.isEmpty())
            throw new IllegalArgumentException("brand cannot be empty");
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isEmpty())
            throw new IllegalArgumentException("model cannot be empty");
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram <0)
            throw new IllegalArgumentException("RAM must be greater than 0");
        else
            this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            throw new IllegalArgumentException("price must be >0");
    }

    @Override
    public String toString()
    {
        return String.format("%s %s with %d RAM is $%.2f",brand,model,
                                        ram, price);
    }

    @Override
    public int compareTo(Computer computer) {
        if (brand.equals(computer.getBrand())
                && model.equals(computer.getModel()))
            return 0;

        if (brand.compareTo(computer.getBrand()) == 0)
            return model.compareTo(computer.getModel());
        else
            return brand.compareTo(computer.getBrand());
    }
}
