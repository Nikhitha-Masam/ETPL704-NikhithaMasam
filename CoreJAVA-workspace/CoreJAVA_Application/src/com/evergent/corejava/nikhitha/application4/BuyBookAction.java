package com.evergent.corejava.nikhitha.application4;
public class BuyBookAction implements MenuAction {
    public final MainMenu mainMenu;

    public BuyBookAction(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
        System.out.println("BuyBookAction initialized with MainMenu reference");
    }

    @Override
    public void execute() {
        BookStore bookStore = new BookStore();
        bookStore.displayCategories();
    }
}