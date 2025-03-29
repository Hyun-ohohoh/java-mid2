package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> browser = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String url) {
        if(currentPage != null){
            browser.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문: " + url);
    }

    public String goBack() {
        if(!browser.isEmpty()){
            currentPage = browser.pop();
            System.out.println("뒤로 가기: " + currentPage);
            return currentPage;
        }
        return null;
        //System.out.println("뒤로 가기: " + browser.peek());
        //return browser.peek();
    }
}
