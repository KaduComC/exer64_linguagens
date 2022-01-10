import statistics

qt_alunos = int(input('Qantidade de alunos: '))
notas = []
nomes = []

for i in range(1, qt_alunos+1):
    notas.append(float(input('Nota: ')))
    nomes.append(str(input('Nome: ')))

media2 = statistics.mean(notas)
media = sum(notas)/ qt_alunos
print(f'Média = {media}')
print(f'Média = {media2}')
