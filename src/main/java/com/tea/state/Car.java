/**
 * @author teaho2015@gmail.com
 * since 2017/4/7
 */
package com.tea.state;

public class Car {

    State state;

    State speedUpState;
    State speedDownState;

    State stopState;

    State startState;

    public Car() {
        startState = new StartState(this);
        stopState = new StopState(this);
        speedUpState = new SpeedUpState(this);
        speedDownState = new SpeedDownState(this);

        state = startState;
    }

    public void start() {
        state.start();
    }

    public void stop() {
        state.stop();
    }

    public void speedUp() {
        state.driveSpeedUp();
    }

    public void speedDown() {
        state.driveSpeedDown();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }


    public State getSpeedUpState() {
        return speedUpState;
    }

    public State getSpeedDownState() {
        return speedDownState;
    }

    public State getStopState() {
        return stopState;
    }

    public State getStartState() {
        return startState;
    }
}
