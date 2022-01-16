valor = []

for i in range(1, 50 + 1):
    valor.append(int(input('Valor: ')))

for i in valor:
    if i % 5 == 0:
        print(f'{i} é multiplo de 5')
    else:
        print(f'{i}')