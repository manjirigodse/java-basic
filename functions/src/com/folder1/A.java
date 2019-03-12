package com.folder1;

/**
 * Created by ritesh on 12/3/19.
 */


public class A {

    // 1 - Public -> access specifier -> public (Accessible everywhere), private (Within the class),
    //                                   protected (Only inherited classes), default (Winthin the package)
    // 2 - static -> access modifier -> hold -> method belongs to class and can be accessed by classname.
    // 3 - void   -> return type -> int, float, char, all inbuild dataTypes and custom classes.
    // 4 - Function name -> any string in camelCase.
    // 5 - arguments list -> comma separated list -> Syntax (<dataType> varName)

    //1    2     3     4   5
    public static void main(String[] args) {
        System.out.println("First arg: " + args[0]);
        System.out.println("Second arg: " + args[1]);
    }

    /** Naming conventions
     * Variable : camelCase
     * methodName : camelCase
     * class : PascalCase
     * keywords : small
     * package : small without underscore.
     * constants : FULL_CAPS
     */
}