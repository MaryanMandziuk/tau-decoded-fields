/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taunova.util.field.navigable;

import com.taunova.util.field.AbstractNavigableField;
import com.taunova.util.field.FieldType;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author maryan
 */
public class NavigableFieldsTest {
    
    /**
     * Same asserts for the most fields
     * @param a
     * @param name
     * @param size
     * @param offset
     * @param expString
     * @param fieldType 
     */
    public void suitAsserts(final AbstractNavigableField a, final String name, final int size, 
            final int offset, final String expString, final FieldType fieldType) {

        assertTrue(name.equals(a.getName()));
        assertEquals(a.getOffset(), offset);
        assertEquals(a.getSize(), size);
        assertTrue(a.getFieldType() == fieldType);
        assertFalse(a.getID() == 0);
        assertEquals(a.format("Test %s."), expString);
    }
    
    /**
     * Testing navigable boolean
     */
    @Test
    public void testNavigableBoolean() {
        
        System.out.println("test boolean field");
        final boolean value = false;
        final String name = "name";
        final int size = 1;
        final int offset = 1;
        final String expStr = "Test false.";
        final FieldType fieldType= FieldType.BOOLEAN;
        final NavigableBoolean booleanField = new NavigableBoolean(name, value, offset, size);
        suitAsserts(booleanField, name, size, offset, expStr, fieldType);
    }
    
    /**
     * Testing navigable byte
     */
    @Test
    public void testNavigableByte() {
        
        System.out.println("test byte field");
        final byte value = 2;
        final String name = "name";
        final int size = 3;
        final int offset = 11;
        final String expStr = "Test 2.";
        final FieldType fieldType= FieldType.BYTE;
        final NavigableByte byteField = new NavigableByte(name, value, offset, size);
        suitAsserts(byteField, name, size, offset, expStr, fieldType);
    }
    
    /**
     * Testing navigable byte enum
     */
    @Test
    public void testNavigableByteEnum() {
        
        System.out.println("test byte enum field");
        final byte[] value = new byte[]{11,3,3,4,5,6};
        final String name = "name";
        final int size = 3;
        final int offset = 11;
        final String expStr = "1133456";
        final FieldType fieldType = FieldType.ENUM_BYTE;
        final NavigableByteEnum byteEnumField = new NavigableByteEnum(name, value, offset, size);
        
        assertTrue(name.equals(byteEnumField.getName()));
        assertEquals(byteEnumField.getOffset(), offset);
        assertEquals(byteEnumField.getSize(), size);
        assertTrue(byteEnumField.getFieldType() == fieldType);
        assertFalse(byteEnumField.getID() == 0);
        assertEquals(NavigableByteEnum.formatArray("%s", value), expStr);
    }
    
    /**
     * Testing navigable byte enum with exception
     * @throws Exception 
     */
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNavigableByteEnumEx() throws Exception {
        System.out.println("test byteEnum field for illegal argument exception");
        final byte[] value = null;
        final int size = 3;
        final int offset = 11;
        final String name = "name";
        new NavigableByteEnum(name, value, offset, size);
    }
    
    /**
     * Testing navigable integer
     */
    @Test
    public void testNavigableInteger() {
        
        System.out.println("test integer field");
        final int value = 221111111;
        final String name = "name";
        final int size = 3;
        final int offset = 11;
        final String expStr = "Test 221111111.";
        final FieldType fieldType= FieldType.INTEGER;
        final NavigableInteger byteField = new NavigableInteger(name, value, offset, size);
        suitAsserts(byteField, name, size, offset, expStr, fieldType);
    }
    
    /**
     * Testing navigable short
     */
    @Test
    public void testNavigableShort() {
        
        System.out.println("test short field");
        final short value = 11111;
        final String name = "name";
        final int size = 3;
        final int offset = 11;
        final String expStr = "Test 11111.";
        final FieldType fieldType= FieldType.SHORT;
        final NavigableShort byteField = new NavigableShort(name, value, offset, size);
        suitAsserts(byteField, name, size, offset, expStr, fieldType);
    }
    
    /**
     * Testing navigable string
     */
    @Test
    public void testNavigableString() {
        
        System.out.println("test string field");
        final String value = "string d";
        final String name = "name";
        final int size = 3;
        final int offset = 11;
        final String expStr = "Test string d.";
        final FieldType fieldType= FieldType.STRING;
        final NavigableString byteField = new NavigableString(name, value, offset, size);
        suitAsserts(byteField, name, size, offset, expStr, fieldType);  
    }
}
