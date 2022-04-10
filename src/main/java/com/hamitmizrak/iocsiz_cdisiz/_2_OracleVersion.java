package com.hamitmizrak.iocsiz_cdisiz;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value="iocsiz")
@ApplicationScoped
public class _2_OracleVersion {

    private _1_JavaVersion javaVersion;

    public _2_OracleVersion() {
        javaVersion=new _1_JavaVersion();
    }

    public String oracleVersionMethod(String data){
        return javaVersion.versions(data);
    }
}
