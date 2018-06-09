package com.company;

public class outer {
    private int x = 1;

    public class outerClassTwo {
        private int x = 2;

        public class innerofOUtherTwo extends outer {
            private int x = 3;


            public void print(){
                System.out.println(super.x);
                System.out.println(this.x);
                System.out.println(outerClassTwo.this.x);
                System.out.println(x);
            }
        }


    }


}
