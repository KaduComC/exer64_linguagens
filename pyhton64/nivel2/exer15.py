n1 = float(input('Nota 1: '))
n2 = float(input('Nota 2: '))
n3 = float(input('Nota 3: '))
n4 = float(input('Nota 4: '))

media = (n1 + n2 + n3 + n4) / 4

if media >= 7: 
    print('Aluno aprovado')
else:
    n_r = float(input('Nota de recuperação: '))
    nova_media = (media + n_r) / 2
    if nova_media >= 7:
        print('Aluno aprovado na recuperação')
    else:
        print(f'Aluno não foi aprovado na recuperação.\n Média = {nova_media}')
