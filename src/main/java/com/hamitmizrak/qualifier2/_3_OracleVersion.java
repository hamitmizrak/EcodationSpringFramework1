package com.hamitmizrak.qualifier2;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="qualifer_enum")
@ApplicationScoped
public class _3_OracleVersion {

 //   default
//    @Inject
//    private _0_IJavaInterface iJavaInterface;

    @Inject
    @QualifierMultiple(EFazlaSecenek.IKINCI)
    private _0_IJavaInterface iJavaInterface;


    public String oracleVersionMethod(String data){
        return iJavaInterface.versions(data);
    }
}
