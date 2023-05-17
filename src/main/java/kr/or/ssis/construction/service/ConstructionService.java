package kr.or.ssis.construction.service;

import kr.or.ssis.construction.model.Construction;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ConstructionService {
    List<Construction> viewAllContructions();
    Construction viewContructionDetailsByConstId(String constId);
}
