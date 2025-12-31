# Desafio: Aprendendo na Prática POO com Java

Este projeto foi desenvolvido como parte do desafio de Programação Orientada a Objetos (POO) com Java. O objetivo principal é aplicar os quatro pilares da OO — **Abstração, Encapsulamento, Herança e Polimorfismo** — em um domínio real: um ecossistema de Bootcamp.

## 🚀 Sobre o Projeto
O sistema simula o funcionamento de um Bootcamp, onde:
- **Cursos** e **Mentorias** são tipos de conteúdos.
- **Bootcamp** agrupa conteúdos e permite a inscrição de desenvolvedores.
- **Devs** se inscrevem em Bootcamps, progridem nos conteúdos e acumulam XP.

## 🛠️ Conceitos de POO Aplicados
- **Abstração**: Criação da classe base `Conteudo` para representar elementos genéricos.
- **Herança**: `Curso` e `Mentoria` herdam atributos e comportamentos de `Conteudo`.
- **Encapsulamento**: Uso de modificadores de acesso `private` e `protected`, com métodos `getters` e `setters`.
- **Polimorfismo**: O método `calcularXp()` é implementado de formas diferentes em cada subclasse.