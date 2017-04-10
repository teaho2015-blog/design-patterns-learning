/**
 * @author teaho2015@gmail.com
 * since 2017/4/5
 */
package com.tea.iterator;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestIteratorCompileMain {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c", "d", "e"};
        System.out.println("=====print string array =====");
        for (String s : strings) {
            System.out.println(s);
        }

        System.out.println("=====print list =====");
        List<String> list = new ArrayList<>(Arrays.asList(strings));
        for (String s : list) {
            System.out.println(s);
        }

    }
}
