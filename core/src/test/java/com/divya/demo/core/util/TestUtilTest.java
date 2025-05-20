package com.divya.demo.core.util;

import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import junitx.util.PrivateAccessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(AemContextExtension.class)
class TestUtilTest {

    @BeforeEach
    void setUp() {
        TestUtil testUtil = Mockito.mock(TestUtil.class);
    }

    @Test
    void checkMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String input = "Hello, world!";
        InputStream is = new ByteArrayInputStream(input.getBytes());
        TestUtil testUtil = new TestUtil();
        Method privateMethod = TestUtil.class.getDeclaredMethod("StreamToString",InputStream.class);
        privateMethod.setAccessible(true);
        // invoke the private method for test
        Object s = privateMethod.invoke(testUtil, is);
        assertEquals(s.toString(),"Hello, world!");
    }
}