package com.divya.demo.core.util;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;

import java.io.InputStream;
import java.io.StringWriter;

public class TestUtil {

    private static String StreamToString(InputStream is) {
        String outString = null;
        try {
            StringWriter writer = new StringWriter();
            IOUtils.copy(is, writer, "UTF-8");
            outString = writer.toString();
        } catch (Exception e) {
            //log.warning("Exception writting string", e);
            outString = StringUtils.EMPTY;
        }
        return outString;
    }
}
