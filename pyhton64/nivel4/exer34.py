qtd = int(input('Informe a quantidade de valores: '))
valor = []

for i in range(qtd):
    valor.append(int(input('Valor: ')))
    if i < 0:
        break

print(f'\nMaior: {max(valor)}\nMenor: {min(valor)}')





# Escreva  um  programa  que  leia  um  conjunto  de  números  
# positivos  e  exiba  o  menor  e  o  maior.  Suporemos  que  o 
# número de elementos deste conjunto  não é conhecido, e que um 
# número negativo será  utilizado para sinalizar  o 
# fim dos dados.