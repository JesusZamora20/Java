package org.example.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {
    @Test
    public void test_string_is_not_empty() {
        assertFalse(StringUtil.isEmpty("Jesus"));
    }

    @Test
    public void empty_quote_is_string() {
        assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void null_string_is_empty() {
        assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void string_space_is_empty() {
        assertTrue(StringUtil.isEmpty("   "));
    }
}