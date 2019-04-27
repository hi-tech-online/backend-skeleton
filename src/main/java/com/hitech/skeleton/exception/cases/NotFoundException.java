package com.hitech.skeleton.exception.cases;

import com.hitech.skeleton.exception.BaseException;

/**
 * @author Steven
 */
public class NotFoundException extends BaseException {
    public NotFoundException(String message, int code) {
        super(message, code);
    }
}
