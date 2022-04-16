package com.hamitmizrak.aop;


import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.swing.*;
import java.util.Scanner;

@InterceptorKesici
@Interceptor
public class _3_InterceptorYolKesiciAsilIs {

    //database arama yapacak
    public boolean databaseSearch(String userEmail,String userPassword){
        //default email: root@gmail.com
        //default şifre: root
        if(  (userEmail.equals("root@gmail.com"))  && (userPassword.equals("root"))  )
           return false;
        else
            System.out.println("Email veya Şifre yanlıştır");
            return true;
    }

    @AroundInvoke
    public Object isLogin(InvocationContext context) {

        //database böyle bir kullanıcı var mı yok mu ?
        //kullanıcı sisteme kayıtlı değilse ==> boolean isLogin=true;
        //kullanıcı sisteme kayıtlı ise     ==> boolean isLogin=false;

        //kullanıcı sisteme kayıtlı ise false
        String email="root44@gmail.com",password="root";
        boolean isLogin=databaseSearch(email,password);

        //Database kullanıcı varsa devam etsin yoksa sisteme giriş yapamazsınız yazsın
        Object isContinue=null;

        //Kullanıcı olup olmamasına göre devam edecek
        if(isLogin){
            System.out.println("!!! Dikkat Öncelikle Sisteme kayıt olmalısınız");
            return null;
        }else{
            try {
                isContinue=  context.proceed(); //devam etsin
                System.out.println("Method bilgisi: "+context.getMethod().getName());
                System.out.println("Hoşgeldiniz Sayın : Ferhat");
                System.out.println("Sisteme Giriş yapıldı. "+isContinue);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return isContinue;
    }
}
