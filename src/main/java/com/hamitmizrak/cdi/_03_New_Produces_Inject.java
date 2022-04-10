package com.hamitmizrak.cdi;
import lombok.*;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;


//lombok
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Named(value = "new_produces_inject_cdi")
@ApplicationScoped
public class _03_New_Produces_Inject {


    //üreten
    @Produces
    public String getUreten( @New StudentDto studentDto) {
        studentDto=StudentDto.builder().adi("Java Student").build();
        return studentDto.getAdi();
    }

    //tüketim
    @Inject
    @Getter
    String getTuketen;

}
