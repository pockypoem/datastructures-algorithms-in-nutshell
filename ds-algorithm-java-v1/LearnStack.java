import java.util.Stack;

public class LearnStack {
    public static void main(String [] args) {
        //declare our stack and instansiated
        Stack<String> stack = new Stack<String>(); //create new object stack named stack too keep it simple

        // System.out.println(stack.empty());
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        //if you want to know what the item that has been popped
        String myFavGame = stack.pop();

        System.out.println(myFavGame);
        System.out.println(stack);
        
        System.out.println(stack.peek()); //to see item at the top of stack without removing it

        //if you want to search item in the stack
        System.out.println(stack.search("FFVII")); //-1 because FFVII has been removed
        System.out.println(stack.search("Borderlands")); //1 from the top
        System.out.println(stack.search("DOOM")); //2 from the top

        // for(int i = 0; i < 1000000000; i++) {
        //     stack.push("Fallout76");
        // } -> it will out of memory exception
    }
}