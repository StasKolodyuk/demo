package com.example.integration;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DummyIT {
    @Test
    public void dummyUnitTestSuccess() {
        System.out.println("Success Integration Test");
        assertThat(1, is(1));
    }

    @Test
    public void dummyUnitTestFailure() {
        System.out.println("Failure Integration Test");
        assertThat(1, is(2));
    }
}
