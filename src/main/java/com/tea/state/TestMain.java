/**
 * @author teaho2015@gmail.com
 * since 2017/4/8
 */
package com.tea.state;

public class TestMain {

    public static void main(String[] args) {
        Car car = new Car();

        car.start();
        car.stop();
        car.start();
        car.speedUp();
        car.stop();
        car.speedDown();
        car.speedDown();
        car.stop();
    }
}
