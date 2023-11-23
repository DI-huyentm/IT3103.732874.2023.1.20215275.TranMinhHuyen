package lab02.AimsProject;

public class Aims {
    public static void main(String[] args) {
        // Create a new cart
        Cart anOrder = new Cart();

        //Create new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation",
                "Director 3", 87, 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        // print number of dvd in cart
        System.out.println("Number of dvd is: ");
        System.out.println(DigitalVideoDisc.getNbDigitalVideoDisc());

        // Remove the dvd1
        anOrder.removeDigitalVideoDisc(dvd1);

        // print total cost of the items in the cart after removal
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());

    }
}
