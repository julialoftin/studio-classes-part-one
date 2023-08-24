package org.launchcode;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem Burger = new MenuItem(8.99, "an american classic", "entree", true);

        Menu PopUp = new Menu(new Date(), Burger);
        PopUp.addItem(Burger);
        System.out.println(PopUp.getLastUpdated());
        System.out.println(PopUp.getItems());
        System.out.println(Burger.getCategory());
        System.out.println(Burger.getDescription());
        System.out.println(Burger.getPrice());
        System.out.println(Burger.getNew());

    }
}
