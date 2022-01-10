valor1 = int(input('Primeiro valor: '))
valor2 = int(input('Segundo valor: '))

if valor1 > valor2:
    print(f'Maior {valor1}\nMenor {valor2}')
elif valor2 > valor1:
    print(f'Maior {valor2}\nMenor {valor1}')
else:
    print('São iguais')