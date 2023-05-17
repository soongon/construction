package kr.or.ssis.construction.controller;

import kr.or.ssis.construction.model.Construction;
import kr.or.ssis.construction.service.ContructionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConstructionController {

    @Autowired
    private ContructionServiceImpl service;

    @GetMapping("/constructions")
    public List<Construction> viewAllContructions() {
        return service.viewAllContructions();
    }

    @GetMapping("/constructions/{constId}")
    public Construction viewConstructionDetail(
                @PathVariable String constId) {
        return service.viewContructionDetailsByConstId(constId);
    }
}
