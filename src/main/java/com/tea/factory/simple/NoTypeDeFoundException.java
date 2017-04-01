/**
 * @author teaho2015@gmail.com
 * since 2017/4/1
 */
package com.tea.factory.simple;


public class NoTypeDeFoundException extends Exception {

    public NoTypeDeFoundException() {
        super();
    }

    public NoTypeDeFoundException(String message) {
        super(message);
    }

    public NoTypeDeFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoTypeDeFoundException(Throwable cause) {
        super(cause);
    }

    protected NoTypeDeFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
