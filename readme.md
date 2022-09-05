# Curso de Java Básico

```java
Por: Loiane Groner
Site: https://loiane.training/
```
## Aula 01 - Introdução e Dicas

### O que é a tecnologia Java?

- Simples
- Orientada a Objetos
- Distribuída
- Multithreaded
- Dinâmica
- Arquitetura neutra
- Portável
- Ótima Performance
- Robusta
- Segura

O Java é **WORA (Write Once Run Anywhere)**, ou seja, execute uma vez e rode em qualquer lugar. Isso é possível por causa da JVM (Java Virtual Machine).

### Plataforma e Ambiente Java

A plataforma Java é composta por:

- Java Virtual Machine (JVM)
- Java Application Programming Interface (API)

API é um conjunto de bibliotecas. Uma biblioteca é composta por um conjunto de códigos que permite fazer alguma coisa.

Existe uma plataforma Java para cada sistema operacional: Linux, MacOS e Windows.

O pai do Java é o James Goslin.

A Sun Microsystems foi a empresa responsável pela criação do Java. Posteriormente a Oracle comprou a Sun e se tornou a dona do Java.

Applets, hoje depreciados, foram responsáveis pela popularização do Java. Eles permitiam rodar o Java no navegador.

### O que se pode fazer com a tecnologia Java?

![Figura que exibe uma descrição do que se pode fazer com Java](src/images/fig01.png)

O Java é uma linguagem compilada e interpretada.

### Certificações

![Figura que exibe uma descrição das certificações Java](src/images/fig02.png)

## Aula 05 - Primeiro Programa em Java

```java
class OlaMundo {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");
    }
}
```
### Entendendo o código

`class` é a declaração da classe. O Java é orientado a objetos. Então, tudo no Java é objeto. Objeto é uma intância de uma classe.

`OlaMundo` é o nome da classe.

`public static void main(String[] args) {...}` é o método. As classes no Java têm métodos, que nada mais são do que funções. Nessa função são passados argumentos: array de strings. Esse é o ponto de entrada num programa Java. Isso não muda. O trecho `public statis` são modificadores de acesso do método. O `void` é o tipo de retorno do método. Aqui, o método não retorna nada. `main` é o nome do método. O Java é *case sensitive*. `String[] args` são parâmetros/argumentos do método.

`System.out.println("Olá, Mundo!")` é o comando que faz o *output* na tela.

E cada bloco está entre parênteses `{}`. São os delimitadores do bloco. Classes e métodos são blocos.



