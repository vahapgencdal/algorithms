package com.singleton;

public class Eager {

        private static final Eager instance = new Eager();

        private Eager(){}

        public static Eager getInstance(){
            return instance;
        }

}