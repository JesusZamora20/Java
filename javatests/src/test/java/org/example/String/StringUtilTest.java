package org.example.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {
    @Test
    public void test_string_is_not_empty() {
        assertFalse(StringUtil.isEmpty("Jesus"));
    }
}