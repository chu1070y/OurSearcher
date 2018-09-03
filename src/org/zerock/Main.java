package org.zerock;

import org.zerock.searcher.Searcher;
import org.zerock.searcher.SearcherFactory;
import org.zerock.ui.AbstractUI;
import org.zerock.ui.UIFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);

        System.out.println("N or A or D ");

        String str = scanner.nextLine();

        Searcher searcher = SearcherFactory.getSearcher(str);

        AbstractUI ui = UIFactory.getSearcher(str);

        ui.setSearcher(searcher);
        ui.doJob();

    }
}
