package com.example;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
@Transactional
public class PointService {
    @Inject
    PointRepository pointRepository;

    public List<Point> findAll() {
        return pointRepository.findAll();
    }

    public Point create(Point point) {
        return pointRepository.save(point);
    }
}
