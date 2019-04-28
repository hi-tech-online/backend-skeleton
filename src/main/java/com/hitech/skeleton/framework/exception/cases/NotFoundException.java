package com.hitech.skeleton.framework.exception.cases;

import com.hitech.skeleton.framework.exception.BaseException;

/**
 * @author Steven
 */
public class NotFoundException extends BaseException {
    public NotFoundException(String message, int code) {
        super(message, code);
    }
}
