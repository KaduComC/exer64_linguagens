a = []
b = []
c = []



for i in range(1, 5 + 1):
    a.append(int(input('Valores de a: ')))

for i in range(1, 8 + 1):
    b.append(int(input('Valores de b: ')))

for x in a:
    for z in b:
        if x == z:
            c.append(x)

print(c)