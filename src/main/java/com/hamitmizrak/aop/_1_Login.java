package com.hamitmizrak.aop;

//AOP: CDI normalde iki class arasına giriş yapılmasına izin verilmez ancak AOP izin verir
//interceptor: iki class arasına keskin bir şekilde bağlanmayı amaçlar
@InterceptorKesici
public class _1_Login {

    //public bir sayfa herkes görebilir.
    public String isLoginMethod(String data){
        return "isLogin: "+data;
    }
}
