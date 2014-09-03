/*
 * Copyright 2009 TauNova (http://taunova.com). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.taunova.util.field;

/**
 *
 * @author Renat Gilmanov
 */
public abstract class AbstractNavigableField extends AbstractField implements NavigableField {

    protected int offset;
    protected int size;
    protected Field value;

    /**
     * 
     * @param name
     * @param value
     * @param offset
     * @param size
     */
    public AbstractNavigableField(Field value, int offset, int size) {
        super(value.getName());
        this.value=value;
        this.offset = offset;
        this.size = size;
    }

    /**
     *
     * @param format
     * @return
     */
    public String format(String format) {
        return value.format(format);
    }

    /**
     *
     * @return
     */
    public FieldType getFieldType() {
        return value.getFieldType();
    }

    /**
     * 
     * @return
     */
    public String toString() {
        return value.toString();
    }

    /**
     * 
     * @return
     */
    @Override
    public int getOffset() {
       return offset;
    }

    /**
     * 
     * @return
     */
    @Override
    public int getSize() {
        return size;
    }
}
