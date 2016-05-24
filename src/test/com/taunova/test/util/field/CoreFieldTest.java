/*
 * Copyright 2009 TauNova (http://taunova.com). All rights reserved.
 *
 * This file is subject to the terms and conditions defined in
 * file 'LICENSE.txt', which is part of this source code package.
 */
package com.taunova.test.util.field;

import com.taunova.util.field.AbstractField;
import com.taunova.util.field.FieldType;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Renat.Hilmanov
 */
public class CoreFieldTest {

    private static class TestField extends AbstractField {

        private final String value;

        public TestField(String name, String value) {
            super(name);
            this.value = value;
        }

        @Override
        public String format(String format) {
            return super.format(format, value);
        }
    }

    @Test
    public void constructorTest() {
        final String name = "name";
        final String value = "value";
        final TestField field = new TestField(name, value);

        Assert.assertTrue(name.equals(field.getName()));        
        Assert.assertTrue(field.getFieldType() == FieldType.UNKNOWN);
        Assert.assertFalse(field.getID() == 0);
        Assert.assertEquals(field.format("Test %s."), "Test value.");
        
    }
}
