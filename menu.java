import java.util.Scanner;
 
public class menu {
 
     
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       int opcion;
       String numero;
       int opcion2;
       int diagonal;
       
       while (true) {
            
           System.out.println("1. Escribe 1 si quieres calcular el cuadrado");
           System.out.println("2. Escribe 2 si quieres calcular el circulo");
           System.out.println("3. Escribe 3 si quieres salir");
           System.out.println("Escribe una de las opciones");
           opcion = scan.nextInt();
           
           switch (opcion) { 
           
           case 1: 
        	   System.out.println("Cuanto mide el lado de tu cuadrado?");
        	   Scanner scann = new Scanner(System.in);
        	   numero= scann.nextLine();
        	   String res = numero;
        	   int medida = Integer.parseInt(res);
        	   cuadrado c = new cuadrado(medida);
        	   System.out.println("La longitud del lado es " + c.numero);
        	   while (true) {
        	   System.out.println("1. Escribe 1 si quieres calcular la diagonal");
        	   System.out.println("2. Escribe 2 si quieres calcular el perimetro");
        	   System.out.println("3. Escribe 3 si quieres calcular el area");
        	   System.out.println("4. Escribe 4 si quieres salir");
        	   opcion2= scan.nextInt();
        	
        	   switch (opcion2) {
        	   
        	   case 1:
        		   System.out.println("La diagonal es: "+c.diagonal());
        		   break;
        	   case 2:
        		   System.out.println("El perimetro es: "+c.perimetro());
        		   break;
        	   case 3:
        		   System.out.println("El area es: "+c.area());
        		   break;
        	   case 4:
        		   System.out.println("saliendo...");
        		   System.exit(0);
        		   default:
        			   System.out.println("Valor incorrecto, porfavor ingrese un valor correcto");
        	   }
        	  
        	 }
           case 2: 
        	   System.out.println("Cuanto mide el radio?");
        	   Scanner scan_2 = new Scanner(System.in);
        	   numero= scan_2.nextLine();
        	   String med = numero;
        	   int medida_2 = Integer.parseInt(med);
        	   Circulo cir = new Circulo(medida_2);
        	   System.out.println("La longitud del radio es " + cir.id);
        	   while (true) {
        	   System.out.println("1. Escribe 1 si quieres calcular la circunferencia");
        	   System.out.println("2. Escribe 2 si quieres calcular el area");
        	   System.out.println("3. Escribe 3 si quieres salir");
        	   opcion2= scan.nextInt();
        	
        	   switch (opcion2) {
        	  
        	   case 1:
        		   System.out.println("La circunferencia es: "+cir.circunferencia());
        		   break;
        	   case 2:
        		   System.out.println("El area es: "+cir.area());
        		   break;
        	   case 3:
        		   System.out.println("saliendo...");
        		   System.exit(0);
        		   default:
        			   System.out.println("Valor incorrecto, porfavor ingrese un valor correcto");
        	   }
        	  
        	 }
           case 3:
        	   System.out.println("saliendo...");
    		   System.exit(0);
        	   
        	   default:
        		   System.out.println("Valor incorrecto, porfavor ingrese un valor correcto");
        	         	 
      }
}
}
}


           
            
       
     