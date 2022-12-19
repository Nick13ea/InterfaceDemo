package com.company.InterfaceDemo;

//pager is super - parent
public interface Pager {
    String abc = "This is abc string";//abc is public static final by default even if we don't write it
    int a = 5;

    //the memory is initialized by classLoader (a part of JVM)
    void ringNotification();
}
