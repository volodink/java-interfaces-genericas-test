package edu.penzgtu.filter;

import java.util.List;

public class SMA implements Filter {

    @Override
    public Double filter(List<Double> data) {
        return data.stream().mapToDouble(Double::doubleValue).sum() / data.size();
    }
}