valor = []
a = int(input('Informe o lado A: '))
b = int(input('Informe o lado B: '))
c = int(input('Informe o lado C: '))

if a > 0 and b > 0 and c > 0:
    valor.append(a)
    valor.append(b)
    valor.append(c)
else:
    print('A, B e C devem ser maiores que 0')

valor.sort()
mul = valor[0] * valor[2]
div = valor[2] / valor[0]
print(f'Multiplicação {valor[0]} * {valor[2]} = {mul}\nDivisão {valor[2]} / {valor[0]} = {div}\n\n')