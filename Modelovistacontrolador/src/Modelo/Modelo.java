/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Lenovo
 */
public class Modelo {
    private int num1;
    private int num2;
    private int resulta;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResulta() {
        return resulta;
    }

    public void setResulta(int resulta) {
        this.resulta = resulta;
    }
    
    public int suma(){
         this.resulta=this.num1* this.num2;
         System.out.println(resulta);
         return this.getResulta();
         
    }
    
}
