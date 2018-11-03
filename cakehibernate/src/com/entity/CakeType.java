package com.entity;

import java.util.HashSet;
import java.util.Set;

public class CakeType {
    private int id;
    private  String name;

    private Set<CakeType> childtype=new HashSet<CakeType>();
    private CakeType pr;
}
