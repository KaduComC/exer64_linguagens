print('0 para')
valor = int(input('Valor: '))
maior = menor = valor
if valor != 0:
    while valor != 0:
        valor = int(input('Valor: '))

        if valor > maior:
            maior = valor
        elif valor < menor:
            menor = valor
    print(f'Maior: {maior}\nMenor: {menor}')
else:
    print('Saida')
