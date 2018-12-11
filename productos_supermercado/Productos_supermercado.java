/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos_supermercado;

import java.util.Scanner;

/**
 *
 * @author jeansoto
 */
public class Productos_supermercado {
    
        static Scanner sc = new Scanner(System.in);
        
        
        //Variables globales - Temporales 
        public static int cont_arreglo_productos=0;
        public static String resp_usuario = "s";
        public static String _cod ="";
        public static String _cant ="";
        public static String _nom ="";
        public static String _costo ="";
        public static String _precio ="";
        public static String _productos [] = new String [10];
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        while(resp_usuario.equals("s")){
            
            System.out.println("#######################");
            System.out.println("####BIENVENIDO PERRO###");
            System.out.println("#######################");
            
            String resp_menu_interno="";
            
            System.out.println("a) Ingresar producto");
            System.out.println("b) Mostrar elemento especifico");
            System.out.println("c) Imprimir lista de productos");
            
            resp_menu_interno = sc.next();
            
            
            switch(resp_menu_interno){
                
                case "a":{
                    
                     System.out.println("Ingrese codigo");
                    _cod = sc.next();
                    sc.nextLine();
                    System.out.println("Ingrese Nombre");
                    _nom = sc.next();
                    sc.nextLine();
                    System.out.println("Ingrese Costo");
                    _costo = sc.next();
                    sc.nextLine();
                    System.out.println("Ingrese Precio");
                    _precio = sc.next();
                    sc.nextLine();
                    System.out.println("Ingrese Cantidad");
                    _cant = sc.next();
                    sc.nextLine();

                    System.out.println("###########");
                    System.out.println("codigo   "+_cod);
                    System.out.println("nombre   "+_nom);
                    System.out.println("costo    "+_costo);
                    System.out.println("precio   "+_precio);
                    System.out.println("cantidad "+_cant);

                    String producto_temporal = _cod+","+_nom+","+_costo+","+_precio+","+_cant;
                    
                    System.out.println("#############");
                    System.out.println(producto_temporal);

                    _productos [cont_arreglo_productos] =producto_temporal;
                    
                    cont_arreglo_productos ++;
                    System.out.println("Deberia agregarlo al array");


                    
                    break;
                }//fin case a
                
                case "b":{
                    
                    String cod_producto ="";
                    System.out.println("Ingrese codigo del producto");
                    cod_producto = sc.next();
                    
                    for (int i = 0; i < (_productos.length-1) ; i++) {
                        String temporal = _productos[i];
                        String [] temporal_div = temporal.split(",");
                        System.out.println("Codigo ---"+temporal_div[0]);
                    }
                    
                    
                    
                    break;
                
                }//fin case b
                
                case "c":{
                    
                
                    for (int i = 0; i < (_productos.length-1) ; i++) {
                       
                      
                        if (_productos[i] != null) {
                        System.out.println(i+"  "+_productos[i]);
                        }

                    }//fin del for 
                    break;

                }
                
            
            }//fin switch case 
            
            System.out.println("Desea seguir en el sistema [s/n]");
            resp_usuario = sc.next();
            
        }//fin while con respuesta de usuario 
       
        
        System.out.println("#######FIN EXITOSO#########");
        
        
    }
    
}
