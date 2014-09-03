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
public class FieldByteEnum extends AbstractField {

    private final byte[] value;

    public FieldByteEnum(String name, byte[] value) {
        super(name);
        if(null == value)
            throw new IllegalArgumentException("Field byte enum can't be null");
        this.value = value;
    }

    public byte[] getValue() {
        return value;
    }

    public String format(String format) {
        return formatArray(format, value);
    }

    public FieldType getFieldType() {
        return FieldType.ENUM_BYTE;
    }

    public String toString() {
        return value.toString();
    }
}
