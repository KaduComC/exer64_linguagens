alunos_numero = int(input('Informe a quantidade de alunos: '))
notas = []
maior = 1
menor = 1

for i in range(1, alunos_numero + 1):
    notas.append(float(input('Notas: ')))

for x in range(len(notas)):
    if notas[x] > 7:
        maior += maior
        strCima = f'Quantidade de notas maiores que 7: {maior}'
    elif notas[x] <= 5:
        menor += menor
        strBaixo = f'Não há nenhum aluno com nota acima de 5'

media = sum(notas) / alunos_numero

for i in range(len(notas)):
    if notas[i] > 7:
        print(f'{strCima}\nMédia: {media}')
    elif notas[i] <= 5:
        print(f'{strBaixo}\nMédia: {media}')