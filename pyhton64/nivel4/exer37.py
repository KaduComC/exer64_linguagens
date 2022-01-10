def main():
    continua = False
    while continua == False:
        op = opcao1()
        if op == 1:
            valor1 = float(input('Valor 1: '))
            valor2 = float(input('Valor 1: '))
            adicao(valor1, valor2)

        elif op == 2:
            valor1 = float(input('Valor 1: '))
            valor2 = float(input('Valor 1: '))
            subtracao(valor1, valor2)

        elif op == 3:
            valor1 = float(input('Valor 1: '))
            valor2 = float(input('Valor 1: '))
            multiplicacao(valor1, valor2)

        elif op == 4:
            valor1 = float(input('Valor 1: '))
            valor2 = float(input('Valor 1: '))
            divisao(valor1, valor2)
        else: 
            print(('Opção invalida'))
        op2 = opcao2()
        if op2 == 'N' or op2 == 'n': 
            continua = True

def opcao1():
    opc = int(input('1 – Adição\n'+
        '2 – Subtração\n'+
        '3 – Multiplicação\n'+ 
        '4 – Divisão\n'+
        'Informe a opção: '))
    return opc

def opcao2():
    opc = str(input('\nS - s / N - n\nDeseja continuar? '))
    return opc

def adicao(valor1, valor2):
    soma = valor1 + valor2
    return print(f'Resultado: {soma}')

def subtracao(valor1, valor2):
    sub = valor1 - valor2
    return print(f'Resultado: {sub}')

def multiplicacao(valor1, valor2):
    mult = valor1 * valor2
    return print(f'Resultado: {mult}')

def divisao(valor1, valor2):
    div = valor1 / valor2
    return print(f'Resultado: {div}')

if __name__ == ("__main__"):
    main()