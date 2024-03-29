package org.zerock.ui;

import org.zerock.domain.Criteria;

public class DUI extends AbstractUI {
    @Override
    public void doJob() {

        Criteria cri = new Criteria();
        cri.setDesc(input("keyword"));
        getSearcher().search(cri).forEach(store -> System.out.println(store));

    }
}
