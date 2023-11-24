package lab03.AimsProject;

import lab02.AimsProject.Cart;
import lab02.AimsProject.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
        //Create a new cart
        lab02.AimsProject.Cart anOrder = new Cart();

        //Create new dvd objects and add them to the cart
        lab02.AimsProject.DigitalVideoDisc dvd1 = new lab02.AimsProject.DigitalVideoDisc("The Lion King",
                "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDigitalVideoDisc (dvd1);

        lab02.AimsProject.DigitalVideoDisc dvd2 = new lab02.AimsProject.DigitalVideoDisc("Star Wars",
                "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc (dvd2);

        lab02.AimsProject.DigitalVideoDisc dvd3 = new lab02.AimsProject.DigitalVideoDisc("Aladin",
                "Animation", 18.99f);
        anOrder.addDigitalVideoDisc (dvd3);

        //print number of dvd in cart
        System.out.println("Number of dvd is: ");
        System.out.println(DigitalVideoDisc.getNbDigitalVideoDiscs());

        //print id of dvd3
        System.out.println("Id of dvd3 is: ");
        System.out.println(dvd3.getId());
    }
}

//  topic/class-members