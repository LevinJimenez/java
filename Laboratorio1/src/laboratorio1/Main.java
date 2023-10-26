package laboratorio1;

import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Main{

    public static void main(String[] args){
        
        System.out.println(" Bienvenido al sistema de gestion de medicamentos             ");
        int opcion;
        System.out.println ("----------------------------------------------------------------------------");
        Scanner entrada = new Scanner(System.in);
        Medicamento medicamento1 = new Medicamento();
        Medicamento medicamento2 = new Medicamento(1441, "Acetaminofen", 5000, 100, 1000, "12/22" , 200, 1);
        Medicamento medicamento3 = new Medicamento(1212, "Paracetamol", 4444, 102, 144, "11/22" , 444, 1);
        do{
        System.out.println("1. Generar un nuevo medicamento");
        System.out.println("2. Consultar medicamentos existentes");
        System.out.println("3. Consultar medicamento con oferta en sus precios");
        System.out.println("4. Notificaciones");
        System.out.println("0.Salir");
        opcion = entrada.nextInt();
        //System.out.println("\u001B[2J");
        switch(opcion){
            case 1: 
                
                medicamento1.leerDatos();
                /*medicamento2.leerDatos();
                medicamento3.leerDatos();*/
                break;
            case 2:
                System.out.println("Los medicamentos existentes son: ");  
                medicamento1.mostrarInformacion();
                medicamento2.mostrarInformacion();
                medicamento3.mostrarInformacion();
                break;
            case 3:
                if (medicamento1.colocarOferta() == true){
                    System.out.println("El medicamento " + medicamento1.getNombreMedicamento() + " esta en oferta");}
                if (medicamento2.colocarOferta() == true){
                    System.out.println("El medicamento " + medicamento2.getNombreMedicamento() + " esta en oferta");}
                if (medicamento3.colocarOferta() == true){
                    System.out.println("El medicamento " + medicamento3.getNombreMedicamento() + " esta en oferta");
                } else {
                            System.out.println("No hay medicamentos en oferta");
                        }
                    
                
                break;
                
            case 4: 
                if (medicamento1.reponerInventario() == true){
                    System.out.println("Atencion! Se debe reponer inventario, quedan menos de 5 unidades de" + medicamento1.getNombreMedicamento() + ".");
                    System.out.println("Actualmente quedan " + medicamento1.getUnidadesExistencia() + " de " + medicamento1.getNombreMedicamento() + ".");}
                if (medicamento2.reponerInventario() == true){
                        System.out.println("Atencion! Se debe reponer inventario, quedan menos de 5 unidades de" + medicamento2.getNombreMedicamento() + ".");
                        System.out.println("Actualmente quedan " + medicamento2.getUnidadesExistencia() + " de " + medicamento2.getNombreMedicamento() + ".");}
                if (medicamento3.reponerInventario() == true){
                            System.out.println("Atencion! Se debe reponer inventario, quedan menos de 5 unidades de" + medicamento3.getNombreMedicamento() + ".");
                            System.out.println("Actualmente quedan " + medicamento3.getUnidadesExistencia() + " de " + medicamento3.getNombreMedicamento() + ".");
                        } else {
                            System.out.println("No hay notificaiones");
                        }
                    
                                    

            
                break;
            default:
                break;  

            }

        }while(opcion!=0);
    }
    
}
