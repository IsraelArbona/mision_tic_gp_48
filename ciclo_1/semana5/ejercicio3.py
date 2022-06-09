# libreria pandas - exportar a excel
# Indicación, tener en cuenta instalar openyyxl
# pip install openpyxl

import pandas as pd

datos = {
    'first_name': ['Sigrid', 'Joe', 'Theodoric','Kennedy', 'Beatrix', 'Olimpia', 'Grange', 'Sallee'],
    'last_name': ['Mannock', 'Hinners', 'Rivers', 'Donnell', 'Parlett', 'Guenther', 'Douce', 'Johnstone'],
    'age': [27, 31, 36, 53, 48, 36, 40, 34],
    'amount_1': [7.17, 1.90, 1.11, 1.41, 6.69, 4.62, 1.01, 4.88],
    'amount_2': [8.06,  "?", 5.90,  "?",  "?", 7.48, 4.37,  "?"]
    }

datosDataFrame = pd.DataFrame(datos, columns=['first_name','last_name','age','amount_1','amount_2'])

ruta = r'C:\Users\israelarbonaguerrero\Desktop\RUTA2_MISIONTIC_2022\grupo_48\ciclo_1\semana5\archivo.xlsx'
datosDataFrame.to_excel(ruta, sheet_name='personas')
