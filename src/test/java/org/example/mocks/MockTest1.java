package org.example.mocks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockTest1 {

    @Mock
    private Cat cat;
    @Mock
    private Dog dog;

    @Test
    public void test() {
        Cat halfCat = cat.createHalfCat();
        Dog halfDog = dog.createHalfDog();
        Mockito.verify(cat, Mockito.times(1)).createHalfCat(); // проверь, что createHalfCat() вызвался один раз
        Mockito.verify(dog, Mockito.times(1)).createHalfDog(); // проверь, что createHalfDog() вызвался один раз
    }
}
