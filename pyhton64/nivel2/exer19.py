a = int(input('Informe o lado A: '))
b = int(input('Informe o lado B: '))
c = int(input('Informe o lado C: '))

if a == b and b == c:
    print('Triângulo Equilátero')
elif a == b or a == c or b == c:
    print('Triângulo Isóceles')
else:
    print('Triângulo Escaleno')