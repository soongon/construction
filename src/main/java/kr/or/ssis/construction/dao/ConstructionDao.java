package kr.or.ssis.construction.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ConstructionDao {

    //1. select * from construction
    public String selectAllConstructions() {
        return "construction 테이블의 모든 데이터 전달합니다.";
    }

    public String selectConsctuctionByConstId(String constId) {
        return constId + "번 건선현장 정보 전달합니다.";
    }
}
