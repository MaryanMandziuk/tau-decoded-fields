/*
 * Copyright 2009-2010 TauNova (http://taunova.com). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */

package com.taunova.util.field.type;

import com.taunova.util.field.AbstractField;
import com.taunova.util.field.FieldType;

/**
 *
 * @author Renat.Gilmanov
 */
public class FieldShort extends AbstractField {

    private short value = 0;

    /**
     * 
     * @param name
     */
    public FieldShort(String name) {
        super(name);
    }

    /**
     * 
     * @param name
     * @param value
     */
    public FieldShort(String name, short value) {
        super(name);
        this.value = value;
    }

    /**
     * 
     * @return
     */
    public short getValue() {
        return value;
    }

    /**
     * 
     * @param value
     */
    public void setValue(short value) {
        this.value = value;
    }

    /**
     * 
     * @param format
     * @return
     */
    public String format(String format) {
        return format(format, (0xFFFF & value));
    }

    /**
     * 
     * @return
     */
    public FieldType getFieldType() {
        return FieldType.SHORT;
    }

    /**
     * 
     * @return
     */
    public String toString() {
        return Integer.toString(0xFFFF & value);
    }
}
