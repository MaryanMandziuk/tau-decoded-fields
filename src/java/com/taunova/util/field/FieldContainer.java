/*
 * Copyright 2009 TauNova (http://taunova.com). All rights reserved.
 * 
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */

package com.taunova.util.field;

import java.util.Map;

/**
 *
 * @author Renat.Hilmanov
 */
public interface FieldContainer {

    /**
     * 
     * @return
     */
    int getFieldCount();


    /**
     * 
     * @param name
     * @return
     */
    Field getField(String name);

    /**
     *
     * @param field
     */
    void addField(Field field);

    /**
     * 
     * @param name
     * @return
     */
    boolean containsField(String name);
}
