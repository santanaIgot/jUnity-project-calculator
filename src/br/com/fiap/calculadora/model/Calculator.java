package br.com.fiap.calculadora.model;

public class Calculator {

//    int numero1 ;
//    int numero2;

    int resultado;



    public int getResultado() {
        return resultado;
    }



    public void setResultado(int resultado) {
        this.resultado = resultado;
    }


    public int soma(int numero1, int numero2){

       resultado = numero1 + numero2;


        return resultado;
    }


    public int subtration(int numero1, int numero2 ){
        resultado = numero1 - numero2;

        return resultado;
    }

    public  int division(int  numero1,int numero2){
        resultado = numero1 / numero2;

        return resultado;
    }

    public  int multiply(int  numero1,int numero2){
        resultado = numero1 * numero2;

        return resultado;
    }






}
