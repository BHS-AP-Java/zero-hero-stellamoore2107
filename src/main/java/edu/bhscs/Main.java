// Stella Moore
// P2
// Zerohero
// 9/15/25

/*
 * DESCRIPTION: Whatever Mr. Reiber says
 * INPUT: I don't know what that means yet
 * OUTPUT: I don't know what that means yet either
 * EDGE CASE: Everything is an edge case right now
 */

package edu.bhscs;

class Main{

    public static final char A = 'a';
    public static final char B = 'b';

    public static void main(String[] args){
        int someNumber = 67;
        int otherNumber = 27;

        System.out.println("67!" + A + someNumber);
        System.out.println(A + "?" + A + someNumber);
        System.out.println(A + A + someNumber);
        System.out.println();
        System.out.println("this is neet");
        System.out.println();
        System.out.println(B + otherNumber + B);
        System.out.println();
        System.out.println("OK I am done");
    }
}

// What is strange about this program is that sometimes when char and int variables are
// combined, instead of printing next to each other as expected, they add together to create a
// larger number.