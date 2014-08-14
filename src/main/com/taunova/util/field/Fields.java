/*
 * Copyright 2009 TauNova (http://taunova.com). All rights reserved.
 * 
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.taunova.util.field;

import com.taunova.util.field.type.FieldBoolean;
import com.taunova.util.field.type.FieldByte;
import com.taunova.util.field.type.FieldByteEnum;
import com.taunova.util.field.type.FieldInteger;
import com.taunova.util.field.type.FieldLong;
import com.taunova.util.field.type.FieldShort;
import com.taunova.util.field.type.FieldString;

/**
 *
 * @author Renat.Hilmanov
 */
public final class Fields {

// ----------------

    /**
     *
     * @param name
     * @param value
     * @return
     */
    public static Field createByte(String name, byte value) {
        return new FieldByte(name, value);
    }


    /**
     *
     * @param name
     * @param value
     * @return
     */
    public static Field createShort(String name, short value) {
        return new FieldShort(name, value);
    }

    /**
     *
     * @param name
     * @param value
     * @return
     */
    public static Field createInteger(String name, int value) {
        return new FieldInteger(name, value);
    }

    /**
     *
     * @param name
     * @param value
     * @return
     */
    public static Field createLong(String name, long value) {
        return new FieldLong(name, value);
    }

    /**
     *
     * @param name
     * @param value
     * @return
     */
    public static Field createBoolean(String name, boolean value) {
        return new FieldBoolean(name, value);
    }

    /**
     *
     * @param name
     * @param value
     * @return
     */
    public static Field createByteEnum(String name, byte[] value) {
        return new FieldByteEnum(name, value);
    }

    /**
     *
     * @param name
     * @param value
     * @return
     */
    public static Field createString(String name, String value) {
        return new FieldString(name, value);
    }

    public static Field createByte(String name, byte value, int offset, int size) {
        return new FieldByte(name, value);
    }

    public static Field createShort(String name, short value, int offset, int size) {
        return new FieldShort(name, value);
    }

    public static Field createInteger(String name, int value, int offset, int size) {
        return new FieldInteger(name, value);
    }

    public static Field createLong(String name, long value, int offset, int size) {
        return new FieldLong(name, value);
    }

    public static Field createBoolean(String name, boolean value, int offset, int size) {
        return new FieldBoolean(name, value);
    }

    public static Field createByteEnum(String name, byte[] value, int offset, int size) {
        return new FieldByteEnum(name, value);
    }

    public static Field createString(String name, String value, int offset, int size) {
        return new FieldString(name, value);
    }

    private Fields() {
    }
}
