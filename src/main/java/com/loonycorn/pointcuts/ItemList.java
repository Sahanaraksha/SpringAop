package com.loonycorn.pointcuts;

import java.util.List;

public class ItemList {

    List<Items> items;

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public void printNumItems() {

        System.out.println("\n*---- Method: ItemList.printNumItems() has been called ----*");
        System.out.println("There are " + items.size() + " items in total.");
    }

    public void displayItemList() {

        System.out.println("\n*---- Method: ItemList.displayItemList() is called ----*");

        String format = "|%1$-8s|%2$-16s|%3$-16s|%4$-16s|\n";
        System.out.println("-----------------------------------------------------------------");
        System.out.format(format, "ITEM ID", "ITEM NAME", "ITEM PRICE", "QUANTITY");
        System.out.println("-----------------------------------------------------------------");

        for(Items item : items) {
            System.out.format(format,
                    item.getItemId(), item.getItemName(),
                    item.getItemPrice(), item.getAvailableQuantity());
        }
        System.out.println("-----------------------------------------------------------------");
    }
    public void addItemToList(Items item){
        this.items.add(item);
    }

    public void addItemToListAtIndex(int index, Items item){
        this.items.add(index, item);
    }
}

