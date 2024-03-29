package org.zerock.ui;

import org.zerock.searcher.ASearcher;

import org.zerock.searcher.NSearcher;
import org.zerock.searcher.Searcher;

import java.util.HashMap;
import java.util.Map;

public class UIFactory {

    private static Map<String, AbstractUI> uiMap;

    static{
        uiMap = new HashMap<>();
        uiMap.put("A", new AUI());
        uiMap.put("N", new NUI());
        uiMap.put("D", new DUI());
    }

    public static AbstractUI getSearcher(String type){

        return uiMap.get(type);
    }
}
