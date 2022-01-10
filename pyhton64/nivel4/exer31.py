numero = 0; qt_par = 0; soma_par = 0; qt_impar = 0; soma_impar = 0

while numero >= 0:
    numero = int(input('Informe o número: '))

    if numero >= 0:
        if numero % 2 == 0:
            qt_par += 1
            soma_par += numero
            print('Par')
        if numero % 2 == 1:
            qt_impar += 1
            soma_impar += numero
            print('Impar')
    else:
        break

print(f'\nPares: {qt_par}\nImpares: {qt_impar}')
print(f'\nSoma dos pares: {soma_par}\nSoma dos impares: {soma_impar}')

