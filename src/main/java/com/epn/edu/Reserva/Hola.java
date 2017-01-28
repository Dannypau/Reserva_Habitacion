/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epn.edu.Reserva;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Daniela Ramos
 */
@ManagedBean
public class Hola {

    private String text ;

    public String getText() {
        System.out.println(text);
        return text;
        
    }

    public void setText( String text ) {
        this.text = text;
    }

}
