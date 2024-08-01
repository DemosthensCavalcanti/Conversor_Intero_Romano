# Conversor de Número Inteiro Para Romanos

Este projeto implementa um conversor de números inteiros para algarismos romanos e vice-versa, com autotestes e uma interface gráfica usando Java Swing.

## Funcionalidades

- Conversão de números inteiros para algarismos romanos.
- Conversão de algarismos romanos para números inteiros.
- Interface gráfica para interação com o usuário.
- Autotestes para garantir a correção das conversões.
- Tratamento de exceções para entradas inválidas.

## Estrutura do Projeto

- `src/`
  - `RomanNumeralConverter.java`: Contém a lógica de conversão entre números inteiros e algarismos romanos.
  - `RomanNumeralConverterTest.java`: Contém os testes unitários usando JUnit.
  - `RomanNumeralConverterGUI.java`: Implementa a interface gráfica usando Java Swing.
  - `InvalidRomanNumeralException.java`: Exceção personalizada para tratar valores incorretos.

## Pré-requisitos

- Java Development Kit (JDK) 8 ou superior.
- Biblioteca JUnit 5 para testes.

## Como Executar

### Compilar o Código

1. Clone o repositório:
   ```bash
   git clone https://github.com/DemosthensCavalcanti/Conversor_Real_Romano.git

2. Compile os arquivos Java:
   ```bash
   javac -d bin src/*.java

### Executar a Interface Gráfica

1. Navegue até o diretório bin:
   ```bash
   cd bin

2. Execute o programa:
   ```bash
   java RomanNumeralConverterGUI

### Executar os Testes

1. Certifique-se de ter o JUnit 5 configurado no seu ambiente.

2. Execute os testes:
   ```bash
   java -cp .:/caminho/para/junit-platform-console-standalone-1.7.0-all.jar org.junit.platform.console.ConsoleLauncher --scan-class-path

### Uso

Interface Gráfica

1. Abra o programa.
2. Insira um número inteiro ou algarismo romano no campo de Converter.
3. Clique em "Inteiro para Romano" para converter um número inteiro em algarismo romano.
4. Clique em "Romano para Inteiro" para converter um algarismo romano em número inteiro.
5. O resultado será exibido abaixo dos botões.

### Exceções

InvalidRomanNumeralException

Lançada quando:

A entrada é nula ou vazia.<br>
A entrada contém caracteres inválidos.

### Contribuições

Contribuições são bem-vindas!<br>
Sinta-se à vontade para abrir issues ou enviar pull requests para melhorias ou correções.

### Licença

Este projeto está licenciado sob a MIT License.

### Autor

Demosthens Cavalcanti<br>
https://www.linkedin.com/in/demosthens-cavalcanti-4a0b9627b/ | demosthenscf@gmail.com
