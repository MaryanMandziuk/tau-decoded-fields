/*
 * Copyright 2009-2010 TauNova (http://taunova.com). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */

package com.taunova.util.field.fixed;

import com.taunova.util.field.AbstractField;
import com.taunova.util.field.FieldType;

/**
 *
 * @author Renat.Gilmanov
 */
public final class FieldString extends AbstractField {

    private final String value;

    /**
     * 
     * @param name
     * @param value
     */
    public FieldString(String name, String value) {
        super(name);
        this.value = value;
    }

    /**
     * 
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param format
     * @return
     */
    public String format(String format) {
        return format(format, value);
    }

    /**
     * 
     * @return
     */
    public FieldType getFieldType() {
        return FieldType.STRING;
    }

    /**
     * 
     * @return
     */
    public String toString() {
        return value;
    }
}
