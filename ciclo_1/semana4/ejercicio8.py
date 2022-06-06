uids = ['B1CD102354','B1CDEF2354','AB1023239','RAND102$']

for uid in uids:
    cond = list()

    # Por lo menos dos letras mayúsculas en el alfabero inglés
    cond.append( len(list(filter(lambda x : x.isupper(), list(uid)))) >=2)
    # Por lo menos tiene tres digitos
    cond.append( len(list(filter(lambda x : x.isdigit(), list(uid)))) >=3)
    # Solamente digitos alfanuméricos
    cond.append( len(list(filter(lambda x: not(x.isalnum()),list(uid)))) == 0)
    # Que no se repitan los caracteres
    cond.append(len(uid)== len(set(uid)))
    # Contener exactamente 10 caracteres
    cond.append(len(uid) == 10)

    print(cond)

    print('Válido' if all(cond) else 'Inválido')

