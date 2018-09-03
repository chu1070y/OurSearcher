package org.zerock.searcher;

import org.zerock.domain.Criteria;
import org.zerock.domain.Store;

import java.util.List;
import java.util.stream.Collectors;

public class DSearcher extends AbstractSearcher {
    @Override
    public List<Store> search(Criteria cri) {

        return getStoreList().stream().filter(obj -> obj.getDesc().contains(cri.getDesc())).collect(Collectors.toList());
    }
}
