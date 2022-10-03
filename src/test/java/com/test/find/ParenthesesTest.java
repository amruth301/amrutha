package com.test.find;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesesTest {

  @Test
  @DisplayName("find if it's a valid parantheses: ()")
  void test1(){
    String data = "()";
    assertTrue(new Parentheses().validParatheses(data), "() is a valid parentheses");
  }

  @Test
  @DisplayName("find if it's a valid parantheses: ([]){}")
  void test2(){
    String data = "([]){}";
    assertTrue(new Parentheses().validParatheses(data), "([]){} is a valid parentheses");
  }

  @Test
  @DisplayName("find if it's a valid parantheses: [)")
  void test3(){
    String data = "[)";
    assertFalse(new Parentheses().validParatheses(data), "[) is an invalid parentheses");
  }

}
