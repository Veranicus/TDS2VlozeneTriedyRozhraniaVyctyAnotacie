package com.company;

import java.util.Iterator;

public class LokalneVnutorneTried   {


    private int i = 1;
    private static float f = 1;

    public Iterator metoda(final int a ){

        final String s = "abc";

        class InnerLocal{
             final int k = 44;
            public InnerLocal(){

            }

            public void iterate(){
                int m = i + k;
                float z = LokalneVnutorneTried.f + a++;
                String t = s.trim();
                s = "fds";
            }
        }
    }


}
