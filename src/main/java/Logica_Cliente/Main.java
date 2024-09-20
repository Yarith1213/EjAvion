/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperImpresion;
import Logica_Negocio.Ala;
import Logica_Negocio.Avion;
import Logica_Negocio.Fuselaje;
import Logica_Negocio.Llanta;
import Logica_Negocio.Motor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1063434092
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
       
        Avion objAvion;
        Ala ala;
        Fuselaje fuselaje;
        Llanta llanta;
        Motor motor;
        ArrayList<Ala> listaalas = new ArrayList<>();
        ArrayList<Llanta> listallantas = new ArrayList<>();
        ArrayList<Motor> listmotor = new ArrayList<>();

        //Para el ala
        String posicion_ala, tamaño_ala;
        //Para el fuselaje
        String nombre_fuse;
        //Para Llanta
        String tamaño_llanta, marca;
        //Para motor
        String tamaño_motor, id_motor, posicion_motor;
        //Para avion
        String avion_marca;
       
        System.out.println("Digite la marca del avion");
        avion_marca = scan.nextLine();

        //Para el fuselaje
        System.out.println("Digite el tipo de fuselaje del avion");
        nombre_fuse = scan.nextLine();
       
        fuselaje = new Fuselaje(nombre_fuse);

        //Para el ala
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite la posicion del ala " + (i + 1));
            posicion_ala = scan.nextLine();
            System.out.println("Digite el tamaño del ala" + (i + 1));
            tamaño_ala = scan.nextLine();
            ala = new Ala(posicion_ala, tamaño_ala);
            listaalas.add(ala);
           
        }
        //Para la llanta
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite la marca de la llanta " + (i + 1));
            marca = scan.nextLine();
            System.out.println("Digite el tamaño de la llanta" + (i + 1));
            tamaño_llanta = scan.nextLine();
            llanta = new Llanta(tamaño_llanta, marca);
            listallantas.add(llanta);
        }

        //Para el motor
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite el tamaño del motor" + (i + 1));
            tamaño_motor = scan.nextLine();
            System.out.println("Digite el id del motor " + (i + 1));
            id_motor = scan.nextLine();
            System.out.println("Digite la posicion del motor " + (i + 1));
            posicion_motor = scan.nextLine();
            motor = new Motor(tamaño_motor, id_motor, posicion_motor);
            listmotor.add(motor);
        }
       
        objAvion = new Avion(avion_marca, listaalas, fuselaje, listallantas, listmotor); //aqui se hace la composicion
        HelperImpresion.ImprimirAvion(objAvion);
    }
}


































































