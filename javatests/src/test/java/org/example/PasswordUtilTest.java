package org.example;

import org.example.password.PasswordUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {
    @Test
    public void Weak_when_its_less_8_letters(){
        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("123aa!"));
    }

    @Test
    public void Weak_when_its_only_letters(){
        assertEquals(PasswordUtil.SecurityLevel.WEAK, PasswordUtil.assessPassword("abcdefgh"));
    }

    @Test
    public void Medium_when_its_letters_and_numbers(){
        assertEquals(PasswordUtil.SecurityLevel.MEDIUM, PasswordUtil.assessPassword("abcde12345"));
    }

    @Test
    public void Strong_when_its_letters_numbers_symbols(){
        assertEquals(PasswordUtil.SecurityLevel.STRONG, PasswordUtil.assessPassword("abcd124@#"));
    }
}