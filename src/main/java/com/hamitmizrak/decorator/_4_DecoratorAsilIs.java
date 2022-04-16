package com.hamitmizrak.decorator;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
abstract  public class _4_DecoratorAsilIs implements _1_IParagraf {

    private @Inject @Delegate
    _1_IParagraf paragraf;

   @Override
   public String kelime(String data) {
       System.out.println("Decorator buradaydı !!!! ");
     String fullParagraf=  paragraf.kelime(data);
     if(fullParagraf.equals("beste")){
         fullParagraf=fullParagraf.toUpperCase();
         System.out.println(fullParagraf);
     }
       return fullParagraf;
   }
}
