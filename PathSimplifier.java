import java.util.Stack;

class PathSimplifier {
    /**
     * TO-DO: Simplify a Unix-style file path.
     * For example, "/a/./b/../../c/" should become "/c".
     * And "/../" should become "/".
     \*
     * @param path The absolute path string.
     * @return The simplified canonical path.
     */
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        // Your code here:
        // Iterate through the 'components'.
        // Use if/else is to handle "..", ".", and regular directory names.
        for(String s: components){

           if (!stack.isEmpty()&&s.equals("..")) stack.pop();
           else if(!s.equals(".")&& !s.isEmpty()) stack.push(s);
        }
        if (stack.isEmpty()) {
            return "/";
        }

        // Your code here:
        // Use a StringBuilder to join the elements in the stack
        // to form the final path string (e.g., "/dir1/dir2").
        StringBuilder filePath= new StringBuilder("/");
        while (stack.size()>1)
            filePath.insert(0,"/"+stack.pop());
        filePath.insert(filePath.length(),stack.pop());
        return filePath.toString(); // Placeholder
    }
}