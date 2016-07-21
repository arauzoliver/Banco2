package bnkui;
/**
 * Created by user on 07/20/2016.
 */
import Banco.core.Cuenta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;

public class Principal {


        public static InputStreamReader Leer = new InputStreamReader(System.in);
        public static BufferedReader Teclado = new BufferedReader(Leer);

        public static void main(String[] args) throws IOException
        {
            // TODO code application logic here
            double t,x;
            int op;
            String c;
            // TODO code application logic here
            System.out.println("\t\tBienvenido al Banco NoCompila");
            System.out.println("Ingrese nombre");
            c=Teclado.readLine();
            System.out.println("\nIngrese su saldo");
            x=Integer.parseInt(Teclado.readLine());
            Cuenta cliente = new Cuenta(x,c);
            do{
                System.out.println("\n1 Deposito");
                System.out.println("2 Retiro");
                System.out.println("3 Consulta");
                System.out.println("4 Salir");
                System.out.println("\nElija una opcion");
                op=Integer.parseInt(Teclado.readLine());

                switch(op){
                    case 1:
                        System.out.println("Ingrese deposito");
                        t=Integer.parseInt(Teclado.readLine());
                        cliente.Deposito(t);
                        break;
                    case 2:
                        System.out.println("Ingrese retiro");
                        t=Integer.parseInt(Teclado.readLine());
                        cliente.Retiro(t);

                        break;
                    case 3:
                        cliente.consulta();
                        break;
                }//switch

            }while(op<4);//while

        }
}
