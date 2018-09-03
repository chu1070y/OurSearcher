package org.zerock.searcher;

import org.zerock.domain.Criteria;
import org.zerock.domain.Store;

import java.util.List;

public interface Searcher {

    public List<Store> search(Criteria cri);

}
