# 🧮 Calculadora de IMC em Java

Projeto desenvolvido em **Java** para calcular o **Índice de Massa Corporal (IMC)** a partir do peso e da altura informados pelo usuário via terminal.

O IMC é uma ferramenta de triagem utilizada para indicar se uma pessoa está dentro do peso ideal, abaixo ou acima do recomendado.  
⚠️ *Este cálculo não substitui uma avaliação profissional de saúde.*

---

## 📌 Enunciado do Projeto

Desenvolver um programa em Java que calcule o Índice de Massa Corporal (IMC) de uma pessoa.

O programa deve:
- Solicitar ao usuário o **peso** (em quilogramas);
- Solicitar ao usuário a **altura** (em metros);
- Calcular o IMC utilizando a fórmula:


- Exibir o valor do IMC calculado;
- Exibir a **classificação do IMC**, conforme a tabela padrão.

---

## 📊 Classificação do IMC

| IMC (kg/m²)        | Classificação                    |
|--------------------|----------------------------------|
| Abaixo de 17       | Muito abaixo do peso             |
| 17 até 18,49      | Abaixo do peso                   |
| 18,5 até 24,99    | Peso normal                      |
| 25 até 29,99      | Acima do peso                    |
| 30 até 34,99      | Obesidade I                      |
| 35 até 39,99      | Obesidade II (severa)            |
| Acima de 40       | Obesidade III (mórbida)          |

---

## 🚀 Funcionalidades

- Entrada de dados via terminal
- Cálculo automático do IMC
- Exibição do resultado com duas casas decimais
- Classificação conforme tabela padrão
- Aceita separador decimal com ponto (`.`)

---

## 🛠️ Tecnologias Utilizadas

- Java
- Scanner
- Estruturas condicionais (`if / else`)
- Métodos para melhor organização do código

---

## ▶️ Como Executar o Projeto

1. Compile o programa:
```bash
javac CalculadoraIMC.java
