/**
 * @author teaho2015@gmail.com
 * since 2017/4/4
 */
package com.tea.facade;

import java.util.Arrays;
import java.util.List;

public class BDao {
    public List<String> getList() {
        System.out.println("getting list");
        return Arrays.asList("BDao1", "BDao2", "Bdao3");
    }
}
