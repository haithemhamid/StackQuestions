import java.util.Stack;

class StackManipulator {
    /**
     * TO-DO: Remove and return the element at the bottom of the stack.
     * The rest of the elements must be put back in their original order.
     \*
     * @param stack The stack to modify.
     * @return The integer element from the bottom of the stack.
     */
    public Integer removeBottomElement(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return null;
        }

        Stack<Integer> tempStack = new Stack<>();

        // Your code here: Move elements from 'stack' to 'tempStack'.
        while (stack.size()>1)
            tempStack.push(stack.pop());
        // Your code here: Pop the bottom element from 'tempStack'.
        Integer bottomElement = stack.pop();
        // Your code here: Move elements back from 'tempStack' to 'stack'.
        while (!tempStack.isEmpty())
            stack.push(tempStack.pop());
        return bottomElement;
    }
}