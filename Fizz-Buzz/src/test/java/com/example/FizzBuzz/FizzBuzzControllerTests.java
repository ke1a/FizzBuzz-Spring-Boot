package com.example.FizzBuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class FizzBuzzControllerTests {

    private FizzBuzzController sut; 
    private FizzBuzzService fizzBuzzService;

    @BeforeEach
    public void setup() {
        fizzBuzzService = Mockito.mock(FizzBuzzService.class);
        sut = new FizzBuzzController();
    }

    @Test
    void testGetFizzBuzzNumbers() {
        sut.getFizzBuzzNumbers(10);
        Mockito.verify(fizzBuzzService);
        FizzBuzzService.getFizzBuzzNumbers(10);
    }

}
