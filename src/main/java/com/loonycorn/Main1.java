package com.loonycorn;

import com.loonycorn.pointcuts.Items;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");

        Items item = (Items) context.getBean("itemBeanOne");

        System.out.println("The item created: \n" + item.toString());
        System.out.println("The item name: \n" + item.getItemName());
    }
}
