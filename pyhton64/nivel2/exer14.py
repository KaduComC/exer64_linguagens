valor1 = int(input('Valor 1: '))
valor2 = int(input('Valor 2: '))

if valor1 < valor2:
    n = valor2 - valor1
    print(f'Diferença: {n}')
elif valor2 < valor1:
    n = valor1 - valor2
    print(f'Diferença: {n}')