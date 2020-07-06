package com.stayready.assessment1.part1;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Baron Von Rhino 07/01/2020.
 */
public class BasicArrayUtilsTest {
    @Test
    public void getFirstElementTest() {
        // Given
        final String[] inputArray = { "The", "quick", "brown" };
        final String expected = "The";

        // When
        final String actual = BasicArrayUtils.getFirstElement(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFirstElementTest2() {
        // Given
        final String[] inputArray = { "Somewhere", "over", "the", "rainbow" };
        final String expected = "Somewhere";

        // When
        final String actual = BasicArrayUtils.getFirstElement(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSecondTest() {
        // Given
        final String[] inputArray = { "The", "quick", "brown" };
        final String expected = "quick";

        // When
        final String actual = BasicArrayUtils.getSecondElement(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getSecondTest2() {
        // Given
        final String[] inputArray = { "Somewhere", "over", "the", "rainbow" };
        final String expected = "over";

        // When
        final String actual = BasicArrayUtils.getSecondElement(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseArrayTest() {
        // Given
        final String[] input = { "The", "quick", "brown" };
        final String[] expected = { "brown", "quick", "The" };

        // When
        final String[] actual = BasicArrayUtils.reverse(input);

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void reverseArrayTest2() {
        // Given
        final String[] expected = { "Somewhere", "over", "the", "rainbow" };

        // When
        final String[] actual = BasicArrayUtils.reverse(BasicArrayUtils.reverse(expected));

        // Then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void firstLetterTest() {
        // Given
        final String[] inputArray = { "The", "quick", "brown", "fox" };
        final String expected = "Tqbf";

        // When
        final String actual = BasicArrayUtils.getFirstLetterOfEachElement(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void firstLetterTest2() {
        // Given
        final String[] inputArray = { "Somewhere", "over", "the", "rainbow" };
        final String expected = "Sotr";

        // When
        final String actual = BasicArrayUtils.getFirstLetterOfEachElement(inputArray);

        // Then
        Assert.assertEquals(expected, actual);
    }

}
