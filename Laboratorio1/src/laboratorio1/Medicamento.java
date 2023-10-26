 package laboratorio1;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Medicamento {

    private int codigoMedicamento;
    private String nombreMedicamento;
    private int costoMedicamento;
    private float precioVenta;
    private int unidadesVendidas;
    private int unidadesExistencia;
    private String fechaCaducidad;
    private int numeroLote;
    private int vigencia;

    public Medicamento(){
        codigoMedicamento = 0;
        nombreMedicamento = "";
        costoMedicamento = 0;
        precioVenta = 0;
        unidadesVendidas = 0;
        unidadesExistencia = 0;
        fechaCaducidad = "12/99";
        numeroLote = 0;
        vigencia = 0;
    }

    public Medicamento(int codigoMedicamento, String nombreMedicamento, int costoMedicamento, int unidadesVendidas, int unidadesExistecia, String fechaCaducidad, int numeroLote, int vigencia) {
        this.codigoMedicamento = codigoMedicamento;
        this.nombreMedicamento = nombreMedicamento;
        this.costoMedicamento = costoMedicamento;
        
        this.unidadesVendidas = unidadesVendidas;
        this.unidadesExistencia = unidadesExistecia;
        this.fechaCaducidad = fechaCaducidad;
        this.numeroLote = numeroLote;
        this.vigencia = vigencia;
    }

    //SETTERS Y GETTERS
    public void setCodigoMedicamento(int codigoMedicamento) {
        this.codigoMedicamento = codigoMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public void setCostoMedicamento(int costoMedicamento) {
        this.costoMedicamento = costoMedicamento;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setUnidadesVendidas(int unidadesVendidas) {
        this.unidadesVendidas = unidadesVendidas;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public void setNumeroLote(int numeroLote) {
        this.numeroLote = numeroLote;
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }

    public void setUnidadesExistencia(int unidadesExistencia) {
        this.unidadesExistencia = unidadesExistencia;
    }
    
    

    public int getCodigoMedicamento() {
        return codigoMedicamento;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public int getCostoMedicamento() {
        return costoMedicamento;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public int getUnidadesVendidas() {
        return unidadesVendidas;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public int getNumeroLote() {
        return numeroLote;
    }

    public int getVigencia() {
        return vigencia;
    }

    public int getUnidadesExistencia() {
        return unidadesExistencia;
    }
    

    //Métodos-----------------------------------------------------------------------
    
    //Método para leer los datos de un medicamento
    public void leerDatos(){ 

       
            
    }
    //Metodo para leer el codigo del medicamento 
    public void leerCodigo(){
        boolean repetir = true;
        Scanner entrada = new Scanner(System.in);
        while (repetir){
            System.out.println("Ingrese el codigo del medicamento. Solo debe contener numeros y debe ser de cuatro digitos 'xxxx'");
            String codigoTemp= entrada.next();
            if (validarCodigo(codigoTemp)){
                setCodigoMedicamento(Integer.parseInt(codigoTemp));
                repetir = false;
            } 
            System.out.println("\u001B[2J");
        }
    }
    //Metodo para validar el codigo del medicamento 
    public boolean validarCodigo(String codigo){
        if (!codigo.matches("^[0-9]+$")){
            System.out.println("Error! El codigo del medicamento debe ser un numero  de cuatro digitos 'xxxx'");
            System.out.println("Usted ingreso " + codigo);
        } 
        else if(Integer.parseInt(codigo) < 1000 || Integer.parseInt(codigo) > 9999){
            System.out.println("Error! El codigo del medicamento debe ser de cuatro digitos 'xxxx'. Usted ingreso " + codigo);
        } else {
            return true;
        }
        return false;
    }
    //Metodo para leer el nombre del medicamento
    public void leerNombre(){
        boolean repetir = true;
        Scanner entrada = new Scanner(System.in);
        while (repetir){
            System.out.println("Ingrese el nombre del medicamento. No debe tener mas de 50 caracteres");
            String nombreTemp= entrada.next();
            if (validarNombre(nombreTemp)){
                setNombreMedicamento(nombreTemp);
                repetir = false;
            } 
            System.out.println("\u001B[2J");
        }
    }
    //Método para validar el nombre del medicamento
    public boolean validarNombre(String nombre){
        if (!nombre.isEmpty()){
            if (nombre.length() <= 50){
                return true;   
            }else {
                System.out.println("El nombre del medicamento no puede tener mas de 50 caracteres. Usted ingreso " + nombre + " y " + nombre.length() + " caracteres.");
            }
        } else {
            System.out.println("El nombre del medicamento no puede estar vacio");  
        }
        return false;
    }
    
    //Metodo para leer el costo del medicamento
    public void leerCosto(){
        boolean repetir = true;
        Scanner entrada = new Scanner(System.in);
        while (repetir){
            System.out.println("Ingrese el costo del medicamento. Solo debe contener numeros y debe ser mayor que cero ");
            String costoTemp= entrada.next();
            if (validarCosto(costoTemp)){
                setCostoMedicamento(Integer.parseInt(costoTemp));
                repetir = false;
            } 
            System.out.println("\u001B[2J");
        }
    }
    
    //Método para validar el costo del medicamento
    public boolean validarCosto(String costo){
        if (!costo.matches("^[0-9]+$")){
            System.out.println("Error! El costo del medicamento debe ser un numero.");
            System.out.println("Usted ingreso " + costo);
        } else if (Integer.parseInt(costo) > 0){
            return true;
        } else {
            System.out.println("El costo del medicamento debe ser mayor que cero. Usted ingreso: " + costo);
        }
        return false;
    }

    //Metodo para leer las unidades vendidas del medicamento
    public void leerUnidadesVendidas(){
        boolean repetir = true;
        Scanner entrada = new Scanner(System.in);
        while (repetir){
            System.out.println("Ingrese el numero de unidades vendidas del medicamento. Solo debe contener numeros y debe ser menor o igual a las Unidades en Existencia. ");
            String unidadesVendidasTemp= entrada.next();
            if (validarUnidadesVendidas(unidadesVendidasTemp)){
                setUnidadesVendidas(Integer.parseInt(unidadesVendidasTemp));
                repetir = false;
            } 
            System.out.println("\u001B[2J");
        }
    }
    
    //Método para validar el numero de unidades vendidas del medicamento
    public boolean validarUnidadesVendidas(String unidadesVendidas){
        if (!unidadesVendidas.matches("^[0-9]+$")){
            System.out.println("Error! El numero de unidades vendidas del medicamento debe ser un numero");
            System.out.println("Usted ingreso " + unidadesVendidas);
        } else if (Integer.parseInt(unidadesVendidas) <= getUnidadesExistencia()){
            return true;
        } else {
            System.out.println("Error! El numero de unidades vendidas del medicamento debe ser menor o igual a las unidades en existencia. Usted ingreso. Usted ingreso: " + unidadesVendidas);
        }
        return false;
    }

    public void leerUnidadesExistecia(){
        boolean repetir = true;
        Scanner entrada = new Scanner(System.in);
        while (repetir){
            System.out.println("Ingrese el numero de unidades en existencia. Debe ser un numero mayor o igual a cero. ");
            String unidadesVendidasTemp= entrada.next();
            if (validarUnidadesExistencia(unidadesVendidasTemp)){
                setCostoMedicamento(Integer.parseInt(unidadesVendidasTemp));
                repetir = false;
            } 
            System.out.println("\u001B[2J");
        }
    }

    //Método para validar el numero de unidades en existencia del medicamento
    public boolean validarUnidadesExistencia(String unidadesExistencia){
        if (!unidadesExistencia.matches("^[0-9]+$")){
            System.out.println("Error! El numero de unidades vendidas del medicamento debe ser un numero");
            System.out.println("Usted ingreso " + unidadesExistencia);
        } else if (Integer.parseInt(unidadesExistencia) >= 0){
            return true;
        } else {
            System.out.println("El numero de unidades en existencia del medicamento debe ser mayor o igual a cero. Usted ingreso " + unidadesExistencia);
        }
        return false;
    }

    //Metodo para leer la fecha de caducidad del medicamento
    public void leerFechaCaducidad(){
        boolean repetir = true;
        Scanner entrada = new Scanner(System.in);
        while (repetir){
            System.out.println("Ingrese la fecha de caducidad del medicamento. Debe tener el formato mes/año. ");
            String fechaCaducidadTemp= entrada.next();
            if (validarFechaCaducidad(fechaCaducidadTemp)){
                setFechaCaducidad(fechaCaducidadTemp);
                repetir = false;
            } 
            System.out.println("\u001B[2J");
        }
    }

    //Método para verificar la fecha de vencimiento
    public boolean validarFechaCaducidad(String fecha){
        if ((fecha.length() == 7) && (fecha.charAt(2)=='/')){
            String fechaPC = fechasActual();
            int mesPC = extraerMes(fechaPC);
            int anoPC = extraerAno(fechaPC);
            int mes = extraerMes(fecha);
            int ano = extraerAno(fecha);
            if (anoPC > ano){
                System.out.println("Error! Su medicamento esta caducado. El año de caducidad del medicamento debe ser mayor o igual al año actual.");
                System.out.println("Usted ingreso: " + fecha + " y el año actual es: " + fechaPC);
            } else if (anoPC == ano){
                if (mesPC > mes){
                    System.out.println("Error! Su medicamento esta caducado. El mes de caducidad del medicamento debe ser mayor al mes actual." );
                    System.out.println("Usted ingreso: " + fecha + " y el año actual es: " + fechaPC);
                } else if (mesPC == mes){
                    System.out.println("Error! El mes de caducidad del medicamento debe ser mayor o igual al mes actual.");
                    System.out.println("Usted ingreso: " + fecha + " y el año actual es: " + fechaPC);
                } else {
                    return true;
                }
            } else if (anoPC < ano){
                return true;
                
            } else {
        
            }
        } else {
            return false;
        }

        return false;
    }

    public int extraerMes(String fecha){
        String mes = fecha.substring(0,2);
        if(validarMes(mes)){
        int numMes = Integer.parseInt(mes);
        return numMes;
        }
    }

    public boolean validarMes(String mes){
        if (!mes.matches("^[0-9]+$")){
            System.out.println("Error! El mes debe ser un numero");
            System.out.println("Usted ingreso " + mes);
        } else if (Integer.parseInt(mes) < 1 || Integer.parseInt(mes) > 12){
            System.out.println("Error! El mes debe estar entre 1 y 12. Usted ingreso " + mes);
        }
        else {
            return true;
        }
        return false;
    }
    
    public int extraerAno(String fecha){
        String ano = fecha.substring(3,7);
        int numAno = Integer.parseInt(ano);
        return numAno;
    }

    public boolean validarAno(String ano){
        if (!ano.matches("^[0-9]+$")){
            System.out.println("Error! El año debe ser un numero");
            System.out.println("Usted ingreso " + ano);
        } else if (Integer.parseInt(ano) < 0 || Integer.parseInt(ano) > 9999){
            System.out.println("Error! El año debe estar entre 0 y 9999. Usted ingreso " + ano);
        }
        else {
            return true;
        }
        return false;
    }

    //Metodo para leer numero de lote del medicamento
    public void leerNumeroLote(){
        boolean repetir = true;
        Scanner entrada = new Scanner(System.in);
        while (repetir){
            System.out.println("Ingrese el numero de lote del medicamento. Solo debe contener numeros y debe ser mayor que cero y menor que 9999. ");
            String numeroLoteTemp= entrada.next();
            if (validarNumeroLote((numeroLoteTemp))){
                setNumeroLote(Integer.parseInt(numeroLoteTemp));
                repetir = false;
            } 
            System.out.println("\u001B[2J");
        }
    }
    //Método para validar el numero de lote del medicamento
    public boolean validarNumeroLote(String numeroLote){
        if (!numeroLote.matches("^[0-9]+$")){
            System.out.println("Error! El numero de lote del medicamento debe ser un numero");
            System.out.println("Usted ingreso " + numeroLote);
        } else if (Integer.parseInt(numeroLote) < 0 || Integer.parseInt(numeroLote) > 9999){
            System.out.println("Error! El numero de lote del medicamento debe ser mayor que cero y menor que 9999. Usted ingreso " + numeroLote);
        }
        else {
            return true;
        }
        return false;
    }
    //Metodo para leer la vigencia del medicamento
    public void leerVigencia(){
        boolean repetir = true;
        Scanner entrada = new Scanner(System.in);
        while (repetir){
            System.out.println("Ingrese la vigencia del medicamento. Debe ser un numero entre 0 y 2. ");
            String vigenciaTemp= entrada.next();
            if (validarVigencia(vigenciaTemp)){
                setVigencia(Integer.parseInt(vigenciaTemp));
                repetir = false;
            } 
            System.out.println("\u001B[2J");
        }
    }
    //Método para validar la vigencia del medicamento
    public boolean validarVigencia(String vigencia){
       if (!vigencia.matches("^[0-9]+$")){
            System.out.println("Error! La vigencia del medicamento debe ser un numero");
            System.out.println("Usted ingreso " + vigencia);
        } else if (Integer.parseInt(vigencia) < 0 || Integer.parseInt(vigencia) > 9999){
            System.out.println("Error! El numero de lote del medicamento debe ser mayor que cero y menor que 9999. Usted ingreso " + numeroLote);
        }
        else {
            return true;
        }
        return false;
    }
    
    // Método para verificar si hay existencia del medicamento
    public boolean verificarExistencia(int unidadesVendidas){
        if (unidadesVendidas <= getUnidadesExistencia()){
            return true;
        } else {
            return false;
        }
    }


    //Método para calcular el precio a pagar
    public void precioAPagar(int porcentaje){
        float aumento = getPrecioVenta()*(porcentaje/100);
        setPrecioVenta(getPrecioVenta()+aumento);
    }
    //Método para calcular el precio de venta 
    public void calcularPrecio(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el porcentaje ");
        int porcentaje = entrada.nextInt();
        if (validarPorcentaje(porcentaje)){
            precioAPagar(porcentaje);
        }  
    }
    //Método para validar el porcentaje de 
    public boolean validarPorcentaje(int porcentaje){
        if (porcentaje >= 20){
            return true;    
        }
        return false ;
    }
    
    public void determinarVencido(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la fecha de hoy");
        String fecha = entrada.nextLine();
        if (validarFechaCaducidad(fecha)){
            estaVencido(fecha);
        }                                                   
    }
    
    public boolean estaVencido(String fecha){
            if (extraerAno(fecha) > extraerAno(getFechaCaducidad())){
                return true;
            } else {
                if (extraerAno(fecha) == extraerAno(getFechaCaducidad())){
                    if (extraerMes(fecha) > extraerMes(getFechaCaducidad())){
                        return true;
                    } else {
                        return false;
                    }
                }
            
            
            }
        return false;
    }
    void retirarlote(int numeroLoteRetirar){
        if (numeroLoteRetirar == getNumeroLote()){
            setVigencia(2);
        }
    }


    public boolean colocarOferta() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una fecha");
        String fecha = entrada.nextLine();
        if (validarFechaCaducidad(fecha)) {
            if (extraerAno(fecha) == extraerAno(getFechaCaducidad())) {
                if ( extraerMes(getFechaCaducidad()) - extraerMes(fecha)== 3) {
                    float descuento = (float) (getPrecioVenta() * 0.3);
                    setPrecioVenta(getPrecioVenta() - descuento);
                    return true;
                } else {
                    System.out.println("No aplica para la oferta");
                    return false;
                }
            } else {
                System.out.println("No aplica para la oferta");
                return false;
            }
        } else {
            return false; 
        }
    }
    
    public boolean reponerInventario(){
        if(getUnidadesExistencia()<5){
            return true;
        } else {
            return false;
        }
    }


public void mostrarInformacion() {
    // Obtener los valores de los atributos
    int codigoMedicamento = getCodigoMedicamento();
    String nombreMedicamento = getNombreMedicamento();
    int costoMedicamento = getCostoMedicamento();
    float precioVenta = getPrecioVenta();
    int unidadesVendidas = getUnidadesVendidas();
    int unidadesExistencia = getUnidadesExistencia();
    String fechaCaducidad = getFechaCaducidad();
    int numeroLote = getNumeroLote();
    int vigencia = getVigencia();

    // Mostrar la información
    System.out.println("Codigo del medicamento: " + codigoMedicamento);
    System.out.println("Nombre del medicamento: " + nombreMedicamento);
    System.out.println("Costo del medicamento: " + costoMedicamento);
    System.out.println("Precio de venta del medicamento: " + precioVenta);
    System.out.println("Unidades vendidas del medicamento: " + unidadesVendidas);
    System.out.println("Unidades en existencia del medicamento: " + unidadesExistencia);
    System.out.println("Fecha de caducidad del medicamento: " + fechaCaducidad);
    System.out.println("Numero de lote del medicamento: " + numeroLote);
    System.out.println("Vigencia del medicamento: " + vigencia);
    System.out.println("----------------------------------------------------------------------------");
}            

    public String fechasActual(){
        long millis = System.currentTimeMillis();

        Date fecha = new Date(millis);

        SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy");
        String fechaFormateada = sdf.format(fecha);
        return fechaFormateada;
    }
    
}
    
