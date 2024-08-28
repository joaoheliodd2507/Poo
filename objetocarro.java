public class objetocarro {

    public static void main(String[] args) {
        
   
        carro Carro1 = new carro();
        carro Carro2 = new carro();
        carro Carro3 = new carro();
        carro Carro4 = new carro();

        Carro1.setTipo("Esportivo");
        Carro1.setCor("Azul");
        Carro1.setMarca("Chevrolet");
        Carro1.setModelo("C8");
        Carro1.setMotor("2.0 16V");
        Carro1.setViraEsquerda("Sim");
        Carro1.setViraDireita("Sim");
        Carro1.setAcendeFarou("Sim");
       

        Carro2.setTipo("Esportivo");
        Carro2.setCor("cinza");
        Carro2.setMarca("Aston Martin");
        Carro2.setModelo("Vantage 2025");
        Carro2.setMotor("V8 4.0 biturbo");
        Carro2.setViraEsquerda("Sim");
        Carro2.setViraDireita("Sim");
        Carro2.setAcendeFarou("Sim");


        Carro3.setTipo("Padrão");
        Carro3.setCor("amarelo");
        Carro3.setMarca("Volkswagen");
        Carro3.setModelo("modelo de 1975");
        Carro3.setMotor("1.5L F4");
        Carro3.setViraEsquerda("Sim");
        Carro3.setViraDireita("Sim");
        Carro3.setAcendeFarou("Sim");


        Carro4.setTipo("Padrão");
        Carro4.setCor("Preto");
        Carro4.setMarca("Chevrolet");
        Carro4.setModelo("Chevrolet Celta Super 1.0 VHC 2p");
        Carro4.setMotor("1.0 Flexpower VHCE");
        Carro4.setViraEsquerda("Sim");
        Carro4.setViraDireita("Sim");
        Carro4.setAcendeFarou("Sim");

        System.out.println("--------OBJETO 1-------");
        System.out.println(Carro1.geTipo());
        System.out.println(Carro1.getCor());
        System.out.println(Carro1.getMarca());
        System.out.println(Carro1.getModelo());
        System.out.println(Carro1.getMotor());
        System.out.println(Carro1.getViraEsquerda());
        System.out.println(Carro1.getViraDireita());
        System.out.println(Carro1.getAcendeFarou());
    
        System.out.println("--------OBJETO 2-------");
        System.out.println(Carro2.geTipo());
        System.out.println(Carro2.getCor());
        System.out.println(Carro2.getMarca());
        System.out.println(Carro2.getModelo());
        System.out.println(Carro2.getMotor());
        System.out.println(Carro2.getViraEsquerda());
        System.out.println(Carro2.getViraDireita());
        System.out.println(Carro2.getAcendeFarou());

        System.out.println("--------OBJETO 3--------");
        System.out.println(Carro3.geTipo());
        System.out.println(Carro3.getCor());
        System.out.println(Carro3.getMarca());
        System.out.println(Carro3.getModelo());
        System.out.println(Carro3.getMotor());
        System.out.println(Carro3.getViraEsquerda());
        System.out.println(Carro3.getViraDireita());
        System.out.println(Carro3.getAcendeFarou());

        System.out.println("--------OBJETO 4--------");
        System.out.println(Carro4.geTipo());
        System.out.println(Carro4.getCor());
        System.out.println(Carro4.getMarca());
        System.out.println(Carro4.getModelo());
        System.out.println(Carro4.getMotor());
        System.out.println(Carro4.getViraEsquerda());
        System.out.println(Carro4.getViraDireita());
        System.out.println(Carro4.getAcendeFarou());
        
        
    }
}


