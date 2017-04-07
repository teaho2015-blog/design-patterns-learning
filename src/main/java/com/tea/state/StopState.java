/**
 * @author teaho2015@gmail.com
 * since 2017/4/7
 */
package com.tea.state;

public class StopState implements State {

    private Car car;

    public StopState(Car car) {
        this.car = car;
    }

    @Override
    public void driveSpeedUp() {
        System.out.println("car stopped, cannot speed up!!");
    }

    @Override
    public void driveSpeedDown() {
        System.out.println("car stopped, not support speed down!!");

    }

    @Override
    public void stop() {
        System.out.println("already stopped!!");
    }

    @Override
    public void start() {
        System.out.println("start the car!!!");
        car.setState(car.getStartState());
    }

}
