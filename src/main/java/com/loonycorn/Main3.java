package com.loonycorn;


import com.loonycorn.pointcuts.ItemList;
import com.loonycorn.pointcuts.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext4.xml");

        Items itemOne = (Items) context.getBean("itemBeanOne");
        Items itemTwo = (Items) context.getBean("itemBeanTwo");

        ItemList myList = (ItemList) context.getBean("listBean");

        itemOne.printItemDetails();
        itemTwo.printItemDetails();

        myList.printNumItems();
        myList.displayItemList();
    }
}
