/*
 * Copyright 2009 TauNova (http://taunova.com). All rights reserved.
 * 
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */

package com.taunova.util.field;

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
     * @param name
     * @return
     */
    boolean containsField(String name);
}
