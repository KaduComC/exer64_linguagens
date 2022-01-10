valor1 = int(input('Primeiro valor: '))
valor2 = int(input('Segundo valor: '))

igual = False
nao_igual = False
maior = False
menor = False
maior_igual = False
menor_igual = False

if valor1 == valor2: igual = True
if valor1 != valor2: igual = True
if valor1 > valor2: igual = True
if valor1 < valor2: igual = True
if valor1 >= valor2: igual = True
if valor1 <= valor2: igual = True

print(f'Igual: {igual}')
print(f'Não igual: {nao_igual}')
print(f'Maior: {maior}')
print(f'Menor: {menor}')
print(f'Maior ou igual: {maior_igual}')
print(f'Menor ou igual: {menor_igual}')

