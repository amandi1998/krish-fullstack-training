package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	// write your code here
        BookShop bs = new BookShop();
        bs.setShopName("Luminex");
        bs.loadData();
        bs.getBooks().remove(2);
        System.out.println(bs);



       // BookShop bs1 = new BookShop();
      //  BookShop bs1 = (BookShop)bs.clone();

        // deep clonning
        BookShop bs1 = bs.clone();
        bs1.setShopName("Sarasavi");
      //  bs1.loadData();
        System.out.println(bs1);
    }
}
