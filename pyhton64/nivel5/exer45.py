vetor = int(input('Tamanho do vetor: '))
n = []

for i in range(1, vetor + 1):
    n.append(int(input('Valor do vetor: ')))

n.sort(reverse=True)
print(n)
