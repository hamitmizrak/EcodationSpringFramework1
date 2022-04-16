package com.hamitmizrak.aop;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value="aop_interceptor")
@ApplicationScoped
public class _2_AopBean {

    @Inject
    private _1_Login login;

    //bu method sadece sisteme giriş yapmış kişilerin göreceği bir metottur
    public String getAopBeanMethod(){
        return login.isLoginMethod("special information data Secret");
    }


}
