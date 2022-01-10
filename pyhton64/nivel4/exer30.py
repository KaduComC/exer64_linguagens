valor = int(input('Informe o número para a tabuada: '))

for i in range(0, 10+1):
    tabuada = valor * i
    print(f'{valor} * {i} = {tabuada}')