/*
 * Copyright 2009 TauNova (http://taunova.com). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.taunova.util.field.navigable;

import com.taunova.util.field.AbstractNavigableField;
import com.taunova.util.field.NavigableField;
import com.taunova.util.field.fixed.FieldByte;

/**
 *
 * @author Renat Gilmanov
 */
public class NavigableByte extends AbstractNavigableField implements NavigableField {

    /**
     * 
     * @param name
     * @param value
     * @param offset
     * @param size 
     */
    public NavigableByte(String name, byte value, int offset, int size) {
        super(new FieldByte(name, value), offset, size);
    }
}
