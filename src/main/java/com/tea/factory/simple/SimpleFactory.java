/**
 * @author teaho2015@gmail.com
 * since 2017/4/1
 */
package com.tea.factory.simple;

import java.io.IOException;
import java.text.ParseException;

public class SimpleFactory {

    public Product createProduct(String type) throws NoTypeDeFoundException{
        Product product = null;

        switch (type) {
            case "1": product = new Product1();break;
            case "2": product = new Product2();break;
            default: throw new NoTypeDeFoundException();
        }

        return product;
    }
}
