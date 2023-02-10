package com.example.demo.service.impl;

import com.example.demo.model.FigureType;
import com.example.demo.model.Rectangle;
import com.example.demo.service.FigureService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class RectangleService implements FigureService<Rectangle> {
    @Override
    public Long calculateSquare(Rectangle figure) {
        return 1111L;
    }

    @Override
    public FigureType getFigure() {
        return FigureType.RECTANGLE;
    }
}
