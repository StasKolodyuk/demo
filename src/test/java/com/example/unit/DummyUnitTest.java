package com.example.unit;


import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DummyUnitTest {
    @Test
    public void dummyUnitTest() {
        System.out.println("Unit Test");
        assertThat(1, is(1));
    }
}
