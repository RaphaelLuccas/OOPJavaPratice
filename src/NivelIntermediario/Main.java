package NivelIntermediario;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        //Criar ninja Naruto Uzumaki - Naruto é m objeto
//        Uzumaki Naruto = new Uzumaki();
//        Naruto.nome = "Naruto Uzumaki";
//        Naruto.aldeia = "Aldeia da Folha";
//        Naruto.idade = 17;
//        Naruto.ModoSabioAtivado();
//
//        //Criar ninja Sasuke Uchiha - Sasuke é um objeto
//        Uchiha Sasuke = new Uchiha();
//        Sasuke.nome = "Sasuke Uchiha";
//        Sasuke.aldeia = "Aldeia da Folha";
//        Sasuke.idade = 18;
//        Sasuke.SharinganAtivado();
//
//        //Criar ninja Sakura Haruno - Sakura é um objeto
//        Haruno Sakura = new Haruno();
//        Sakura.nome = "Sakura Haruno";
//        Sakura.aldeia = "Aldeia da folha";
//        Sakura.idade = 19;
//        Sakura.AtivarCura();
//
//        //Criar ninja Hinata Hyuga - Hinata é um objeto
//        Hyuga Hinata = new Hyuga();
//        Hinata.nome = "Hinata Hyuga";
//        Hinata.aldeia = "Aldeia da folha";
//        Hinata.idade = 20;
//        Hinata.AtivarByakugan();
//
//        Boruto Boruto = new Boruto();
//        Boruto.nome = "Boruto Hyuga Uzumaki";
//        Boruto.aldeia = "Aldeia da folha";
//        Boruto.idade = 9;
//        Boruto.AtivarOKarma();
//        Boruto.AtivarJougan();
//        Boruto.EuSouUmNinja();
//        Boruto.ModoSabioAtivado();
//
//        Uzumaki naruto = new Uzumaki();
//        naruto.nome = "Naruto Uzumaki";
//        naruto.habilidadeEspecial();
//
//        Uchiha sasuke = new Uchiha();
//        sasuke.nome = "Uchiha Sasuke";
//        sasuke.habilidadeEspecial();
//
//        Hokages Hashirama = new Hokages();
//
//
//        Array são estáticos, não alteram de tamanho
//        String[] ninjasArray = new String[3];
//        ninjasArray[0] = "Naruto";
//        ninjasArray[1] = "Sasuke";
//        ninjasArray[2] = "Sakura";
//
//        for (int i = 0; i < ninjasArray.length; i++) {
//            System.out.println("ninjasArray[i] = " + ninjasArray[i]);
//        }
//
//        // Listas não são estaticas, elas podem aumentar ou diminuir
//        List <String> ninjasList = new ArrayList<>();
//        ninjasList.add("Naruto Uzumaki"); // Index 0
//        ninjasList.add("Sasuke Uchiha"); // Index 1
//        ninjasList.add("Sakura Haruno"); // Index 2
//        ninjasList.add("Tobirama Senju"); // Index 3
//        ninjasList.add("Kakashi Hatake"); // Index 4
//
//        System.out.println("Ninja List = " + ninjasList);
//
//         ninjasList.remove("Kakashi Hatake");
//         System.out.println("Ninja List = " + ninjasList);
//
//         // Trocar Elementos
//        ninjasList.set(3, "Hashirama Senju");
//        System.out.println("Ninja List = " + ninjasList);
//
//        //Ver o tamanho da lista
//        ninjasList.size();
//        System.out.println("Tamanho Lista = " + ninjasList.size() + " elementos");

        Hokages Hashirama = new Hokages();
        Hashirama.idade = 45;

        Hokages Tobirama = new Hokages("Tobirama Senju");
        System.out.println(Tobirama.nome);

        Hokages Hiruzen = new Hokages(45);
        System.out.println(Hiruzen.idade);

    }
}
