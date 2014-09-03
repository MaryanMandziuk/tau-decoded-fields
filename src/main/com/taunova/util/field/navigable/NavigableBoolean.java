/*
 * Copyright 2009-2010 TauNova (http://taunova.com). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.taunova.util.field.navigable;

import com.taunova.util.field.AbstractNavigableField;
import com.taunova.util.field.NavigableField;
import com.taunova.util.field.fixed.FieldBoolean;

/**
 *
 * @author Renat Gilmanov
 */
public class NavigableBoolean extends AbstractNavigableField implements NavigableField {

    /**
     * 
     * @param name
     * @param value
     * @param offset
     * @param size
     */
    public NavigableBoolean(String name, boolean value, int offset, int size) {
        super(new FieldBoolean(name, value), offset, size);       
    }
    
}
