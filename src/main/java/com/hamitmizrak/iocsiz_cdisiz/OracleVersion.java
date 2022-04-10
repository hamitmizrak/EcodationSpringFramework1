package com.hamitmizrak.iocsiz_cdisiz;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value="iocsiz")
@ApplicationScoped
public class OracleVersion {

    private JavaVersion javaVersion;

    public OracleVersion() {
        javaVersion=new JavaVersion();
    }

    public String oracleVersionMethod(String data){
        return javaVersion.versions(data);
    }
}
