package com.example.demo.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Figure {
    private FigureType type;
}
