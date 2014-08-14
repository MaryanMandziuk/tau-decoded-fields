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

    private String name = null;

    /**
     * 
     * @param name
     */
    public AbstractField(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     */
    public FieldType getFieldType() {
        return FieldType.UNKNOWN;
    }

    /**
     * 
     * @return
     */
    public int getID() {
        return getName().hashCode();
    }

    /**
     * 
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param format
     * @param values
     * @return
     */
    public String format(String format, Object ... values) {
        Formatter formatter = new Formatter();
        return formatter.format(format, values).toString();
    }

    public static String formatArray(String format, byte[] values) {
        if(null == values) {
            throw new IllegalArgumentException("Formatted values can't be null");
        }

        Formatter formatter = new Formatter();
        Short[] buffer = new Short[values.length];
        for(int i=0; i< values.length; i++) {
            int value =0;
            value = value | 0xFF & values[i];
            buffer[i] = (short) value;
        }
        return formatter.format(format, (Object) buffer).toString();
    }
 }
