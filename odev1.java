class Phone {
    int id;
    String name;
    double price;
    String phoneNumber;

    public Phone() {
    }

    public Phone(int id, String name, double price, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.phoneNumber = phoneNumber;
    }
}

class SmartPhone extends Phone {
    int storage;
    int ram;
    int camera;

    public SmartPhone() {
    }

    public SmartPhone(int id, String name, double price, String phoneNumber, int storage, int ram, int camera) {
        super(id, name, price, phoneNumber);
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }
}

class PhoneApp {
    public static double calculateTotalPrice(SmartPhone[] smartPhoneArray) {
        double total = 0;
        for (SmartPhone phone : smartPhoneArray) {
            total += phone.price;
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        SmartPhone phone1 = new SmartPhone(1, "Samsung Galaxy S20", 1000.0, "123456789", 128, 6, 12);
        SmartPhone phone2 = new SmartPhone(2, "iPhone 12", 1200.0, "987654321", 256, 4, 12);
        SmartPhone phone3 = new SmartPhone(3, "OnePlus 9", 800.0, "555555555", 128, 8, 48);
        SmartPhone phone4 = new SmartPhone(4, "Xiaomi Mi 11", 900.0, "444444444", 256, 12, 108);
        SmartPhone phone5 = new SmartPhone(5, "Google Pixel 5", 700.0, "666666666", 128, 8, 12);

        SmartPhone[] phoneArray = { phone1, phone2, phone3, phone4, phone5 };

        double totalPrice = PhoneApp.calculateTotalPrice(phoneArray);
        System.out.println("Total price of smartphones: $" + totalPrice);
    }
}
