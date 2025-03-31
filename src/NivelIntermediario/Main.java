package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        //Criar ninja Naruto Uzumaki - Naruto é m objeto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 17;
        Naruto.ModoSabioAtivado();

        //Criar ninja Sasuke Uchiha - Sasuke é um objeto
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;
        Sasuke.SharinganAtivado();

        //Criar ninja Sakura Haruno - Sakura é um objeto
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da folha";
        Sakura.idade = 19;
        Sakura.AtivarCura();

        //Criar ninja Hinata Hyuga - Hinata é um objeto
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da folha";
        Hinata.idade = 20;
        Hinata.AtivarByakugan();

    }
}
