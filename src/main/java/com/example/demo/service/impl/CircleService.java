package com.example.demo.service.impl;

import com.example.demo.model.Circle;
import com.example.demo.model.FigureType;
import com.example.demo.service.FigureService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class CircleService implements FigureService<Circle> {
    @Override
    public Long calculateSquare(Circle figure) {
        return 9999L;
    }

    @Override
    public FigureType getFigure() {
        return FigureType.CIRCLE;
    }
}
