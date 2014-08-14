/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taunova.util.field.navigable;

import com.taunova.util.field.AbstractNavigableField;
import com.taunova.util.field.NavigableField;
import com.taunova.util.field.type.FieldShort;

/**
 *
 * @author Renat Gilmanov
 */
public class NavigableShort extends AbstractNavigableField implements NavigableField {

    public NavigableShort(String name, short value, int offset, int size) {
        super(new FieldShort(name, value), offset, size);
    }
}
