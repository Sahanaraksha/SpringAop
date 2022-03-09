package com.loonycorn;


import com.loonycorn.pointcuts.Items;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Items item = (Items) context.getBean("itemBeanOne");

        System.out.println("The items created: \n" + item.toString());

        item.setAvailableQuantity(20);

        System.out.println("Updated available quantity: " + item.getAvailableQuantity());

    }
}

