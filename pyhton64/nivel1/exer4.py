a = int(input('Valor de A: '))
b = int(input('Valor de B: '))
c = int(input('Valor de C: '))
d = int(input('Valor de D: '))

s1 = a + b
s2 = a + c
s3 = a + d
s4 = b + c
s5 = b + d
s6 = c + d

m1 = a * b
m2 = a * c
m3 = a * d
m4 = b * c
m5 = b * d
m6 = c * d

print(f'Soma | Multiplicação\n' + 
    f'{s1} | {m1}\n' +
    f'{s2} | {m2}\n' +
    f'{s3} | {m3}\n' +
    f'{s4} | {m4}\n' +
    f'{s5} | {m5}\n' +
    f'{s6} | {m6}\n')