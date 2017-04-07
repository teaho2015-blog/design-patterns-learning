/**
 * @author teaho2015@gmail.com
 * since 2017/4/7
 */
package com.tea.state;

public interface State {

    void driveSpeedUp();

    void driveSpeedDown();

    void stop();

    void start();

//    void shift();
}
