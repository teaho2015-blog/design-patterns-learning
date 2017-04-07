/**
 * @author teaho2015@gmail.com
 * since 2017/4/7
 */
package com.tea.state;

public class SpeedUpState implements State {

    private Car car;

    public SpeedUpState(Car car) {
        this.car = car;
    }

    @Override
    public void driveSpeedUp() {
        System.out.println("already speed up!!");
    }

    @Override
    public void driveSpeedDown() {
        System.out.println("speed down!!");
        car.setState(car.getSpeedDownState());
    }

    @Override
    public void stop() {
        System.out.println("car drive too fast, can not stop, please speed down first!!");
    }

    @Override
    public void start() {
        System.out.println("car is speeding up, already started!!!");
    }

}
