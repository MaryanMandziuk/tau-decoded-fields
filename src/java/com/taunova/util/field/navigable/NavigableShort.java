/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taunova.util.field.navigable;

import com.taunova.util.field.AbstractNavigableField;
import com.taunova.util.field.NavigableField;
import com.taunova.util.field.fixed.FieldShort;

/**
 *
 * @author Renat Gilmanov
 */
public class NavigableShort extends AbstractNavigableField implements NavigableField {

    /**
     * 
     * @param name
     * @param value
     * @param offset
     * @param size 
     */
    public NavigableShort(String name, short value, int offset, int size) {
        super(new FieldShort(name, value), offset, size);
    }
}
