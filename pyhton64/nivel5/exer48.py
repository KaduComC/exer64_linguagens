modelo_nome = []
modelo_idade = []

for i in range(1, 20+1):
    modelo_nome.append(input('Nome:  '))
    modelo_idade.append((int(input('Idade: '))))

for z in range(len(modelo_idade)):
    if 18 <= modelo_idade[z] <= 20:
        print(f'Modelo apta: {modelo_nome[z]}')
