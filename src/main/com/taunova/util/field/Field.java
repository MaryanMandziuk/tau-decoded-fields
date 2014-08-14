/*
 * Copyright 2009 TauNova (http://taunova.com). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */

package com.taunova.util.field;

import com.taunova.common.Formattable;

/**
 * 
 * @author Renat.Hilmanov
 */
public interface Field extends Formattable {

    /**
     * 
     * @return
     */
    int getID();
    
    /**
     * 
     * @return
     */
    String getName();

    /**
     * 
     * @param format
     * @return
     */
    String format(String format);

    /**
     * 
     * @return
     */
    FieldType getFieldType();
}


