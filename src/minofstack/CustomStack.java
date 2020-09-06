package minofstack;

import java.util.ArrayList;
import java.util.List;

public class CustomStack {

    private List<Integer> elements;
    private List<Integer> mins;

    public CustomStack() {
        elements = new ArrayList<>();
        mins = new ArrayList<>();
    }

    public void push(Integer e) {
        System.out.println("===============================");
        System.out.println("PUSHED ELEMENT: " + e);
        elements.add(e);
        if (mins.size() == 0 || mins.get(mins.size() - 1) >= e) {
            System.out.println("NEW MIN DETECTED: " + e);
            mins.add(e);
            System.out.println("MINS STACK IS: " + mins);
        }
        System.out.println("STACK IS: " + elements);
    }

    public Integer pull() {
        System.out.println("===============================");
        if (elements.size() == 0) {
            System.out.println("NO MORE ELEMENTS IN THE STACK");
            return -1;
        }

        int result = elements.get(elements.size()-1);
        System.out.println("PULLED ELEMENT: " + result);
        elements.remove(elements.size()-1);
        System.out.println("STACK IS: " + elements);
        Integer min = mins.get(mins.size() - 1);
        if (result == min) {
            mins.remove(min);
            System.out.println("MIN REMOVED: " + min);
            System.out.println("MINS STACK IS: " + mins);
        }
        return result;
    }

    public int min() {
        System.out.println("===============================");
        System.out.println("MIN IS: " + mins.get(mins.size()-1));
        return 0;
    }
}
