import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setCargaHoraria(8);
        curso1.setDescricao("Descricao do curso Java");
        curso1.setTitulo("Curso Java");

        Curso curso2 = new Curso();
        curso2.setCargaHoraria(5);
        curso2.setDescricao("Descricao do curso JS");
        curso2.setTitulo("Curso JavaScript");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setData(LocalDate.now());
        mentoria1.setDescricao("Descricao da mentoria Java");
        mentoria1.setTitulo("Mentoria java");



        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java DIO");
        bootcamp.setDescricao("Descricao Bootcamp Java DIO");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devNatan = new Dev();
        devNatan.setNome("Natan");
        devNatan.inscreverBootcamp(bootcamp);
        devNatan.progredir();
        devNatan.progredir();
        System.out.println("Conteudos inscritos: " + devNatan.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devNatan.getConteudosConcluidos());
        System.out.println("XP: " + devNatan.calcularTotalXp());

        System.out.println("=================");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        devPedro.progredir();
        System.out.println("Conteudos inscritos: " + devPedro.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());

    }
}