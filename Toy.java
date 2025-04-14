public class Toy {
    String name;
    String brand;
    double price;
    int quantity;

    

    public static void main(String[] args) {
        Toy toy1 = new Toy();
        Toy toy2 = new Toy();
        toy1.name ="Barbie";
        toy1.brand ="Mattel";
        toy1.price =1200;
        toy1.quantity=12;

        toy2.name ="Gel blaster";
        toy2.brand ="Armscore";
        toy2.price =999;
        toy2.quantity=8;

        toy1.price = 1500;
        System.out.println(toy1.price);
        System.out.println(toy2.price);
    }
}
