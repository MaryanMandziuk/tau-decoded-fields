/*
 * Copyright 2009 TauNova (http://taunova.com). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.taunova.util.field;

import java.util.Formatter;

/**
 *
 * @author Renat.Hilmanov
 */
public abstract class AbstractField implements Field {

    /**
     * The name of the field.
     */
    private final String name;

    /**
     *
     * @param name field name
     */
    public AbstractField(final String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     */
    @Override
    public FieldType getFieldType() {
        return FieldType.UNKNOWN;
    }

    /**
     *
     * @return
     */
    @Override
    public int getID() {
        return getName().hashCode();
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     *
     * @param format
     * @param values
     * @return
     */
    public String format(String format, Object... values) {
        final Formatter formatter = new Formatter();
        return formatter.format(format, values).toString();
    }    
    
    /**
     * 
     * @param format
     * @param values
     * @return 
     */
    public static String formatArray(String format, byte[] values) {
        if (null == values) {
            throw new IllegalArgumentException("Formatted values can't be null");
        }
        
        String str = "";
        for (int i = 0; i < values.length; i++) {
            str += String.format(format, values[i]);
        }
        
        return str;
    }

}
