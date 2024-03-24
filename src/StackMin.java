import java.util.EmptyStackException;
import java.util.Stack;

public class StackMin {
    private final Stack<Integer> data;
    private final Stack<Integer> min;
    private final Stack<Integer> max;

    public StackMin() {
        this.data = new Stack<>();
        this.min = new Stack<>();
        this.max = new Stack<>();
    }

    public void push(Integer x) {
        data.push(x);
        if (min.isEmpty()) {
            min.push(x);
        } else if (min.peek() > x) {
            min.push(x);
        }
        if (max.isEmpty()) {
            max.push(x);
        } else if (max.peek() > x) {
            max.push(x);
        }
    }

    public Integer pop() {
        if (!data.isEmpty()) {
            Integer temp = data.pop();
            if (temp.equals(min.peek())) {
                min.pop();
            }
            if (temp.equals(max.peek())) {
                max.pop();
            }
            return temp;
        }
        throw new EmptyStackException();
    }

    public Integer min() {
        return min.peek();
    }

    public Integer max() {
        return max.peek();
    }
}
