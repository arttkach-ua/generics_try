package com.example.demo.service;

import com.example.demo.model.Figure;
import com.example.demo.model.FigureType;

public interface FigureService <T extends Figure>{
    Long calculateSquare(T figure);

    FigureType getFigure();
}
