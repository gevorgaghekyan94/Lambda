package com.company;

public class LambdaArgument {

    static String changeString(StringFunc sf, String s) {
        return sf.func(s);
    }
}
