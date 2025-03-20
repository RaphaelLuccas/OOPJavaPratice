package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        //Criar ninja Naruto Uzumaki - Naruto é m objeto
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;

        //Criar ninja Sasuke Uchiha - Sasuke é um objeto
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 18;

        //Aplicando metodos ao meus objetos
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.EuSouUmNInja();

        //Criar ninja Sakura Haruno - Sakura é um objeto
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da folha";
        Sakura.idade = 19;

    }
}
