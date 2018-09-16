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

Exercício de fixação

Em um novo programa, inicie as seguintes variáveis:
```java
String product1 = "Computer";
String product2 = "Office desk";
int age = 30;
int code = 5290;
char gender = 'F';
double price1 = 2100.0;
double price2 = 650.50;
double measure = 53.234567;
```

Em seguida, usando os valores das variáveis, produza a seguinte saída na tela do console:

```
Products:
Computer, which price is $ 2100,00
Office desk, which price is $ 650,50
Record: 30 years old, code 5290 and gender: F
Measue with eight decimal places: 53,23456700
Rouded (three decimal places): 53,235
US decimal point: 53.235

```

Resolução

```java
package course;

import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		byte age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
	}
}

```

#### 14. Operadores aritméticos

```java
package course;

public class Program {
	public static void main(String[] args) {
		int n1 = 3 + 4 * 2;
		int n2 = (3 + 4) * 2;
		int n3 = 17 % 3;
		double n4 = 10.0 / 8.0;
		double a = 1.0, b = -3.0, c = -4.0;
		double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(x1);
	}
}

```

#### 15. Operadores de atribuição

```java
package course;

public class Program {
	public static void main(String[] args) {
		double n1 = 10;
		double n2 = 30;
		String s = "ABC";
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		System.out.println("-------------");
		n1 *= 2;
		n2 += n1;
		s += "DEF";
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
        /*
        10.0
        30.0
        ABC
        -------------
        20.0
        50.0
        ABCDEF
        */
		
		int a = 10;
		int b = a++;
		System.out.println(a); // 11
		System.out.println(b); // 10
		int c = 10;
		int d = ++c;
		System.out.println(c); // 11
		System.out.println(d); // 11
	}
}

```

#### 16. Operadores comparativos

```java
package course;

public class Program {
	public static void main(String[] args) {
		int a = 10;
		boolean c1 = a < 10;
		boolean c2 = a < 20;
		boolean c3 = a > 10;
		boolean c4 = a > 5;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println("------------");
		boolean c5 = a <= 10;
		boolean c6 = a >= 10;
		boolean c7 = a == 10;
		boolean c8 = a != 10;
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
        /*
        false
        true
        false
        true
        ------------
        true
        true
        true
        false
        */
	}
}

```

#### 17. Operadores lógicos

```java
package course;

public class Program {
	public static void main(String[] args) {
		boolean c1 = 2 > 3 || 4 != 5; // true
		boolean c2 = !(2>3) && 4 != 5; // true
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("--------------");
		boolean c3 = 10 < 5; // false
		boolean c4 = c1 || c2 && c3; // true
		System.out.println(c4);
        /*
        true
        true
        --------------
        true
        */
	}
}

```

#### 18. Operadores bitwise

```java
package course;

public class Program {
	public static void main(String[] args) {

		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
	}
}

```

```java
package course;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mask = 0b100000;
		int n = sc.nextInt();
		if ((n & mask) != 0) {
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false");
		}
		sc.close();
		//89
		//6th bit is false
		
		//186
		//6th bit is true!
	}
}

```

#### 19. Entrada de dados em Java - Parte 1
```java
package course;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		String x, y, z;
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(x);
		
		x = sc.next();
		y = sc.next();
		z = sc.next();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x);
		
		sc.close();

        /*
        AZUL
        AMARELO
        VERDE
        VERMELHO
        AZUL
        AMARELO
        VERDE
        AMARELO
        
        AZUL AMARELO VERDE VERMELHO
        AZUL
        AMARELO
        AZUL
        */
	}
}

```

#### 19. Entrada de dados em Java - Parte 2

Limpeza de stream de entrada (flush)  
DETALHE IMPORTANTE:  
Antes de fazer um nextLine()  
- Se antes foi dada uma quebra de linha na stream de entrada sem o nextLine()  
- Então é preciso fazer um nextLine() extra para "limpar" a quebra de linha que fica pendente na stream  

```java
package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// 35
		int n1 = sc.nextInt();
		// Bob Brown
		sc.nextLine();
		String name = sc.nextLine();
		// F
		char gender = sc.next().charAt(0);
		// b5
		String s = sc.next();
		char letter = s.charAt(0);
		int digit = Integer.parseInt(s.substring(1));
		// 4.32
		double n2 = sc.nextDouble();
		// Maria F 23 1.68
		String name2 = sc.next();
		char ch = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(digit);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(height);
		sc.close();
		/*
		 	35
			Bob
			F
			b5
			4.32
			Maria F 23 1.68
			
			35
			Bob
			F
			b
			5
			4.32
			Maria
			F
			23
			1.68 
		 */
	}
}

```

