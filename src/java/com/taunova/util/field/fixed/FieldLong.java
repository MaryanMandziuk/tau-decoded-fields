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
 * @author Renat Gilmanov
 */
public class FieldLong extends AbstractField {

    protected final long value;

    public FieldLong(String name, long value) {
        super(name);
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    public String format(String format) {
        return format(format, value);
    }

    public FieldType getFieldType() {
        return FieldType.LONG;
    }

    @Override
    public String toString() {
        return Long.toHexString(value);
    }
}
