h = float(input('Informe sua altura: '))
sexo = str(input('Sexo:\nM - masculimo\nF - feminino\nEscolha: '))

if sexo == 'M' or sexo == 'm':
    peso = (72.7 * h) - 58
    print(f'Seu peso é: {round(peso)}')

elif sexo == 'F' or sexo == 'f':
    peso = (62.1 * h) - 44.7
    print(f'Seu peso é: {round(peso)}')
else:
    print('Informe M ou F')