Exercício:

Fazer um programa para executar o seguinte procedimento de entrada de dados, e depois mostrar os dados na tela:  
Enter your full name:  
Alex Green  
How many bedrooms are there in your house?  
3  
Enter product price:  
500.50  
Enter your last name, age and height (same line):  
Green 21 1.73  

SAÍDA ESPERADA (NÚMEROS REAIS COM DUAS CASAS DECIMAIS):  
Alex Green  
3  
500.50  
Green  
21  
1.73  

```java
package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name:");
		String fullName = sc.nextLine();
		System.out.println("How many bedrooms are there in your house?");
		int bedrooms = sc.nextInt();
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line):");
		sc.nextLine();
		String[] vect = sc.nextLine().split(" ");
		String lastName = vect[0];
		int age = Integer.parseInt(vect[1]);
		double height = Double.parseDouble(vect[2]);
		System.out.println(fullName);
		System.out.println(bedrooms);
		System.out.printf("%.2f%n", price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.printf("%.2f%n", height);
		sc.close();
	}
}

/*
Enter your full name:
Alex green
How many bedrooms are there in your house?
3
Enter product price:
500.50
Enter your last name, age and height (same line):
Green 21 1.73
Alex green
3
500.50
Green
21
1.73

*/

```


#### 21. Funções interessantes para String

- Formatar: toLowerCase(), toUpperCase(), trim()
- Recortar: substring(inicio), substring(inicio, fim)
- Substituir: Replace(char, char), Replace(string, string)
- Buscar: IndexOf, LastIndexOf
- str.Split(" ")

```java
package course;

public class Program {
	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		System.out.println("---------------------------------");
		
		String s = "potato apple lemon";
		System.out.println(s);
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
        /*
        Original: -abcde FGHIJ ABC abc DEFG -
        toLowerCase: -abcde fghij abc abc defg -
        toUpperCase: -ABCDE FGHIJ ABC ABC DEFG -
        trim: -abcde FGHIJ ABC abc DEFG-
        substring(2): -cde FGHIJ ABC abc DEFG -
        substring(2, 9): -cde FGH-
        replace('a', 'x'): -xbcde FGHIJ ABC xbc DEFG -
        replace('abc', 'xy'): -xyde FGHIJ ABC xy DEFG -
        Index of 'bc': 1
        Last index of 'bc': 17
        ---------------------------------
        potato apple lemon
        potato
        apple
        lemon
        */
	}
}

```

#### 22. Estruturas condicionais

Exercício de fixação  
Fazer um programa para ler três números inteiros na mesma linha, separados por espaço em branco.  
Em seguida, mostrar na tela qual é o maior dos números lidos. Se houver empate, mostrar apenas um.  

```java
package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a > b && a > c) {
			System.out.println("Higher = " + a);
		} else if (b > c) {
			System.out.println("Higher = " + b);
		} else {
			System.out.println("Higher = " + c);
		}
		sc.close();
	}
}

```

#### 23. Sintaxe alternativa - switch-case

```java
package course;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String day;
		switch (x) {
		case 1:
		day = "Sunday";
		break;
		case 2:
		day = "Monday";
		break;
		case 3:
		day = "Tuesday";
		break;
		case 4:
		day = "Wednesday";
		break;
		case 5:
		day = "Thursday";
		break;
		case 6:
		day = "Friday";
		break;
		case 7:
		day = "Saturday";
		break;
		default:
		day = "Invalid value";
		}
		System.out.println("Day: " + day);
	}
}

```

#### 24. Expressão condicional ternária

```java
package course;

public class Program {
	public static void main(String[] args) {
		/*
		double preco = 34.5;
		double desconto;
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}
		*/
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
		
	}
}

```

#### 25. Escopo e inicialização

- Escopo de uma variável: é a região do programa onde a variável é válida, ou seja, onde ela pode ser referenciada.
- Uma variável não pode ser usada se não for iniciada.
- Falaremos de escopo de métodos no Capítulo 5

```java
package course;

public class Program {
	public static void main(String[] args) {
		//double price = sc.nextDouble();
		double price = 0;
		double discount = 0;
		if (price > 100.0) {
		 discount = price * 0.1;
		}
		System.out.println(discount); 
    }
}

```

