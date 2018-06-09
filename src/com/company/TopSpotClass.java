package com.company;

public class TopSpotClass {
    private InnerTopSpotClass innerTopSpotClass1;


    public class InnerTopSpotClass extends TopSpotClass{

        public void methodTest(){
            innerTopSpotClass1 = this.new InnerTopSpotClass();

        }



    }
}
