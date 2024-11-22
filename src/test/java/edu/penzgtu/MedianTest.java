package edu.penzgtu;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import edu.penzgtu.filter.Median;

public class MedianTest {

    @Test
    public void MedianShouldReturnCorrectValue() {
        Median median = new Median();
        
        var lst = new ArrayList<Double>();
        lst.add(1.0);
        lst.add(2.0);
        lst.add(3.0);
        
        assertEquals(median.filter(lst), 2.0);
    }

    @Test
    public void MedianShouldReturnCorrectValue2() {
        // Median median = new Median();
        
        // var lst = new ArrayList<Double>();
        // lst.add(1.0);
        // lst.add(5.0);
        // lst.add(2.0);
        
        // assertEquals(median.filter(lst), 2.0);
    }
}
