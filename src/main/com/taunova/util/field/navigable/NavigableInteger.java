/*
 * Copyright 2009 TauNova (http://taunova.com). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.taunova.util.field.navigable;

import com.taunova.util.field.AbstractNavigableField;
import com.taunova.util.field.NavigableField;
import com.taunova.util.field.type.FieldInteger;

/**
 *
 * @author Renat Gilmanov
 */
public class NavigableInteger extends AbstractNavigableField implements NavigableField {

    public NavigableInteger(String name, int value, int offset, int size) {
        super(new FieldInteger(name, value), offset, size);
    }
}
