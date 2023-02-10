package com.example.demo.providers;

import com.example.demo.model.Figure;
import com.example.demo.model.FigureType;
import com.example.demo.service.FigureService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
@Log4j2
@RequiredArgsConstructor
public class FigureServiceProvider {
    private final Map<FigureType, FigureService<? extends Figure>> serviceMap;

    public FigureServiceProvider(List<FigureService<? extends Figure>> availableServices) {
        serviceMap = availableServices.stream()
                .collect(Collectors.toMap(FigureService::getFigure, Function.identity()));
    }

    public FigureService<? extends Figure> getFigureService(FigureType type) {
        return Optional.ofNullable(serviceMap.get(type))
                .orElseThrow(() -> new NoSuchElementException("some error"));
    }
}
