package com.example.demo.service;

import com.example.demo.model.Circle;
import com.example.demo.model.Figure;
import com.example.demo.model.FigureType;
import com.example.demo.model.Rectangle;
import com.example.demo.providers.FigureServiceProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class ExampleRunnerService {

    private final FigureServiceProvider provider;

    public void processExample() {
        List<Figure> myList = List.of(
                Rectangle.builder().sizeB(1).sizeA(1).type(FigureType.RECTANGLE).build(),
                Rectangle.builder().sizeB(1).sizeA(1).type(FigureType.RECTANGLE).build(),
                Circle.builder().radius(25L).type(FigureType.CIRCLE).build());
        //myList.forEach();
    }

    private <T extends Figure> void a(T figure) {
        FigureService<T> service = provider.getFigureService(figure.getType());
        log.info(service.calculateSquare(figure));
    }
}
