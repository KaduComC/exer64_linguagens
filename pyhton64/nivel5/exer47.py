vetor = []
x = int(input('Valor de X: '))
maior = menor = igual = 0

for i in range(1, 10 + 1):
    vetor.append(int(input('Informe valor: ')))

for z in range(len(vetor)):
    if vetor[z] > x:
        maior += 1
    elif vetor[z] < x:
        menor += 1
    elif vetor[z] == x:
        igual += 1

print('Vetor organizado:')
vetor.sort()
print(vetor)

print(f'\nMaiores que x: {maior}\nMenores que x: {menor}\nIguais a x: {igual}')
