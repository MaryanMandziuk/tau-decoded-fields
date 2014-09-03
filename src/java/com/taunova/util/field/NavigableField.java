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
public interface NavigableField extends Field {
    
    /**
     * 
     * @return 
     */
    int getOffset();
    
    /**
     * 
     * @return 
     */
    int getSize();
}
