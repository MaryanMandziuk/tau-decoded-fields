/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.taunova.util.field.fixed;

import com.taunova.util.field.FieldType;
import java.util.Arrays;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
/**
 *
 * @author maryan
 */
public class FixedFieldsTest {
    
    
    
    /**
     * Test of getValue method, of class FieldBoolean.
     */
    @Test
    public void testFieldBoolean() {
        System.out.println("test boolean field");
        final boolean value = false;
        final String name = "name";
        final FieldBoolean booleanField = new FieldBoolean(name, value);
        
        assertTrue(name.equals(booleanField.getName()));
        assertTrue(booleanField.getFieldType() == FieldType.BOOLEAN);
        assertFalse(booleanField.getID() == 0);
        assertEquals(booleanField.format("Test %s."), "Test false.");
        assertEquals(value, booleanField.getValue());
        
    }
    
    /**
     * Testing byte field
     */
    @Test
    public void testFieldByte() {
        System.out.println("test byte field");
        final byte value = 11;
        final String name = "name";
        final FieldByte byteField = new FieldByte(name, value);

        assertTrue(name.equals(byteField.getName()));
        assertTrue(byteField.getFieldType() == FieldType.BYTE);
        assertFalse(byteField.getID() == 0);
        assertEquals(byteField.format("Test %d."), "Test 11.");
        assertEquals(value, byteField.getValue());
        
    }
    
    /**
     * Testing byteEnum field
     */
    @Test
    public void testFieldByteEnum() {
        System.out.println("test byteEnum field");
        final byte[] value = new byte[]{11,3,3,4,5,6};
        final String name = "name";
        final FieldByteEnum byteEnumField = new FieldByteEnum(name, value);
        
        assertTrue(name.equals(byteEnumField.getName()));
        assertTrue(byteEnumField.getFieldType() == FieldType.ENUM_BYTE);
        assertFalse(byteEnumField.getID() == 0);
        assertEquals(byteEnumField.getValue(), value);
        assertTrue(Arrays.equals(value, byteEnumField.getValue()));
        assertEquals(FieldByteEnum.formatArray("%s ", byteEnumField.getValue()), "11 3 3 4 5 6 ");
    }
    
    /**
     * Testing byteEnum with exception
     * @throws Exception 
     */
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFieldByteEnumError() throws Exception {
        System.out.println("test byteEnum field for illegal argument exception");
        final byte[] value = null;
        final String name = "name";
        new FieldByteEnum(name, value);  
    }
    
    /**
     * Testing integer field
     */
    @Test
    public void testFieldInteger() {
        System.out.println("test integer field");
        final int value = 222341331;
        final String name = "name";
        final FieldInteger integerField = new FieldInteger(name, value);

        assertTrue(name.equals(integerField.getName()));
        assertTrue(integerField.getFieldType() == FieldType.INTEGER);
        assertFalse(integerField.getID() == 0);
        assertEquals(integerField.format("Test %d."), "Test 222341331.");
        assertEquals(value, integerField.getValue());
    }
    
    /**
     * Testing long field
     */
    @Test
    public void testFieldLong() {
        System.out.println("test long field");
        final long value = 2365876577766443254L;
        final String name = "name";
        final FieldLong longField = new FieldLong(name, value);

        assertTrue(name.equals(longField.getName()));
        assertTrue(longField.getFieldType() == FieldType.LONG);
        assertFalse(longField.getID() == 0);
        assertEquals(longField.format("Test %d."), "Test 2365876577766443254.");
        assertEquals(value, longField.getValue());
    }
    
    
    @Test
    public void testFieldShort() {
        System.out.println("test short field");
        final short value = 23658;
        final String name = "name";
        final FieldShort shortField = new FieldShort(name, value);

        assertTrue(name.equals(shortField.getName()));
        assertTrue(shortField.getFieldType() == FieldType.SHORT);
        assertFalse(shortField.getID() == 0);
        assertEquals(shortField.format("Test %d."), "Test 23658.");
        assertEquals(value, shortField.getValue());
    }
    
    
    @Test
    public void testFieldString() {
        System.out.println("test short field");
        final String value = "value";
        final String name = "name";
        final FieldString stringField = new FieldString(name, value);

        assertTrue(name.equals(stringField.getName()));
        assertTrue(stringField.getFieldType() == FieldType.STRING);
        assertFalse(stringField.getID() == 0);
        assertEquals(stringField.format("Test %s."), "Test value.");
        assertEquals(value, stringField.getValue());
    }

}
