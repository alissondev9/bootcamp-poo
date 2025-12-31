import br.com.dio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java Básico");
        curso1.setDescricao("Introdução à programação Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Java OO");
        curso2.setDescricao("Conceitos de Orientação a Objetos");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria sobre OO em Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda Java na prática");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlice = new Dev();
        devAlice.setNome("Alice");
        devAlice.inscreverBootcamp(bootcamp);
        devAlice.progredir();
        devAlice.progredir();

        System.out.println("Conteúdos inscritos Alice: " + devAlice.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Alice: " + devAlice.getConteudosConcluidos());
        System.out.println("XP total: " + devAlice.calcularTotalXp());
    }
}
