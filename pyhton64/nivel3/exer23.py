def calculadora():
    valor1 = float(input('Valor 1: '))
    valor2 = float(input('Valor 2: '))
    opcao = int(input('1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\nOpção: '))
    
    if opcao == 1:
        result = adicao(valor1, valor2)
        print(result)

    elif opcao == 2:
        result = subtracao(valor1, valor2)
        print(result)

    elif opcao == 3:
        result = multiplicacao(valor1, valor2)
        print(result)

    elif opcao == 4:
        result = divisao(valor1, valor2)
        print(result)

    else: 
        print('Opção invalida')

def adicao(valor1, valor2):
    soma = valor1 + valor2
    return soma

def subtracao(valor1, valor2):
    sub = valor1 - valor2
    return sub

def multiplicacao(valor1, valor2):
    mult = valor1 * valor2
    return mult

def divisao(valor1, valor2):
    div = valor1 / valor2
    return div

if (__name__ == "__main__"):
    calculadora()