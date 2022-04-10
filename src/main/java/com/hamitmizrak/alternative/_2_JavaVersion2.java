package com.hamitmizrak.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class _2_JavaVersion2 implements _0_IJavaInterface {


    @Override
    public String versions(String data) {
        return "Sürüm2: "+data;
    }
}
