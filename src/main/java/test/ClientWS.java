package test;

import proxy.CalculatriceWS;
import proxy.CalculatriceWSService;

public class ClientWS {
    public static void main(String[] args) {

        CalculatriceWS calculatriceWS=new CalculatriceWSService().getCalculatriceWSPort();
        double somme =calculatriceWS.somme(10,5);
        double soustraction =calculatriceWS.soustraction(20,40);
        double multiplication =calculatriceWS.multiplication(150,2);
        double division =calculatriceWS.division(400,2);
       // double rdd =calculatriceWS.division(4,0);
        System.out.println(somme);
        System.out.println(soustraction);
        System.out.println(multiplication);
        System.out.println(division);
      //  System.out.println(rdd);
    }
}
