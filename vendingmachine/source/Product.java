package source;

public enum Product {
    Coke(1,25), Pepsi(2,35), Soda(3,45);

    private int selectionNumber;
    private int price;

    Product(int selectionNumber, int price){
        this.selectionNumber = selectionNumber;
        this.price = price;
    }

    public int getSelectionNumber(){
        return selectionNumber;
    }

    public int getPrice(){
        return this.price;
    }

    public static Product valueOf(int numberSelection) {
        for (Product product : Product.values()) {
            if (numberSelection == product.getSelectionNumber()) {
                return product;
            }
        }

        return null;
    }
    }
