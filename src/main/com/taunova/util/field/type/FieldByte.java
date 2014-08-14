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
public class FieldByte extends AbstractField{

    private final byte value;

    public FieldByte(String name, byte value) {
        super(name);
        this.value = value;
    }

    public byte getValue() {
        return value;
    }

    public String format(String format) {
        return format(format, 0xFF & value);
    }

    public FieldType getFieldType() {
        return FieldType.BYTE;
    }

    public String toString() {
        return Byte.toString(value);
    }
}
