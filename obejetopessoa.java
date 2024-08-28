public class obejetopessoa {
    
    public static void main(String[] args) {
        pessoa Pessoa1 = new pessoa();
        pessoa Pessoa2 = new pessoa();

        Pessoa1.setNome("Tom Cruise");
        Pessoa1.setIdade(60);
        Pessoa1.setEndereco("California, USA");
        Pessoa1.setProfissao("Ator");
        Pessoa1.setCPF(99999999999l);
        Pessoa1.setRG(22222222l);


        Pessoa2.setNome("Messi");
        Pessoa2.setIdade(35);
        Pessoa2.setEndereco("Miami, USA");
        Pessoa2.setProfissao("Jogador de Futebol");
        Pessoa2.setCPF(88888888888l);
        Pessoa2.setRG(33333333l);

        System.out.println("--------OBJETO 1-------");
        System.out.println(Pessoa1.getNome());
        System.out.println(Pessoa1.getIdade());
        System.out.println(Pessoa1.getEndereco());
        System.out.println(Pessoa1.getProfissao());
        System.out.println(Pessoa1.getCPF());
        System.out.println(Pessoa1.getRG());

        System.out.println("--------OBJETO 2--------");
        System.out.println(Pessoa2.getNome());
        System.out.println(Pessoa2.getIdade());
        System.out.println(Pessoa2.getEndereco());
        System.out.println(Pessoa2.getProfissao());
        System.out.println(Pessoa2.getCPF());
        System.out.println(Pessoa2.getRG());
        
        

    }
}