#### 26. Comentários em Java (básico)

```java
package course;

import java.util.Locale;
import java.util.Scanner;

/*
Este programa calcula as raízes de uma equação do segundo grau
Os valores dos coeficientes devem ser digitados um por linha
*/
public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a, b, c, delta;
		System.out.println("Digite os valores dos coeficientes:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		delta = b * b - 4 * a * c; // cálculo do valor de delta
	}
}
```

#### 27. Funções (sintaxe)

Representam um processamento que possui um significado
    - Math.sqrt(double)
    - System.out.println(string)
- Principais vantagens: modularização, delegação e reaproveitamento
- Dados de entrada e saída
    - Funções podem receber dados de entrada (parâmetros ou argumentos)
    - Funções podem ou não retornar uma saída
- Em orientação a objetos, funções em classes recebem o nome de "métodos"

EX:  
Fazer um programa para ler três números inteiros e mostrar na tela o maior deles.

```java
package course;

import java.util.Scanner;

public class Program {
	/*
	 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
	 * System.out.println("Enter three numbers:"); int a = sc.nextInt(); int b =
	 * sc.nextInt(); int c = sc.nextInt(); if (a > b && a > c) {
	 * System.out.println("Higher = " + a); } else if (b > c) {
	 * System.out.println("Higher = " + b); } else { System.out.println("Higher = "
	 * + c); } sc.close();
	 * 
	 * }
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int higher = max(a, b, c);
		showResult(higher);
		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}
}
```


#### 28. Debugging com Eclipse

- Teclas  
    - CTRL+SHIFT+B - marcar/desmarcar breakpoint
    - (bug) iniciar/continuar o debug
    - F6 - executar um passo (pula função)
    - F5 - executar um passo (entra na função)
    - F7 - sair do método em execução
    - (stop) parar debug

- Perspectiva Debug
- Aba importante: Variables

#### 29. Estrutura repetitiva while

```
while ( condição ) {
    comando 1
    comando 2
}
```

EX:  
Digitar um número e mostrar sua raiz quadrada com três casas decimais, depois repetir o procedimento.  
Quando o usuário digitar um número negativo (podendo inclusive ser na primeira vez), mostrar uma mensagem "Negative number" e terminar o programa.

```java
package course;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		double n  = sc.nextDouble();
		
		while(n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3f%n", sr);
			System.out.println("Enter another number");
			n = sc.nextDouble();
		}
		System.out.println("Negative number");
		sc.close();
	}
}
```

#### 30. Estrutura repetitiva for

Digitar um número N e depois N valores inteiros. Mostrar a soma dos N valores digitados.

```java
package course;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many integer numbers are you going to enter: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("Value #" + i + ": ");
			int x = sc.nextInt();
			sum += x;
		}
		System.out.println("Sum = " + sum);
		sc.close();
	}

}
```

#### 31. Exercício de fixação - estruturas repetitivas while e for

Fazer um programa para ler um número N (se for digitado um valor não positivo, mostrar uma mensagem e ler novamente). 
Em seguida, N valores inteiros. Mostrar o maior dentre os N números digitados. Veja exemplo:

```
Enter N: 0
N must be positive! Try again: -2
N must be positive! Try again: 4
Value #1: 5
Value #2: 4
Value #3: 10
Value #4: 2
Higher = 10
```

```java
package course;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		while (n <= 0) {
			System.out.print("N must be positive! Try again: ");
			n = sc.nextInt();
		}
		int higher = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			System.out.print("Value #" + i + ": ");
			int x = sc.nextInt();
			if (x > higher) {
				higher = x;
			}
		}
		System.out.println("Higher = " + higher);
		sc.close();
	}
}
```

#### 32. Estrutura repetitiva do-while

```
do {
    comando 1
    comando 2
} while ( condição );
```

Digitar um número e mostrar sua raiz quadrada, depois perguntar ao usuário se ele deseja repetir o procedimento (y/n). 
Caso ele responda 'y', repetir o procedimento.

```java
package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		do {
			System.out.print("Enter a number: ");
			double n = sc.nextDouble();
			double sq = Math.sqrt(n);
			System.out.printf("Square root = %.3f%n", sq);
			System.out.print("Repeat (y/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		sc.close();
		
		
		/*
		    Enter a number: 10
			Square root = 3.162
			Repeat (y/n)? y
			Enter a number: 144
			Square root = 12.000
			Repeat (y/n)? n
		 */
	}

}
```

