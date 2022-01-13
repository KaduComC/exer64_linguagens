def main():
    cont = True
    while cont:
        op = opcao()
        if op == 1:
            c_f()
        elif op == 2:
            f_c()
        elif op == 3:
            peso_homem()
        elif op == 4:
            peso_mulher()
        else:
            print('Opção invalida')

        op2 = input('S - s / N - n\nContinuar: ')
        if op2 == 'N' or op2 == 'n':
            cont = False


def opcao():
    opc = int(input('1 – Conversão de Graus Celsius em Graus Fahrenheit\n' +
                    '2 – Conversão de Graus Fahrenheit em Graus Celsius\n' +
                    '3 – Peso ideal do homem\n' +
                    '4 – Peso ideal da mulher\n' + 'Ecolha: '))
    return opc


def c_f():
    c = int(input('Informe o valor em graus Celsius para conversao: '))
    f = float(32 + ((9 * c) / 5))
    return print(f'Celsius para Fahrenheit: F = {f}')


def f_c():
    f = int(input('Informe o valor em graus Fahrenheit para conversao: '))
    c = float((f - 32) * 5 / 9)
    return print(f'Fahrenheit para Celsius: C = {c}')


def peso_homem():
    h = float(input('Informe sua altura: '))
    peso = (72.7 * h) - 58
    return print(f'Peso ideal é: {peso}')


def peso_mulher():
    h = float(input('Informe sua altura: '))
    peso = (62.1 * h) - 44.7
    return print(f'Peso ideal é: {peso}')


if __name__ == '__main__':
    main()
