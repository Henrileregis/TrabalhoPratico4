package trabpratico4.git;

import java.util.Scanner;

public class Array {
	
	private double arrayA[] = new double[10];
	private double arrayB[] = new double[10]; 
	
	public double[] getArrayA(){
    return this.arrayA;
    }
	
	public double[] getArrayB(){
    return this.arrayB;
    }
	
	public void setArrayA(double x[]){
    this.arrayA = x;
    }
	
	public void setArrayB(double x[]){
    this.arrayB = x;
    }
	
	public void setArraANaPosicao(int x, int y){
    this.arrayA[y] = x;
    }
	
	public void setArraBNaPosicao(int x, int y){
    this.arrayB[y] = x;
    }

	public void calcula(double a, double b) throws ExcecaoDivisaoResultadoZero{
//metodo para informar qual resultado das divisoes 		
		if(b==0){
			throw new ArithmeticException("Não é possível dividir por zero.");
		}else if(a/b==0){
			throw new ExcecaoDivisaoResultadoZero("Resultado divisão foi zero.");
		}      
		
        double c = a/b;
        if (c==0){
        }else{
        System.out.println("Resultado: "+ c);
        }
}
	
	public void CalculaDivisaoArrays() throws ExcecaoDivisaoResultadoZero{
//metodo para calcular divisao dos arrays		
		for(int i=0; i<10 ;i++){
			try{
				calcula(arrayA[i],arrayB[i]);            
			}catch(ArithmeticException | ExcecaoDivisaoResultadoZero ex){
        System.out.println(ex.getMessage());
        }finally{
        System.out.println("A = "+arrayA[i]+" B = "+arrayB[i]);
        }
		}
}
	
	public void DividindoOrganizando() throws ExcecaoDivisaoResultadoZero {
//metodo para dividir e organizar baseado no numero do input  		 	            	        	        		
        	double a[] = new double[10]; 
            double b[] = new double[10];
            
            System.out.println("Por favor digite um numero inteiro de 0 até 9:");    	
        	Scanner sc = new Scanner(System.in);
        	double numerador = sc.nextDouble();
        	
        	if (numerador < 0 || numerador > 9) {
                System.out.println("Este não é um número válido.");
            }        	
        	if (numerador >= 0 && numerador <= 9) {
        		for(int i = 0; i<10; i++){ //vai dividir de 0 até 9
                    a[i] = numerador; 
                    b[i] = i;                                   
            }                                                          
                Array divisoes = new Array();
                divisoes.setArrayA(a);
                divisoes.setArrayB(b);
                divisoes.CalculaDivisaoArrays();                    
            }       	                                                        	    	
	}
            
}	