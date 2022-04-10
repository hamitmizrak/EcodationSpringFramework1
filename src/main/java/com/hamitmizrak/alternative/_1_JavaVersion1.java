package com.hamitmizrak.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class _1_JavaVersion1 implements _0_IJavaInterface {

    @Override
    public String versions(String data) {
        return "Sürüm1 : "+data;
    }
}