#### 33. Exercícios de reforço

1) Deseja-se fazer um programa para calcular a nota final de um estudante, considerando as
três notas que ele tirou nos três trimestres de seu curso. Caso a nota final do estudante seja
menor que 60.00, deve-se mostrar uma mensagem "FAILED" também.

```
Enter three student scores:
22.00 30.10 25.50
Final score = 77.60
```
```
Enter three student scores:
15.00 20.00 20.00
Final score = 55.00
FAILED
```

```java
package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three student scores: ");
		double score1 = sc.nextDouble();
		double score2 = sc.nextDouble();
		double score3 = sc.nextDouble();
		
		double finalScore = score1 + score2 + score3;
		
		System.out.printf("Final score: %.2f%n", finalScore);
		if(finalScore < 60.0) {
			System.out.println("FAILED");
		}
		sc.close();
		
	}

}
```

2) Fazer um programa para ler a quantidade de glicose no sangue de uma pessoa e depois mostrar na tela a classificação desta glicose de
acordo com a tabela de referência ao lado.

```
Classificação Glucose
Normal - glucose <= 100
High - 100 < glusose <= 140
Diabetes - glucose > 140
```

```
Enter glucose measure: 90.0
Normal
```

```java
package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Glucose measure: ");
		double glucose = sc.nextDouble();
		
		if(glucose <= 100.0) {
			System.out.println("Normal");
		}else if(glucose <= 140.0) {
			System.out.println("High");
		}else {
			System.out.println("Diabetes");
		}
		sc.close();
	}
}
```

3) Fazer um programa para ler dois números inteiros e mostrar a soma de todos os números
ímpares entre eles, inclusive eles próprios.

```
Enter two integer numbers:
-10
2
Sum of odd numbers = -24
```
```
Enter two integer numbers:
14
3
Sum of odd numbers = 48
```

```java
package course;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two integer numbers: ");

		int x = sc.nextInt();
		int y = sc.nextInt();

		int begin = x, end = y;
		if (y < x) {
			begin = y;
			end = x;
		}

		int sum = 0;
		for (int i = begin; i <= end; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("Sum os add number: " + sum);

		sc.close();

	}

}
```

4) Leia números inteiros até que um 0 (zero) seja lido. Para cada valor lido, o programa deve
mostrar o quadrado do valor.
```
Enter an integer value: 4
16
Enter an integer value: 1
1
Enter an integer value: 10
100
Enter an integer value: 0
```

```java
package course;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer value: ");
		
		int n = sc.nextInt();
		
		while (n != 0) {
			int square = n * n;
			System.out.println(square);
			System.out.print("Enter an integer value: ");
			n = sc.nextInt();
		}
		sc.close();
	}

}
```

5) O curso de Computação Gráfica do IFTM é trimestral, sendo que as notas do ano são
divididas em três partes: 30, 35 e 35, totalizando 100 pontos no ano. O professor de
programação está querendo automatizar o processo de fechamento de notas. Faça um
programa para somar as notas dos três trimestres de todos alunos da turma.

```
Enter number of students: 3
Student #1: 20.00 31.00 30.00
Final score: 81.00
Student #2: 25.00 31.10 30.22
Final score: 86.32
Student #3: 19.25 29.00 18.31
Final score: 66.56
```

```java
package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of students: ");
		
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Student #" + i + ": ");
			double score1 = sc.nextDouble();
			double score2 = sc.nextDouble();
			double score3 = sc.nextDouble();
			double finalScore = score1 + score2 + score3;
			System.out.printf("Final score: %.2f%n", finalScore);
		}
		sc.close();
	}

}
```


[Voltar ao Índice](#indice)

---

## <a name="parte3">Introdução à Programação Orientada a Objetos</a>

#### 3. Resolvendo um problema sem orientação a objetos

Resolvendo um problema sem orientação a objetos  
Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas  
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos  
possui a maior área.  
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a  
seguinte (fórmula de Heron):  

```
Enter the measures of triangle X:
3.00
4.00
5.00
Enter the measures of triangle Y:
7.50
4.50
4.02
Triangle X area: 6.0000
Triangle Y area: 7.5638
Larger area: Y
```

```java
package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Enter the measures of triangle X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Enter the measures of triangle Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		} else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}

}
```


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