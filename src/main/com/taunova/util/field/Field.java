/*
 * Copyright 2009 TauNova (http://taunova.com). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.taunova.util.field;

/**
 * <tt>Field</tt> defines a common interface for passing data of different types.
 * 
 * @author Renat.Hilmanov
 */
public interface Field extends Formattable {

    /**
     * Returns unique identifier of the field.
     * 
     * @return an id of the field
     */
    int getID();
    
    /**
     * Returns human readable name of the field. 
     * 
     * @return a name of the field
     */
    String getName();

    /**
     * Returns type of the field.
     * 
     * @return field type.
     */
    FieldType getFieldType();

    /**
     * Formats a value represented by this field using specified format.
     * 
     * @param format a format to be used
     * @return a formatted value
     */
    @Override
    String format(String format);    
}


