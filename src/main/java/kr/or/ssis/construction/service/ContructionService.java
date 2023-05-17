package kr.or.ssis.construction.service;

import kr.or.ssis.construction.dao.ConstructionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 기능수행, 트랜잭션
@Service
public class ContructionService {

    @Autowired
    private ConstructionDao constructionDao;

    // 1. 모든 건설현장 보기
    public String viewAllContructions() {
        // 데이터베이스 접속 후 건설현장 데이터를 가져와서 반환
        return constructionDao.selectAllConstructions();
    }

    // 2. 건설현장 상세보기
    public String viewContructionDetailsByConstId(
                                String constId) {
        // select * from constructions where contId = {constId}
        return constructionDao.selectConsctuctionByConstId(constId);
    }
}