package org.zerock.searcher;

import org.zerock.domain.Criteria;
import org.zerock.domain.Store;

import java.util.List;

public class ASearcher extends AbstractSearcher {
    @Override
    public List<Store> search(Criteria cri) {

        String area = cri.getAreacode();

        return getAreaMap().get(area);

    }
}
