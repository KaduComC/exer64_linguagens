import numpy as np

n = int(input('Tamanho dos vetores: '))
x = []
y = []
r = []
produto = 0

for i in range(1, n + 1):
    x.append(int(input('Valor de x: ')))

for i in range(1, n + 1):
    y.append(int(input('Valor de y: ')))

produto = np.dot(x, y)

print(produto)
