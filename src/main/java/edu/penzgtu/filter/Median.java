package edu.penzgtu.filter;

import java.util.List;

public class Median implements Filter {

    @Override
    public Double filter(List<Double> data) {
        return data.get(Math.round(data.size()/2));
    }
    
}
