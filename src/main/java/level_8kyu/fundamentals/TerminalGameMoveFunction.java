package level_8kyu.fundamentals;
/*
Terminal game move function
In this game, the hero moves from left to right.
The player rolls the dice and moves the number of spaces indicated by the dice two times.
Create a function for the terminal game that takes the current position of the hero and the roll (1-6) and return the new position.
    Example:
    move(3, 6) should equal 15
*/
public class TerminalGameMoveFunction {

    public static void main(String[] args) {
        System.out.println("8 = " + move(0, 4));
        System.out.println("15 = " + move(3, 6));
        System.out.println("12 = " + move(3, 6));
    }

//----------------------------------------------------------------------------------------------------------------------
    public static int move(int position, int roll) {
        return roll * 2 + position;
    }
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

}

