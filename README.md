# Java COMPLETO 2018 Programação Orientada a Objetos +Projetos

Curso mais didático e completo de Java e Orientação a Objetos. Projetos reais com UML, Spring Boot, MongoDB e muito mais

https://www.udemy.com/java-curso-completo/

---

## <a name="indice">Índice</a>

- [Introdução](#parte1)   
- [Apresentação da linguagem Java e tópicos básicos](#parte2)   
- [Introdução à Programação Orientada a Objetos](#parte3)   
- [Construtores, palavra this, sobrecarga, encapsulamento](#parte4)   
- [Comportamento de memória, arrays, listas](#parte5)   
- [Tópicos especiais em Java](#parte6)   
- [Bônus - nivelamento sobre Git e Github](#parte7)   
- [Enumerações, composição](#parte8)   
- [Herança e polimorfismo](#parte9)   
- [Tratamento de exceções](#parte10)   
- [Projeto: Sistema jogo de xadrez](#parte11)   
- [Trabalhando com arquivos](#parte12)   
- [Interfaces](#parte13)   
- [Generics, Set, Map](#parte14)   
- [Programação funcional e expressões lambda](#parte15)   
- [Projeto: MongoDB com Spring Boot](#parte16)   



---

## <a name="parte1">Introdução</a>


[Voltar ao Índice](#indice)

---

## <a name="parte2">Apresentação da linguagem Java e tópicos básicos</a>

- \material_curso\cap2\02-java-topicos-basicos.pdf

#### 8. Primeiro programa em Java no Eclipse  
Checklist  
Window -> Perspective -> Open Perspective -> Java
- File -> New -> Java Project
- Package Explorer
    - JRE System Library
    - Pasta "src"
- Criar classe
    - Botão direito no projeto -> New -> Class
    - Escolher um nome para a classe (iniciar com letra Maiúscula)
    - Escolher um nome para o pacote (iniciar com letra Minúscula)
    - Selecionar public static void main
- Classe
    - package
    - Cláusula import: referências a outros pacotes
    - Classe
    - Método
    - public static void main(String[] args)
- Executar o programa: Botão direito no arquivo -> Run As -> Java Application
- Como fechar e reabrir o projeto? E o workspace?
- Dica: indentação automática: CTRL + SHIFT -> F

#### 9. Trabalhando sem IDE
Crie a estrutura do projeto  
- javac course/*.java
- java course/Program
Nota: para projetos grandes, usar uma ferramenta para automatização (Maven, Ant, Gradle). 

#### 10. Tipos primitivos em Java

https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html  

- Java é uma linguagem estaticamente tipada
- Tipos primitivos em Java
- Tipos referência String e Object
- Variável não iniciada
- Valores padrão
- Overflow
- Padrão para float: sufixo "f"
- Padrão para char: aspas simples
- Padrão para string: aspas duplas
- Padrão para boolean: true, false
- Opção: inferência de tipos com palavra "var" (dentro de métodos)

```java
package course;

public class Program {

	public static void main(String[] args) {
		System.out.println("Olá Mundo!");
		boolean completed = false;
		char gender = 'F';
		char letter = '\u0041';
		byte n1 = 126;
		int n2 = 1000;
		int n3 = 2147483647;
		long n4 = 2147483648L;
		float n5 = 4.5f;
		double n6 = 4.5;

		String name = "Maria Green";
		Object obj1 = "Alex Brown";
		Object obj2 = 4.5f;

		System.out.println(completed);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);

		System.out.println(name);
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

```

#### 11. Restrições e convenções para nomes

- Não pode começar com dígito: use uma letra ou _
- Não usar acentos ou til
- Não pode ter espaço em branco
- Sugestão: use nomes que tenham um significado

Convenções
- Camel Case: lastName
    - pacotes
    - atributos
    - métodos
    - variáveis e parâmetros
- Pascal Case: ProductService
    - classes

Exemplo:
```java
package entities;
public class Account {
private String holder;
private Double balance;
    public Account(String holder, Double balance) {
        this.holder = holder;
        this.balance = balance;
    }
    public String getHolder() {
        return holder;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }
}
```

#### 12. Conversão implícita e casting

```java
package course;
public class Program {
	public static void main(String[] args) {
		double a;
		float b;
		a = 5.0;
		b = (float)a;
		System.out.println(b);
	}
}
 // 5.0
```

```java
package course;

public class Program {
	public static void main(String[] args) {
		double a;
		int b;
		a = 5.0;
		b = (int)a;
		System.out.println(b);
	}
}
// 5

```

```java
package course;

public class Program {
	public static void main(String[] args) {
		int a, b;
		double result;
		a = 5;
		b = 2;
		result = (double) a / b;
		System.out.println(result);
	}
}
// 2.5
```

#### 13. Saída de dados em Java

```java
package course;

import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		char gender = 'F';
		int age = 32;
		double balance = 10.35784;
		String name = "Maria";
		System.out.print("Good morning!");
		System.out.println("Good afternoon!");
		System.out.println("Good night!");
		System.out.println("---------------------------");
		System.out.println(balance);
		System.out.printf("%.2f%n", balance);
		System.out.printf("%.4f%n", balance);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", balance);
		System.out.println("---------------------------");
		System.out.printf("%s is %d years old, gender %c, and got balance = %.2f bitcoins%n", name, age,
		gender, balance);
	}
}

/*
Good morning!Good afternoon!
Good night!
---------------------------
10.35784
10,36
10,3578
10.3578
---------------------------
Maria is 32 years old, gender F, and got balance = 10.36 bitcoins
*/


```















[Voltar ao Índice](#indice)

---

## <a name="parte3">Introdução à Programação Orientada a Objetos</a>


[Voltar ao Índice](#indice)

---

## <a name="parte4">Construtores, palavra this, sobrecarga, encapsulamento</a>


[Voltar ao Índice](#indice)

---

## <a name="parte5">Comportamento de memória, arrays, listas</a>


[Voltar ao Índice](#indice)

---

## <a name="parte6">Tópicos especiais em Java</a>


[Voltar ao Índice](#indice)

---

## <a name="parte7">Bônus - nivelamento sobre Git e Github</a>


[Voltar ao Índice](#indice)

---

## <a name="parte8">Enumerações, composição</a>


[Voltar ao Índice](#indice)

---

## <a name="parte9">Herança e polimorfismo</a>


[Voltar ao Índice](#indice)

---

## <a name="parte10">Tratamento de exceções</a>


[Voltar ao Índice](#indice)

---

## <a name="parte11">Projeto: Sistema jogo de xadrez</a>


[Voltar ao Índice](#indice)

---

## <a name="parte12">Trabalhando com arquivos</a>


[Voltar ao Índice](#indice)

---

## <a name="parte13">Interfaces</a>


[Voltar ao Índice](#indice)

---

## <a name="parte14">Generics, Set, Map</a>


[Voltar ao Índice](#indice)

---

## <a name="parte15">Programação funcional e expressões lambda</a>


[Voltar ao Índice](#indice)

---

## <a name="parte16">Projeto: MongoDB com Spring Boot</a>


[Voltar ao Índice](#indice)

---