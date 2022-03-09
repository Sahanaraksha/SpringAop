package com.loonycorn;

import com.loonycorn.pointcuts.ItemList;
import com.loonycorn.pointcuts.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main5 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext6.xml");

        Items itemOne = (Items) context.getBean("itemBeanOne");
        Items itemTwo = (Items) context.getBean("itemBeanTwo");

        ItemList myList = (ItemList) context.getBean("listBean");

        Items itemThree = new Items();
        itemThree.setItemId(110);
        itemThree.setItemName("Butter");
        itemThree.setItemPrice(5.99f);
        itemThree.setAvailableQuantity(8);

        Items itemFour = new Items();
        itemFour.setItemId(113);
        itemFour.setItemName("Honey");
        itemFour.setItemPrice(7.00f);
        itemFour.setAvailableQuantity(4);

        myList.addItemToList(itemThree);
        myList.addItemToListAtIndex(0, itemFour);

        myList.displayItemList();

    }
}

