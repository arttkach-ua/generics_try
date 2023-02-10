package com.example.demo.model;

import lombok.EqualsAndHashCode;
import lombok.Value;
import lombok.experimental.SuperBuilder;

@Value
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class Rectangle extends Figure {
    int sizeA;
    int sizeB;
}
