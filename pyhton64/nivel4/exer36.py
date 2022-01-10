qtd = 10
valor = []
for i in range(qtd):
    valor.append(int(input('Valores: ')))

media = sum(valor) / len(valor)
print(f'Maior: {max(valor)}\nMenor: {min(valor)}\nMédia: {media}')