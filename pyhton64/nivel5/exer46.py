import numpy as np

n = int(input('Tamanho dos vetores: '))
x = []
y = []
produto = 0

for i in range(1, n + 1):
    x.append(int(input('Valores de x: ')))

for i in range(1, n + 1):
    y.append(int(input('Valores de y: ')))

produto = np.dot(x, y)

print(produto)
