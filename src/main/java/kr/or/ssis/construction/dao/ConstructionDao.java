package kr.or.ssis.construction.dao;

import kr.or.ssis.construction.model.Construction;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ConstructionDao {

    //1. select * from construction
    public List<Construction> selectAllConstructions() {
        // 1. 데이터베이스(마이시퀄)에 접속
        // 2. select * from construction 쿼리 날린다.
        // 3. 결과를 받는다.
        // 4. 결과를 받아서 자바 모델로 만들어 전달한다.
        List<Construction> constructions = Arrays.asList(
                new Construction(1, "래미안개포", "서울 개포동", 2000),
                new Construction(2, "자이해운대", "부산 해운대", 1500),
                new Construction(3, "대림목포", "전남 목포", 800)
        );

        return constructions;
    }

    public Construction selectConsctuctionByConstId(String constId) {

        return new Construction(Integer.parseInt(constId), "상세보기", "상세보기", 1000);
    }
}
