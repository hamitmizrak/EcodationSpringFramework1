package com.hamitmizrak.aop;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import javax.swing.*;

@InterceptorKesici
@Interceptor
public class _3_InterceptorYolKesiciAsilIs {

    //database arama yapacak
    public boolean databaseSearch() {
        System.setProperty("java.awt.headless", "false"); //Disables headless
        //default email: root@gmail.com
        //default şifre: root
        String userEmail, userPassword;
        userEmail = JOptionPane.showInputDialog("Lütfen email giriniz");
        userPassword = JOptionPane.showInputDialog("Lütfen password giriniz");

        if ((userEmail.equals("root@gmail.com")) && (userPassword.equals("root")))
            return true;
        else
            System.out.println("Email veya Şifre yanlıştır");
        return false;
    }

    @AroundInvoke
    public Object isLogin(InvocationContext context) {

        //database böyle bir kullanıcı var mı yok mu ?
        //kullanıcı sisteme kayıtlı değilse ==> boolean isLogin=false;
        //kullanıcı sisteme kayıtlı ise     ==> boolean isLogin=true;
        boolean isLogin = databaseSearch();
        int counter =1;
        while (isLogin == false) {
            System.out.println("Hata giriş sayısı: "+counter);
            isLogin = databaseSearch();
            counter++;
        }


        //Database kullanıcı varsa devam etsin yoksa sisteme giriş yapamazsınız yazsın
        Object isContinue = null;

        //Kullanıcı olup olmamasına göre devam edecek
        if (!isLogin) {
            System.out.println("!!! Dikkat Öncelikle Sisteme kayıt olmalısınız");
            return null;
        } else {
            try {
                System.out.println("*******************************");
                System.out.println("Hoşgeldiniz Sayın : Ferhat");
                System.out.println("Hata giriş sayısı: "+counter);
                isContinue = context.proceed(); //devam etsin
                System.out.println("Method bilgisi: " + context.getMethod().getName());
                System.out.println("Sisteme Giriş yapıldı. " + isContinue);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return isContinue;
    }
}
