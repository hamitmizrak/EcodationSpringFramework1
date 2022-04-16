package com.hamitmizrak.decorator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

//lombok
@Data
@NoArgsConstructor
@AllArgsConstructor


@Named(value = "decorator_bean")
@ApplicationScoped
public class _3_DecoratorBean {

    @Inject
    private _1_IParagraf paragraf;

    //decoratorMethod
    public String decoratorMethod(String veri) {
        return paragraf.kelime(veri);
    }

}
