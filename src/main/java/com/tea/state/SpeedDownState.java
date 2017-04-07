/**
 * @author teaho2015@gmail.com
 * since 2017/4/7
 */
package com.tea.state;

public class SpeedDownState implements State {

    private Car car;

    public SpeedDownState(Car car) {
        this.car = car;
    }

    @Override
    public void driveSpeedUp() {
        System.out.println(" speed up the car!!");
        car.setState(car.getSpeedUpState());
    }

    @Override
    public void driveSpeedDown() {
        System.out.println("already speed down!!");
    }

    @Override
    public void stop() {
        System.out.println("stop the car!!");
        car.setState(car.getStopState());
    }

    @Override
    public void start() {
        System.out.println("car is speeding down, already started!!!");
    }

}
