package com.hamitmizrak.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="alternative")
@ApplicationScoped
public class _3_OracleVersion {

    @Inject
    private _0_IJavaInterface iJavaInterface;


    public String oracleVersionMethod(String data){
        return iJavaInterface.versions(data);
    }
}
