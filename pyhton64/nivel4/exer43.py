soma = 1
inicio = 1
for i in range(1, 64 + 1):
    inicio *= 2
    soma += inicio
    print(f'Casa {i} tem {inicio} de grãos')
print(f'{soma}')
