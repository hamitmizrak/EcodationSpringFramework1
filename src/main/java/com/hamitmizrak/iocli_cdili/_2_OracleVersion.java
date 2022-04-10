package com.hamitmizrak.iocli_cdili;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="iocli")
@ApplicationScoped
public class _2_OracleVersion {

    @Inject
    private _0_IJavaInterface iJavaInterface;


    public String oracleVersionMethod(String data){
        return iJavaInterface.versions(data);
    }
}
