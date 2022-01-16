import string


n = int(input('Número de voltas: '))
voltas = []

for i in range(1, n + 1):
    voltas.append(float(input('Tempo das voltas: ')))

melhor_tempo = min(voltas)
melhor_volta = voltas.index(melhor_tempo)
melhor_volta += 1

media = sum(voltas) / n
print(f'Melhor tempo {melhor_tempo}\n na volta {melhor_volta}\nMédia de voltas: {media}')