import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("DIO Full Stack Developer");
        bootcamp.setDescricao("Aprenda tudo sobre desenvovimento full stack.");

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("React");
        curso2.setDescricao("Curso de React");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Live de lançamento");
        mentoria.setDescricao("Apresentação do Bootcamp");
        mentoria.setData(LocalDate.now());

        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

        Dev dev1 = new Dev("Luiz");
        dev1.inscreverBootcamp(bootcamp);
        Dev dev2 = new Dev("Maria");
        dev2.inscreverBootcamp(bootcamp);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        System.out.println("----DEV 1----");
        System.out.println("Inscrições: "+ dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println(" - - - - ");
        System.out.println("Inscrições: "+ dev1.getConteudosInscritos());
        System.out.println("Conclusões: " + dev1.getConteudosConcluidos());
        System.out.println("XP: "+dev1.calcularExpTotal());

        System.out.println("----DEV 2----");
        System.out.println("Inscrições: "+ dev2.getConteudosInscritos());
        System.out.println(" - - - - ");
        dev2.progredir();
        System.out.println(" - - - - ");
        dev2.progredir();
        System.out.println("Inscrições: "+ dev2.getConteudosInscritos());
        System.out.println("Conclusões: " + dev2.getConteudosConcluidos());
        System.out.println("XP: "+dev2.calcularExpTotal());
    }
}
