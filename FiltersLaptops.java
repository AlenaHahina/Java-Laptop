
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

    
public class FiltersLaptops {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        
        laptops.add(new Laptop("black", "Samsung", "Windows", 8, 256));
        laptops.add(new Laptop("black", "ASUS", "Windows", 16, 512));
        laptops.add(new Laptop("silver","Acer", "Windows", 8, 128));
        laptops.add(new Laptop("black", "ASUS VivoBook", "Windows", 8, 128));
        laptops.add(new Laptop("golden", "Apple MacBook", "MacOS", 16, 256));
        laptops.add(new Laptop("red", "Apple MacBook Pro", "MacOS", 8, 256));


        filterLaptops(laptops);
    }


    public static void filterLaptops(Set<Laptop> laptops) {
        Map<Integer, Object> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Какой критерий хотите применить?:");
        System.out.println("1 - Цвет");;
        System.out.println("2 - Операционная система");
        System.out.println("3 - Объем оперативной памяти");
        System.out.println("4 - Объем жесткого диска");
        
        int filter = scanner.nextInt();
        
        
        switch (filter) {
            case 1:
                System.out.println("Введите цвет:");
                String color = scanner.next();
                filters.put(1, color);
                break;
            case 2:
                System.out.println("Введите операционную систему:");
                String operatingSystem = scanner.next();
                filters.put(2, operatingSystem);
                break;
            case 3:
                System.out.println("Введите объем оперативной памяти (ОЗУ):");
                int ram = scanner.nextInt();
                filters.put(3, ram);
                break;
            case 4:
                System.out.println("Введите объем жесткого диска:");
                int hdd = scanner.nextInt();
                filters.put(4, hdd);
                break;
            default:
                System.out.println("Такого критерия нет.");
                
        }
        

        for (Laptop laptop : laptops) {
            boolean skipFilter = true;

            for (Map.Entry<Integer, Object> entry : filters.entrySet()) {
                int criterion = entry.getKey();
                Object value = entry.getValue();

                switch (criterion) {
                    case 1:
                        String laptopColor = laptop.getColor();
                        if (!laptopColor.equalsIgnoreCase((String) value)) {
                            skipFilter = false;
                        }
                        break;                      
                    case 2:
                        String laptopOS = laptop.getOperatingSystem();
                        if (!laptopOS.equalsIgnoreCase((String) value)) {
                            skipFilter = false;
                        }
                        break;
                    case 3:
                        int laptopRam = laptop.getRam();
                        if (laptopRam < (int)value) {
                            skipFilter = false;
                        }
                    break;
                    case 4:
                        int laptopHdd = laptop.getHdd();
                        if (laptopHdd < (int) value) {
                            skipFilter = false;
                        }
                        break;
                }

                if (!skipFilter) {
                    break;
                }
            }

            if (skipFilter) {
                System.out.println("По вашему критерию найден: " + laptop.getBrand());
            }
            scanner.close(); 
        }
        
    }
   
}

