package com.loonycorn;

import com.loonycorn.pointcuts.Items;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Items item = (Items) context.getBean("itemBeanOne");
        item.printItemDetails();
    }
}

