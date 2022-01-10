continuar = True

while continuar == True:
    c = input('Código: ')
    n = int(input('Numero de horas: '))
    salario = n * 10

    if n > 50:
        e = n - 50
        salario_exe = e * 20
        print(f'Código: {c}\nSalario: {salario}'+
            f'\nHoras exedente: {e}\nSalario com hras exedentes: {salario + salario_exe}')

    else:
        print(f'Código: {c}\nSalario: {salario}')

    opc = str(input('\nS - s / N - n\Continuar? '))
    if opc == 'N' or opc == 'n':
        continuar = False