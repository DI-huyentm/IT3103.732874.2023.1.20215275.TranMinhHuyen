package lab02.AimsProject;

public class Cart {
    // Attribute
    private DigitalVideoDisc []itemsOrdered = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    private int qtyOrdered;

    public static final int MAX_NUMBER_ORDERED = 20;

    // Constructor
    public Cart() {
        setQtyOrdered(0);
    }

    // Setter and Getter
    public DigitalVideoDisc[] getItemsOrdered() {
        return itemsOrdered;
    }

    public void setItemsOrdered(DigitalVideoDisc[] itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        // If cart is full
        if (getQtyOrdered() >= 20) {
            System.out.println("The cart is almost full");
            return;
        }

        // Increase the qtyOrdered
        setQtyOrdered(getQtyOrdered() + 1);

        // Add to cart
        DigitalVideoDisc []newItemsOrdered = getItemsOrdered();
        newItemsOrdered[getQtyOrdered() - 1] = disc;
        setItemsOrdered(newItemsOrdered);

        // Notify
        System.out.println("The disc has been added");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        // If cart is full
        if (qtyOrdered + dvdList.length >20) {
            System.out.println("The cart ");
        }
    }


    // Method to remove a DVD
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        // Search for disc
        int indexOfRemoved = -1;
        DigitalVideoDisc []newItemsOrdered = getItemsOrdered();

        for (int i = 0; i < getQtyOrdered(); i++) {
            if (newItemsOrdered[i].equals(disc)){
                indexOfRemoved = i;
                break;
            }
        }

        // If not found
        if (indexOfRemoved == -1) {
            System.out.println("The disc is not found");
            return;
        }

        // Remove
        for (int i = indexOfRemoved; i < getQtyOrdered() - 1; i++) {
            newItemsOrdered[i] = newItemsOrdered[i+1];
        }
        setQtyOrdered(getQtyOrdered() - 1);
        newItemsOrdered[getQtyOrdered() - 1] = null;
        setItemsOrdered(newItemsOrdered);

        // Notify
        System.out.println("The disc has been removed");
    }

    // Method to calculate the total cost
    public double totalCost() {
        double cost = 0;
        DigitalVideoDisc []itemsOrdered = getItemsOrdered();

        for (DigitalVideoDisc disc: itemsOrdered) {
            if (disc != null) {
                cost += disc.getCost();
            }
        }
        return Math.round(cost * 100.0) / 100.0;
    }
}

// Branch refactor/apply-release-flow