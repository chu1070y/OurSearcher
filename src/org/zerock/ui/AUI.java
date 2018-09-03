package org.zerock.ui;

import org.zerock.domain.Criteria;
import org.zerock.domain.Store;
import org.zerock.searcher.Searcher;

import java.util.List;

public class AUI extends AbstractUI {

    @Override
    public void doJob() {

        String areaCode = input("지역 코드 입력 ");
        Criteria cri = new Criteria();
        cri.setAreacode(areaCode);
        List<Store> result = getSearcher().search(cri);

        printResult(result);

    }
}
