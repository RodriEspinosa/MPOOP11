/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rodrigoespinosa
 */
public class POOP11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        /*File archivo = new File("archivo.txt");
        System.out.println(archivo.exists());
        try {
            boolean seCreo= archivo.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(archivo.exists());
        
        System.out.println("################ FileWriter ################");
        
        try{
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escribe texto para el archivo");
            String texto = br.readLine();
            System.out.println(texto);
            
            
            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw= new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println(texto);
            salida.println("Esta es la segunda linea");
            
            for (int i = 0; i < 10; i++) {
                salida.println("Linea "+i);
            }
            for (int i = 0; i < 10; i++) {
                salida.println("Cargando archivo:"+i*10+"%");
            }
            
            salida.close();
            
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("################ FileReader ################");
        try{
            FileReader fr = new FileReader("archivo.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("############");
            System.out.println("El texto del archivo es:");
            String linea = br.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea = br.readLine();
            }
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("################ StringTokenizer ################");
        String alumnoParseado = "Emiliano,Olayo,Ramirez,321041878,19,3";
        System.out.println(alumnoParseado);
        StringTokenizer tokenizador = new StringTokenizer(alumnoParseado,",");
        while(tokenizador.hasMoreTokens()){
            System.out.println(tokenizador.nextToken());
        }*/
        
        System.out.println("Creamos los alumnos");
        System.out.println("################ ALUMNOS #################");
        ArrayList<Alumno> alumnos = new ArrayList<>();
        Alumno alumno1 = new Alumno("Rodrigo","Espinosa","Ramirez",321140610,19,3);
        Alumno alumno2  = new Alumno("Emiliano","Olayo","Ramirez",321041878,19,3);
        Alumno alumno3 = new Alumno("Abigail","Martinez","Gil",321009700,19,3);
        Alumno alumno4 = new Alumno("Emmanuel", "Lara", "Hernandez", 321009701, 19, 3);
        Alumno alumno5 = new Alumno("Camila Danae", "Martinez", "Martinez", 321321321, 19, 3);
        Alumno alumno6 = new Alumno("Sofia","Galicia","gutierrez",328437846,19,3);
        Alumno alumno7 = new Alumno("Andrea Ameyali","Martinez","martinez",841948742,19,3);
        Alumno alumno8 = new Alumno("Montserrat","Mondragón","Maldonado",831731568,19,3);
        Alumno alumno9 = new Alumno("Paula Ximena","Aranda","Aguilar",327497534,18,2);
        Alumno alumno10 = new Alumno("Christopher Antonio","Gonzales","Gutierrez",126387652,19,3);
        
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);
        alumnos.add(alumno6);
        alumnos.add(alumno7);
        alumnos.add(alumno8);
        alumnos.add(alumno9);
        alumnos.add(alumno10);
        //System.out.println(alumnos);
        System.out.println("Guardamos los alumnos en el archivo archivoAlumno.txt");
        System.out.println("############### FileWriterAlumno ################");
        //Guarda los alumnos en el archivo 
        try{
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            FileWriter fw = new FileWriter("archivoAlumno.csv");
            BufferedWriter bw= new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            for (Alumno alumno : alumnos) {
            salida.println(alumno);
            }
            salida.close();
            
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Leemos los alumnos del mismo archivo");
        System.out.println("################ FileReaderAlumno ################");
        try{
            FileReader fr = new FileReader("archivoAlumno.csv");
            BufferedReader br = new BufferedReader(fr);
            System.out.println("El texto del archivo es:");
            String linea = br.readLine();
            while(linea!=null){
                System.out.println(linea);
                linea = br.readLine();
            }
        }catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Tokenizamos los alumnos");
        System.out.println("################ StringTokenizerAlumno ################");
        String alumnoParseado1 = alumno1.toString();
        StringTokenizer tokenizador1 = new StringTokenizer(alumnoParseado1,",");
        String alumnoParseado2 = alumno2.toString();
        StringTokenizer tokenizador2 = new StringTokenizer(alumnoParseado2,",");
        String alumnoParseado3 = alumno3.toString();
        StringTokenizer tokenizador3 = new StringTokenizer(alumnoParseado3,",");
        String alumnoParseado4 = alumno4.toString();
        StringTokenizer tokenizador4 = new StringTokenizer(alumnoParseado4,",");
        String alumnoParseado5 = alumno5.toString();
        StringTokenizer tokenizador5 = new StringTokenizer(alumnoParseado5,",");
        String alumnoParseado6 = alumno6.toString();
        StringTokenizer tokenizador6 = new StringTokenizer(alumnoParseado6,",");   
        String alumnoParseado7 = alumno7.toString();
        StringTokenizer tokenizador7 = new StringTokenizer(alumnoParseado7,",");  
        String alumnoParseado8 = alumno8.toString();
        StringTokenizer tokenizador8 = new StringTokenizer(alumnoParseado8,",");        
        String alumnoParseado9 = alumno9.toString();
        StringTokenizer tokenizador9 = new StringTokenizer(alumnoParseado9,",");        
        String alumnoParseado10 = alumno10.toString();
        StringTokenizer tokenizador10 = new StringTokenizer(alumnoParseado10,",");
        
        
        System.out.println("Creamos nuevo arreglo y lo inflamos con los alunnos tokenizados");
        ArrayList<String> alumnos1 = new ArrayList<>();
        alumnos1.add(alumnoParseado1);
        alumnos1.add(alumnoParseado2);
        alumnos1.add(alumnoParseado3);
        alumnos1.add(alumnoParseado4);
        alumnos1.add(alumnoParseado5);
        alumnos1.add(alumnoParseado6);
        alumnos1.add(alumnoParseado7);
        alumnos1.add(alumnoParseado8);
        alumnos1.add(alumnoParseado9);
        alumnos1.add(alumnoParseado10);
        System.out.println(alumnos1);
         
        /* 
        while(tokenizador1.hasMoreTokens()){
            System.out.println(tokenizador1.nextToken());
        }
        while(tokenizador5.hasMoreTokens()){
            System.out.println(tokenizador5.nextToken());
        }
        while(tokenizador2.hasMoreTokens()){
            System.out.println(tokenizador2.nextToken());
        }
        while(tokenizador3.hasMoreTokens()){
            System.out.println(tokenizador3.nextToken());
        }
        while(tokenizador4.hasMoreTokens()){
            System.out.println(tokenizador4.nextToken());
        }
        */                             
    }
    
}
