v1 = []
v2 = []
v_iguais = 0
tamanho = 10

for i in range(1, tamanho+1):
    v1.append(int(input('Valor de v1: ')))

for i in range(1, tamanho+1):
    v2.append(int(input('Valor de v2: ')))

for z in range(len(v1)):
    if v1[z] == v2[z]:
        v_iguais += 1
print('Ordem')
print(v1)
print(v2)
print(f'Quantidade de valores iguasi: {v_iguais}')
