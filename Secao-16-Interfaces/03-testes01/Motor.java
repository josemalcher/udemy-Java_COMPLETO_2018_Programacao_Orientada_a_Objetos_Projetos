// ===================================================================================
// CENÁRIO 1: O PROBLEMA (SEM INVERSÃO DE CONTROLE)
// ===================================================================================

class Motor {
    private final String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
        System.out.println("MOTOR CRIADO!");
    }

    public void ligar() {
        System.out.println("Motor " + this.tipo + " Ligado!");
    }
}

/**
 * Nesta primeira versão, a classe Carro tem a responsabilidade de criar (instanciar)
 * sua própria dependência (o Motor). Isso é chamado de "alto acoplamento".
 * <p>
 * Problemas dessa abordagem:
 * - Se a classe Motor mudar (ex: seu construtor passar a exigir mais parâmetros), a classe Carro
 * também precisará ser alterada.
 * - É muito difícil de testar. Como você testaria o Carro com um "Motor Falso" (mock) para
 * isolar o teste apenas na lógica do carro? Seria bem complicado.
 * - A classe Carro está "amarrada" a uma implementação específica de Motor.
 */

class CarroComAltoAcoplamento {
    // A classe Carro instancia sua propria dependência
    // Ela tem o CONTROLE sobre a criação do obj Motor
    private final Motor motor;

    CarroComAltoAcoplamento() {
        // A dependência é criada DENTRO da própria classe.
        this.motor = new Motor("V8");
        System.out.println("CarroComAltoAcoplamento criado.");
    }

    public void acelerat() {
        System.out.println("ACELERANDO O CARRO: ");
        this.motor.ligar();
    }
}


// ===================================================================================
// CENÁRIO 2: A SOLUÇÃO (COM INVERSÃO DE CONTROLE E INJEÇÃO DE DEPENDÊNCIA)
// ===================================================================================

/**
 * A classe de dependência (Motor) continua a mesma.
 * A mudança não está nela, mas em como ela é usada.
 */


/**
 * Nesta segunda versão, a classe Carro NÃO cria mais sua dependência.
 * Ela declara que PRECISA de um Motor para funcionar e o recebe de fora.
 * <p>
 * O CONTROLE sobre a instanciação do Motor foi INVERTIDO: não é mais do Carro,
 * mas de quem for usar o Carro.
 * <p>
 * A forma como o motor é entregue ao carro é a INJEÇÃO DE DEPENDÊNCIA.
 * Neste caso, estamos usando a injeção via construtor.
 */

class CarroComInjecaoDeDependencia {
    // a classe apenas declara a dependência, ela não a insctancia

    private final Motor motor;

    /**
     * INJEÇÃO DE DEPENDÊNCIA VIA CONSTRUTOR.
     * A dependência `Motor` é "injetada" de fora quando um objeto `Carro` é criado.
     * A classe Carro agora confia que receberá um Motor pronto e funcional.
     * @param motor Uma instância de Motor (ou de uma subclasse, se fosse uma interface).
     */

    public CarroComInjecaoDeDependencia(Motor motor) {
        this.motor = motor;
        System.out.println("CarroComInjecaoDeDependencia criado.");
    }

    public void acelerar() {
        System.out.print("Acelerando o carro (com DI): ");
        this.motor.ligar();
    }
}

class Main {
    public static void main(String[] args) {

        System.out.println("### CENÁRIO 1: Sem Inversão de Controle ###");
        // A classe CarroComAltoAcoplamento controla tudo. Nós apenas a instanciamos.
        CarroComAltoAcoplamento meuCarroAntigo = new CarroComAltoAcoplamento();
        meuCarroAntigo.acelerat();

        System.out.println("\n---------------------------------------------\n");


        System.out.println("### CENÁRIO 2: Com Inversão de Controle e Injeção de Dependência ###");

        // PASSO 1: O "componente externo" (neste caso, o método main) cria a dependência.
        // Em um sistema real, isso poderia ser feito por um Framework (como o Spring),
        // uma classe Factory ou um Builder.
        System.out.println("Componente externo criando a dependência 'Motor'...");
        Motor motoParaInjetar = new Motor("ELETRICO");

        // PASSO 2: O "componente externo" injeta a dependência na classe principal.
        System.out.println("Componente externo injetando o 'Motor' no 'Carro'...");
        CarroComInjecaoDeDependencia meuCarroModerno = new CarroComInjecaoDeDependencia(motoParaInjetar);
        meuCarroModerno.acelerar();
        System.out.println("\n-------------- OUTRO CARRO --------------\n");
        System.out.println("CRIADO OUTRO CARRO");
        CarroComInjecaoDeDependencia outroCarro = new CarroComInjecaoDeDependencia(new Motor("Flex"));
        outroCarro.acelerar();

    }
}