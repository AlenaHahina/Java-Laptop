
public class Laptop {
    private String color;
    private String brand;
    private String operatingSystem;
    private int ram;
    private int hdd;
    
    
    public Laptop(String color, String brand, String operatingSystem, int ram, int hdd) {
        this.color = color;
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.hdd = hdd;
        
        
    }

    public String getColor() {
        return color;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public String getOperatingSystem() {
        return operatingSystem;
    }


    public int getRam() {
        return ram;
    }
     public int getHdd(){
        return hdd;
     }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

}
