/*
 * Copyright 2009 TauNova (http://taunova.com). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.taunova.util.field.navigable;

import com.taunova.util.field.AbstractNavigableField;
import com.taunova.util.field.NavigableField;
import com.taunova.util.field.fixed.FieldByteEnum;

/**
 *
 * @author Renat Gilmanov
 */
public class NavigableByteEnum extends AbstractNavigableField implements NavigableField {

    public NavigableByteEnum(String name, byte[] value, int offset, int size) {
        super(new FieldByteEnum(name, value), offset, size);
    }
}
