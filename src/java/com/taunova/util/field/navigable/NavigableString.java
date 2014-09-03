/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taunova.util.field.navigable;

import com.taunova.util.field.AbstractNavigableField;
import com.taunova.util.field.NavigableField;
import com.taunova.util.field.fixed.FieldString;

/**
 *
 * @author Renat Gilmanov
 */
public class NavigableString extends AbstractNavigableField implements NavigableField {

    public NavigableString(String name, String value, int offset, int size) {
        super(new FieldString(name, value), offset, size);
    }
}
