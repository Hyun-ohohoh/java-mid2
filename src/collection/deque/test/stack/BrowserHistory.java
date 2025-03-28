package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private Deque<String> browser = new ArrayDeque<>();

    public void visitPage(String page) {
        browser.push(page);
        System.out.println("방문: " + page);
    }

    public String goBack() {
        browser.pop();
        System.out.println("뒤로 가기: " + browser.peek());
        return browser.peek();
    }
}
